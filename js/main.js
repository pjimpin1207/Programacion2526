/**
 * BLOG PROGRAMACIÓN - MAIN LOGIC
 * Handles Theme Toggle & Search
 */

document.addEventListener('DOMContentLoaded', () => {
  initThemeToggle();
  initSearch();
  initTypewriter();
  initPostCounter();
  initCodeBlocks();
});

/* --- THEME TOGGLE LOGIC --- */
// Quick synchronous run to prevent FOUC where possible
(function immediateThemeLoad() {
  const storedTheme = localStorage.getItem('theme');
  const systemPrefersDark = window.matchMedia('(prefers-color-scheme: dark)').matches;
  const currentTheme = storedTheme ? storedTheme : (systemPrefersDark ? 'dark' : 'light');
  document.documentElement.setAttribute('data-theme', currentTheme);
})();

function initThemeToggle() {
  const btn = document.getElementById('theme-toggle');
  if (!btn) return;
  
  btn.addEventListener('click', () => {
    let currentTheme = document.documentElement.getAttribute('data-theme');
    const newTheme = currentTheme === 'dark' ? 'light' : 'dark';
    document.documentElement.setAttribute('data-theme', newTheme);
    localStorage.setItem('theme', newTheme);
  });
}


/* --- DYNAMIC POST COUNTER --- */
function initPostCounter() {
  const counterEl = document.querySelector('.stat-val');
  const posts = document.querySelectorAll('.post-card');
  if (counterEl && posts.length > 0) {
    counterEl.textContent = posts.length;
  }
}

/* --- TYPEWRITER EFFECT --- */
function initTypewriter() {
  const textElement = document.getElementById('looping-typewriter');
  if (!textElement) {
    console.warn('Typewriter element not found');
    return;
  }

  // Split by specific characters/emojis
  const text = "¡Hola! Soy Pablo 👋";
  const chars = [...text]; // Spread operator handles surrogate pairs correctly

  let charIndex = 0;
  let isDeleting = false;

  function typeLoop() {
    // Construct current string
    const currentText = chars.slice(0, charIndex).join('');
    textElement.textContent = currentText;

    // Determine speed
    let typeSpeed = isDeleting ? 40 : 100;

    if (!isDeleting && charIndex === chars.length) {
      // Finished typing
      typeSpeed = 2500; // Wait 2.5s
      isDeleting = true;
    } else if (isDeleting && charIndex === 0) {
      // Finished deleting
      isDeleting = false;
      typeSpeed = 500; // Wait 0.5s
    }

    // Increment/Decrement
    if (isDeleting) {
      charIndex--;
    } else {
      charIndex++;
    }

    setTimeout(typeLoop, typeSpeed);
  }

  // Start
  typeLoop();
}



/* --- SEARCH FUNCTIONALITY --- */
function initSearch() {
  const searchInput = document.getElementById('search-input');
  const cards = document.querySelectorAll('.post-card'); // Updated selector for new design
  const noResultsMsg = document.getElementById('no-results');

  if (!searchInput) return;

  searchInput.addEventListener('input', (e) => {
    const query = e.target.value.toLowerCase().trim();
    let hasResults = false;

    cards.forEach(card => {
      const title = card.querySelector('.post-title')?.textContent.toLowerCase() || '';
      const summary = card.querySelector('.post-desc')?.textContent.toLowerCase() || '';

      if (title.includes(query) || summary.includes(query)) {
        card.style.display = 'flex';
        hasResults = true;
      } else {
        card.style.display = 'none';
      }
    });

    if (noResultsMsg) {
      noResultsMsg.style.display = hasResults ? 'none' : 'block';
    }
  });
}

/* --- CODE BLOCKS FORMATTING --- */
function initCodeBlocks() {
  const codeBlocks = document.querySelectorAll("pre code");

  if (!codeBlocks || codeBlocks.length === 0) return;

  codeBlocks.forEach(function (codeBlock) {
    // Get the raw text to copy (ignoring HTML tags we are about to add)
    const rawCode = codeBlock.textContent;

    // Split by newlines for numbering
    let lines = rawCode.split('\n');

    // Remove first line if it's completely empty to avoid leading empty line number
    if (lines[0].trim() === '') {
      lines.shift();
    }

    // Remove last line if it's completely empty to avoid trailing empty line number
    if (lines.length > 0 && lines[lines.length - 1].trim() === '') {
      lines.pop();
    }

    let numberedCode = '';
    // Use innerText directly inside a text node or safely encode
    lines.forEach((line, index) => {
      // Escape HTML characters to avoid rendering issues
      let escapedLine = line.replace(/&/g, "&amp;").replace(/</g, "&lt;").replace(/>/g, "&gt;");
      // Ensure empty lines keep their height
      if (escapedLine.length === 0) escapedLine = ' ';
      numberedCode += `<span class="line-number">${index + 1}</span><span class="line-content">${escapedLine}</span>\n`;
    });

    codeBlock.innerHTML = numberedCode;
    codeBlock.classList.add("numbered-code");

    // Add copy button
    const pre = codeBlock.parentElement;

    // Wrap pre in relative container to position copy button
    if (pre.parentElement.classList.contains("code-wrapper")) return;

    const wrapper = document.createElement("div");
    wrapper.className = "code-wrapper";
    wrapper.style.position = "relative";
    wrapper.style.margin = "2rem 0";
    
    // Reset pre margin since wrapper handles it
    pre.style.margin = "0";

    pre.parentNode.insertBefore(wrapper, pre);
    wrapper.appendChild(pre);

    const copyBtn = document.createElement("button");
    copyBtn.className = "copy-btn";
    copyBtn.innerText = "Copiar";

    copyBtn.addEventListener("click", function () {
      navigator.clipboard.writeText(rawCode).then(() => {
        copyBtn.innerText = "¡Copiado!";
        copyBtn.style.background = "#2e7d32";
        setTimeout(() => {
          copyBtn.innerText = "Copiar";
          copyBtn.style.background = ""; // Restore via CSS
        }, 2000);
      }).catch(err => {
        console.error("Error al copiar texto: ", err);
      });
    });

    wrapper.appendChild(copyBtn);
  });
}
