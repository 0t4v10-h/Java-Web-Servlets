function carregarModelos(){
    let tipo = document.getElementById("tipo").value;

    fetch("modelo?tipo=" + tipo)
        .then(res => res.text())
        .then(data => {
            document.getElementById("modelo").innerHTML = data;
        });
}