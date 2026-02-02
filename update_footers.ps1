$postsDir = "c:\Users\pablo\Documents\DAW\Programacion2526\posts"

$newFooter = @"
  <!-- Premium Footer -->
  <footer class="site-footer">
      <div class="footer-content">
          <div class="footer-brand">
              <h3>Pablo Jiménez</h3>
              <p>Desarrollo de Aplicaciones Web (DAW)</p>
              <p>© 2025 Blog Programación</p>
          </div>
          <div class="footer-links">
              <a href="https://github.com/pjimpin1207" target="_blank" class="footer-btn">
                  <span>GitHub ↗</span>
              </a>
              <a href="https://pjimpin1207.github.io/DIWEB/" target="_blank" class="footer-btn">
                  <span>Blog DIWEB ↗</span>
              </a>
          </div>
      </div>
  </footer>
"@

# Get all HTML files recursively
$files = Get-ChildItem -Path $postsDir -Recurse -Filter *.html

foreach ($file in $files) {
    Write-Host "Processing $($file.FullName)"
    
    # Read file content
    $content = Get-Content -Path $file.FullName -Raw -Encoding UTF8
    
    # Define regex to match existing footer
    # (?s) enables single-line mode (dot matches newlines)
    # Match <footer... to </footer>
    $regex = '(?s)<footer.*?</footer>'
    
    if ($content -match $regex) {
        Write-Host "  Replacing existing footer..."
        $content = $content -replace $regex, $newFooter
    } else {
        Write-Host "  No footer found. Appending before </body>..."
        # Insert before </body>
        if ($content -match '</body>') {
             $content = $content -replace '</body>', "$newFooter`n</body>"
        } else {
             # If no body tag, just append (fallback)
             $content += "`n$newFooter"
        }
    }
    
    # Save back to file
    $content | Set-Content -Path $file.FullName -Encoding UTF8
}

Write-Host "Footer update complete."
