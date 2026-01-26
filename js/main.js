/**
 * BLOG PROGRAMACIÓN - MAIN LOGIC
 * Handles Theme Toggle & Search
 */

document.addEventListener('DOMContentLoaded', () => {

  initSearch();
  initTypewriter();
  initPostCounter();
});

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
