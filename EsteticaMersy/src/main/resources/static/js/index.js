function showContent(sectionId) {
    const sections = document.querySelectorAll('.contenido section');
    sections.forEach(section => {
        section.classList.remove('active');
    });
    document.getElementById(sectionId).classList.add('active');
}
