(function () {
  "use strict";

  var reduceMotion = window.matchMedia("(prefers-reduced-motion: reduce)").matches;

  var navLinks = Array.prototype.slice.call(document.querySelectorAll(".nav__links a"));
  var sections = navLinks
    .map(function (link) {
      var id = link.getAttribute("href");
      return id && id.length > 1 ? document.querySelector(id) : null;
    })
    .filter(Boolean);

  var nav = document.querySelector(".nav");

  function navOffset() {
    return nav ? nav.getBoundingClientRect().height + 8 : 0;
  }

  function scrollToTarget(el) {
    var top = el.getBoundingClientRect().top + window.pageYOffset - navOffset();
    window.scrollTo({ top: Math.max(top, 0), behavior: reduceMotion ? "auto" : "smooth" });
  }

  navLinks.forEach(function (link) {
    link.addEventListener("click", function (event) {
      var id = link.getAttribute("href");
      var target = id && id.length > 1 ? document.querySelector(id) : null;
      if (!target) return;
      event.preventDefault();
      scrollToTarget(target);
      history.replaceState(null, "", id);
    });
  });

  var activeLink = null;

  function setActive(id) {
    if (id === activeLink) return;
    activeLink = id;
    navLinks.forEach(function (link) {
      link.classList.toggle("is-active", link.getAttribute("href") === id);
    });
  }

  var ticking = false;

  function onScroll() {
    if (ticking) return;
    ticking = true;
    window.requestAnimationFrame(function () {
      var probe = window.pageYOffset + navOffset() + 24;
      var current = "#" + window.location.hash.replace("#", "");
      var found = current && sections.some(function (s) { return "#" + s.id === current; })
        ? current
        : null;

      if (!found) {
        for (var i = 0; i < sections.length; i++) {
          if (sections[i].offsetTop <= probe) found = "#" + sections[i].id;
        }
        if (!found && sections.length) found = "#" + sections[0].id;
      }

      setActive(found);
      ticking = false;
    });
  }

  window.addEventListener("scroll", onScroll, { passive: true });
  window.addEventListener("resize", onScroll, { passive: true });
  onScroll();

  var filterButtons = Array.prototype.slice.call(document.querySelectorAll(".filters__btn"));
  var projects = Array.prototype.slice.call(document.querySelectorAll(".project[data-category]"));

  filterButtons.forEach(function (button) {
    button.addEventListener("click", function () {
      var filter = button.getAttribute("data-filter") || "all";
      filterButtons.forEach(function (b) {
        b.classList.toggle("is-active", b === button);
      });
      projects.forEach(function (project) {
        var match = filter === "all" || project.getAttribute("data-category") === filter;
        project.classList.toggle("is-hidden", !match);
      });
    });
  });

  var cards = Array.prototype.slice.call(document.querySelectorAll(".project"));

  cards.forEach(function (card) {
    var details = card.querySelector("details");
    var summary = card.querySelector(".details__summary");
    if (!details || !summary) return;

    var label = summary.textContent;

    summary.addEventListener("click", function (event) {
      event.preventDefault();
      var open = details.classList.toggle("is-open");
      details.open = open;
      summary.textContent = open ? "Hide details" : label;
      card.classList.toggle("is-expanded", open);
    });
  });

  var lightbox = document.createElement("div");
  lightbox.className = "lightbox";
  lightbox.setAttribute("role", "dialog");
  lightbox.setAttribute("aria-modal", "true");
  lightbox.setAttribute("aria-label", "Screenshot preview");

  var lightboxImage = document.createElement("img");
  lightboxImage.className = "lightbox__image";
  lightboxImage.setAttribute("alt", "");

  var lightboxCaption = document.createElement("p");
  lightboxCaption.className = "lightbox__caption";

  var lightboxClose = document.createElement("button");
  lightboxClose.type = "button";
  lightboxClose.className = "lightbox__close";
  lightboxClose.setAttribute("aria-label", "Close screenshot preview");
  lightboxClose.textContent = "\u00d7";

  lightbox.appendChild(lightboxImage);
  lightbox.appendChild(lightboxCaption);
  lightbox.appendChild(lightboxClose);
  document.body.appendChild(lightbox);

  var lastFocused = null;

  function closeLightbox() {
    if (!lightbox.classList.contains("is-open")) return;
    lightbox.classList.remove("is-open");
    document.body.style.removeProperty("overflow");
    if (lastFocused && typeof lastFocused.focus === "function") lastFocused.focus();
    lastFocused = null;
  }

  function openLightbox(trigger) {
    var src = trigger.getAttribute("data-lightbox-src");
    if (!src) return;
    var alt = trigger.getAttribute("data-lightbox-alt") || "";
    lastFocused = trigger;
    lightboxImage.setAttribute("src", src);
    lightboxImage.setAttribute("alt", alt);
    lightboxCaption.textContent = alt;
    lightbox.classList.add("is-open");
    document.body.style.overflow = "hidden";
    lightboxClose.focus();
  }

  var thumbs = Array.prototype.slice.call(document.querySelectorAll(".gallery__thumb, .project__thumb"));

  thumbs.forEach(function (thumb) {
    thumb.addEventListener("click", function () {
      openLightbox(thumb);
    });
  });

  lightbox.addEventListener("click", function (event) {
    if (event.target === lightbox) closeLightbox();
  });

  lightboxClose.addEventListener("click", closeLightbox);

  document.addEventListener("keydown", function (event) {
    if (event.key === "Escape") closeLightbox();
  });

  var revealTargets = Array.prototype.slice.call(
    document.querySelectorAll(".section > *, .hero > *")
  );

  revealTargets.forEach(function (el) {
    el.classList.add("reveal");
  });

  if (!reduceMotion && "IntersectionObserver" in window) {
    var revealObserver = new IntersectionObserver(
      function (entries) {
        entries.forEach(function (entry) {
          if (!entry.isIntersecting) return;
          entry.target.classList.add("is-visible");
          revealObserver.unobserve(entry.target);
        });
      },
      { rootMargin: "0px 0px -8% 0px", threshold: 0.08 }
    );

    revealTargets.forEach(function (el) {
      revealObserver.observe(el);
    });
  } else {
    revealTargets.forEach(function (el) {
      el.classList.add("is-visible");
    });
  }

  var glow = document.createElement("div");
  glow.className = "cursor-glow";
  glow.setAttribute("aria-hidden", "true");
  document.body.appendChild(glow);

  if (!reduceMotion && window.matchMedia("(hover: hover) and (pointer: fine)").matches) {
    var glowX = window.innerWidth / 2;
    var glowY = window.innerHeight / 2;
    var glowTicking = false;

    window.addEventListener(
      "mousemove",
      function (event) {
        glowX = event.clientX;
        glowY = event.clientY;
        if (glowTicking) return;
        glowTicking = true;
        window.requestAnimationFrame(function () {
          glow.style.transform = "translate3d(" + glowX + "px, " + glowY + "px, 0) translate(-50%, -50%)";
          glowTicking = false;
        });
      },
      { passive: true }
    );
  } else {
    glow.remove();
  }
})();
