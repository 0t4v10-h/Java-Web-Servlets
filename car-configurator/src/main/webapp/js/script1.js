function carregarModelos(){

    let tipo = document.getElementById("tipo").value;

    if (!tipo) return;

    fetch(contextPath + "/modelo?tipo=" + tipo)
        .then(res => res.text())
        .then(data => {
            console.log("Resposta:", data);
            document.getElementById("modelo").innerHTML = data;
        })
        .catch(err => console.error(err));
}