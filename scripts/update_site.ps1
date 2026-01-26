$ErrorActionPreference = "Stop"
$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
$BaseDir = Split-Path -Parent $ScriptDir
$PostsDir = Join-Path $BaseDir "posts"

# Char codes to avoid parser errors
$LT = [char]60  # <
$GT = [char]62  # >
$LB = [char]123 # {
$RB = [char]125 # }

Write-Host "Starting Update..."

$TemplatePost = Get-Content (Join-Path $ScriptDir "template_post.html") -Raw -Encoding utf8
$TemplateIndex = Get-Content (Join-Path $ScriptDir "template_index.html") -Raw -Encoding utf8

$Files = Get-ChildItem -Path $PostsDir -Recurse -Filter "*.html"

# Define tokens dynamically
$TokenTitle = "$LB$LB" + "TITLE" + "$RB$RB"
$TokenDesc  = "$LB$LB" + "DESCRIPTION" + "$RB$RB"
$TokenH_Title = "$LB$LB" + "HEADER_TITLE" + "$RB$RB"
$TokenMeta  = "$LB$LB" + "META" + "$RB$RB"
$TokenBody  = "$LB$LB" + "BODY_CONTENT" + "$RB$RB"
$TokenGrid  = "$LB$LB" + "GRID_CONTENT" + "$RB$RB"

foreach ($File in $Files) {
    Write-Host "Processing: $($File.Name)"
    $Content = Get-Content $File.FullName -Raw -Encoding utf8
    
    $Title = "Blog Post"
    $Description = ""
    $HeaderTitle = ""
    
    # patterns
    $bs = "\" # backslash
    
    # Title: <title>(.*?)</title>
    $pTitle = "$LT" + "title" + "$GT" + "(.*?)" + "$LT" + "/title" + "$GT"
    $mTitle = [regex]::Match($Content, $pTitle, 'IgnoreCase')
    if ($mTitle.Success) { $Title = $mTitle.Groups[1].Value }
    
    # Desc: <meta name="description" content="(.*?)">
    $pDesc = "$LT" + "meta name=" + [char]34 + "description" + [char]34 + " content=" + [char]34 + "(.*?)" + [char]34 + "$GT"
    $mDesc = [regex]::Match($Content, $pDesc, 'IgnoreCase')
    if ($mDesc.Success) { 
        $Description = $mDesc.Groups[1].Value 
    } else {
        # Fallback to subtitle
        $pSub = "$LT" + "p class=" + [char]34 + "subtitle" + [char]34 + "$GT" + "(.*?)" + "$LT" + "/p" + "$GT"
        $mSub = [regex]::Match($Content, $pSub, 'IgnoreCase')
        if ($mSub.Success) { $Description = $mSub.Groups[1].Value }
    }
    
    $HeaderTitle = $Title
    
    # H1
    $pH1 = "$LT" + "header class=" + [char]34 + "header" + [char]34 + "$GT" + ".*?" + "$LT" + "h1" + "$GT" + "(.*?)" + "$LT" + "/h1" + "$GT"
    $mH1 = [regex]::Match($Content, $pH1, 'Singleline,IgnoreCase')
    if (!$mH1.Success) { 
        $pH1Simp = "$LT" + "h1" + "$GT" + "(.*?)" + "$LT" + "/h1" + "$GT"
        $mH1 = [regex]::Match($Content, $pH1Simp, 'IgnoreCase') 
    }
    if ($mH1.Success) { $HeaderTitle = $mH1.Groups[1].Value }

    $NewContent = ""
    $IsIndex = ($File.Name -eq "index.html")

    if ($IsIndex) {
        # H2 in section
        $pH2 = "$LT" + "section class=" + [char]34 + "tema-section" + [char]34 + "$GT" + ".*?" + "$LT" + "h2" + "$GT" + "(.*?)" + "$LT" + "/h2" + "$GT"
        $mH2 = [regex]::Match($Content, $pH2, 'Singleline,IgnoreCase')
        if ($mH2.Success) { $HeaderTitle = $mH2.Groups[1].Value }
        
        $GridContent = ""
        $pGrid = "$LT" + "div class=" + [char]34 + "grid" + [char]34 + "$GT" + "(.+?)" + "$LT" + "/div" + "$GT" + "\s*" + "$LT" + "/section" + "$GT"
        $mGrid = [regex]::Match($Content, $pGrid, 'Singleline,IgnoreCase')
        if (!$mGrid.Success) {
             # Simple grid
             $pGridSimple = "$LT" + "div class=" + [char]34 + "grid" + [char]34 + "$GT" + "(.+?)" + "$LT" + "/div" + "$GT"
             $mGrid = [regex]::Match($Content, $pGridSimple, 'Singleline,IgnoreCase')
        }
        
        if ($mGrid.Success) {
            $raw = $mGrid.Groups[1].Value.Trim()
            $GridContent = $raw.Replace('class="btn"', 'class="card-link"').Replace('Leer más', 'Leer artículo ->')
        } else {
             Write-Host "Skipping $($File.Name) - No Grid found"
             continue
        }
        
        $NewContent = $TemplateIndex.Replace($TokenTitle, $Title)
        $NewContent = $NewContent.Replace($TokenDesc, $Description)
        $NewContent = $NewContent.Replace($TokenH_Title, $HeaderTitle)
        $NewContent = $NewContent.Replace($TokenGrid, $GridContent)
        
    } else {
        # Meta
        $Meta = "Publicado por pjimpin1207"
        $pMeta = "$LT" + "p class=" + [char]34 + "meta" + [char]34 + "$GT" + "(.*?)" + "$LT" + "/p" + "$GT"
        $mMeta = [regex]::Match($Content, $pMeta, 'IgnoreCase')
        if ($mMeta.Success) { $Meta = $mMeta.Groups[1].Value }
        
        $BodyContent = ""
        $pBody = "$LT" + "div class=" + [char]34 + "post-body" + [char]34 + "$GT" + "(.+?)" + "$LT" + "/div" + "$GT" + "\s*" + "$LT" + "/article" + "$GT"
        $mBody = [regex]::Match($Content, $pBody, 'Singleline,IgnoreCase')
        if (!$mBody.Success) {
            $pBody2 = "$LT" + "div class=" + [char]34 + "post-body" + [char]34 + "$GT" + "(.+?)" + "$LT" + "/div" + "$GT" + "\s*" + "$LT" + "div class=" + [char]34 + "back" + [char]34 + "$GT"
            $mBody = [regex]::Match($Content, $pBody2, 'Singleline,IgnoreCase')
        }
        
        if (!$mBody.Success) {
            # Try Tema3 style: <article class="post"> ... <div class="back">
            $pBody3 = "$LT" + "article class=" + [char]34 + "post" + [char]34 + "$GT" + "(.+?)" + "$LT" + "div class=" + [char]34 + "back" + [char]34 + "$GT"
            $mBody = [regex]::Match($Content, $pBody3, 'Singleline,IgnoreCase')
        }
        
        if ($mBody.Success) {
            $BodyContent = $mBody.Groups[1].Value.Trim()
            # Clean up rogue tags
            $BodyContent = $BodyContent.Replace("$LT/article$GT", "").Trim()
            $BodyContent = $BodyContent.Replace("$LT/div$GT", "").Trim() 
            # Note: Removing </div> blindly might break internal divs? 
            # But the captured content was '(.+?)' which ends at the delimiter. 
            # If the extraction included the closing tag of the main container, we remove it.
            # For Tema3, we captured `... </article>`.
            # For others, we captured logic inside div.
        } else {
            Write-Host "Skipping $($File.Name) - No Body found"
            continue
        }
        
        $NewContent = $TemplatePost.Replace($TokenTitle, $Title)
        $NewContent = $NewContent.Replace($TokenDesc, $Description)
        $NewContent = $NewContent.Replace($TokenH_Title, $HeaderTitle)
        $NewContent = $NewContent.Replace($TokenMeta, $Meta)
        $NewContent = $NewContent.Replace($TokenBody, $BodyContent)
    }
    
    Set-Content -Path $File.FullName -Value $NewContent -Encoding utf8
}

Write-Host "Done!"
