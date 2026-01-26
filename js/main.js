/**
 * BLOG PROGRAMACIÓN - MAIN LOGIC
 * Handles Theme Toggle & Search
 */

document.addEventListener('DOMContentLoaded', () => {
  initTheme();
  initSearch();
  initTypewriter();
});

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

/* --- THEME TOGGLE --- */
function initTheme() {
  const toggleBtn = document.getElementById('theme-toggle');
  if (!toggleBtn) return;
  const iconSpan = toggleBtn.querySelector('.icon');

  // Check persisted preference
  const savedTheme = localStorage.getItem('theme');
  const prefersDark = window.matchMedia('(prefers-color-scheme: dark)').matches;

  // Since we default to dark now in HTML, align UI
  if (savedTheme === 'light') {
    document.documentElement.setAttribute('data-theme', 'light');
    updateIcon(false);
  } else {
    document.documentElement.setAttribute('data-theme', 'dark');
    updateIcon(true);
  }

  toggleBtn.addEventListener('click', () => {
    const currentTheme = document.documentElement.getAttribute('data-theme');
    const newTheme = currentTheme === 'dark' ? 'light' : 'dark';

    document.documentElement.setAttribute('data-theme', newTheme);
    localStorage.setItem('theme', newTheme);
    updateIcon(newTheme === 'dark');
  });

  function updateIcon(isDark) {
    if (iconSpan) iconSpan.textContent = isDark ? '🌙' : '☀️';
  }
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
