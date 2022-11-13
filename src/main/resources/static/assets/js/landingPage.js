const menuLinks = document.querySelectorAll('.nav-bar a[href^="#"]');

function getDistanceFromTheTop(element) {
    const id = element.getAttribute("href");
    return document.querySelector(id).offsetTop;
}

// function nativeScroll(distanceFromTheTop) {
//     window.scroll({
//         top: distanceFromTheTop,
//         behavior: "smooth",
//     });

// }

function scrollToSection(event) {
    event.preventDefault();
    const distanceFromTheTop = getDistanceFromTheTop(event.target) - 200;
    smoothScrollTo(0, distanceFromTheTop,)
}

     // Identificando click do usuario em cada um dos links
menuLinks.forEach((link) => {
   link.addEventListener("click", scrollToSection);
    
});

function smoothScrollTo(endX, endY, duration) {
    const startX = window.scrollX || window.pageXOffset;
    const startY = window.scrollY || window.pageYOffset;
    const distanceX = endX - startX;
    const distanceY = endY - startY;
    const startTime = new Date().getTime();
  
    duration = typeof duration !== "undefined" ? duration : 400;
  
    const easeInOutQuart = (time, from, distance, duration) => {
      if ((time /= duration / 2) < 1)
        return (distance / 2) * time * time * time * time + from;
      return (-distance / 2) * ((time -= 2) * time * time * time - 2) + from;
    };
  
    const timer = setInterval(() => {
      const time = new Date().getTime() - startTime;
      const newX = easeInOutQuart(time, startX, distanceX, duration);
      const newY = easeInOutQuart(time, startY, distanceY, duration);
      if (time >= duration) {
        clearInterval(timer);
      }
      window.scroll(newX, newY);
    }, 1000 / 60);
  }

// MENU-MOBILE

function menuShow() {
  let menuMobile = document.querySelector('.mobile-menu');
  if (menuMobile.classList.contains('open')){
      menuMobile.classList.remove('open');
      document.querySelector('.icon').src = "assets/img/menu_white_36dp.svg";
  }else {
    menuMobile.classList.add('open');
    document.querySelector('.icon').src = "assets/img/close_white_36dp.svg";
  }
}

// Desenvolvido por Kaique Oliveira 
 
