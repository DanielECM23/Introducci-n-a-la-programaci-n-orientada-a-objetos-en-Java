form.addEventListener("submit", function(e) {
    e.preventDefault(); // Evita recargar la página

    const text = textArea.value.trim();
    if (text !== "") {
        // Crear nueva tarjeta de recomendación
        const card = document.createElement("div");
        card.classList.add("recommendation-card");
        card.innerHTML = `<p>"${text}"</p><span>- Anónimo</span>`;

        // Agregar al contenedor
        container.appendChild(card);

        // Limpiar el textarea
        textArea.value = "";

        // Mostrar pop-up
        document.getElementById("popup").style.display = "flex";
    }
});

// Cerrar el pop-up
document.getElementById("close-popup").addEventListener("click", function() {
    document.getElementById("popup").style.display = "none";
});

