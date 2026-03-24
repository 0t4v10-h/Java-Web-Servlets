function verificar() {
alert("JS carregado");
    let nome = document.getElementById("nome").value;
    let idade = document.getElementById("idade").value;
    let tempo = dacument.getElementById("tempo").value;

    let xhr = new XMLHttpRequest();
    xhr.open("POST", "aposentadoria", true);
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    xhr.onload = function () {
        window.location.href = xhr.responseURL;
    };

    xhr.send("nome=" + nome + "&idade=" + idade + "&tempo=" + tempo);
}