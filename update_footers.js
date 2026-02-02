const fs = require('fs');
const path = require('path');

const postsDir = 'c:\\Users\\pablo\\Documents\\DAW\\Programacion2526\\posts';

const newFooter = `
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
  </footer>`;

function getAllHtmlFiles(dirPath, arrayOfFiles) {
  const files = fs.readdirSync(dirPath);

  arrayOfFiles = arrayOfFiles || [];

  files.forEach(function(file) {
    if (fs.statSync(dirPath + "/" + file).isDirectory()) {
      arrayOfFiles = getAllHtmlFiles(dirPath + "/" + file, arrayOfFiles);
    } else {
      if (file.endsWith('.html')) {
        arrayOfFiles.push(path.join(dirPath, "/", file));
      }
    }
  });

  return arrayOfFiles;
}

const htmlFiles = getAllHtmlFiles(postsDir);
console.log(`Found ${htmlFiles.length} HTML files.`);

htmlFiles.forEach(file => {
  let content = fs.readFileSync(file, 'utf8');
  
  // Regex to find existing footer (greedy or non-greedy depending on need, usually non-greedy)
  // Matching <footer ... > ... </footer>
  const footerRegex = /<footer[\s\S]*?<\/footer>/i;
  
  if (footerRegex.test(content)) {
    console.log(`Updating footer in: ${file}`);
    content = content.replace(footerRegex, newFooter);
  } else {
    console.log(`Appending footer (none found) in: ${file}`);
    // Insert before </body> if no footer exists
    content = content.replace('</body>', `${newFooter}\n</body>`);
  }

  fs.writeFileSync(file, content, 'utf8');
});

console.log('Footer update complete.');
