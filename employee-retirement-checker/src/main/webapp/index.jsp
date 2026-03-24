<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Aposentadoria</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Aposentadoria</h2>

        <form action="aposentadoria" method="POST">
            Nome: <input type="text" name="nome" id="nome"><br><br>
            Idade: <input type="number" name="idade" id="idade"><br><br>
            Tempo de Trabalho: <input type="number" name="tempo" id="tempo"><br><br>

            <button type="submit">Verificar</button>
        </form>

        <h3 id="resultado"></h3>
    </div>
    <script src="js/script.js"></script>

</body>
</html>