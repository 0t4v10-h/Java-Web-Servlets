<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <title>Configuração de Carro</title>
        <link rel="stylesheet" href="<%= request.getContextPath() %>/css/style1.css">
    </head>

    <body>

        <div class="container">

            <h2>Monte seu Carro</h2>

            <form action="<%= request.getContextPath() %>/carro" method="POST">

                Tipo:
                <select id="tipo" name="tipo" onchange="carregarModelos()">
                    <option value="">Selecione</option>
                    <option value="popular">Popular</option>
                    <option value="basico">Básico</option>
                    <option value="suv">SUV</option>
                    <option value="utilitario">Utilitário</option>
                    <option value="sedan">Sedan</option>
                </select>

                Modelo:
                <select id="modelo" name="modelo" required>
                    <option value="">Selecione o tipo primeiro</option>
                </select>

                Motor:
                <select name="motor">
                    <option value="1.0">1.0</option>
                    <option value="2.0">2.0</option>
                </select>

                <div class="opcionais">
                    <h3>Opcionais</h3>
                    <label><input type="checkbox" name="ar"> Ar (R$ 3.000,00)</label><br>
                    <label><input type="checkbox" name="cambio"> Câmbio automático (R$ 5.000,00)</label><br>
                    <label><input type="checkbox" name="alarme"> Alarme (R$ 800,00)</label><br>
                    <label><input type="checkbox" name="pintura"> Pintura especial (R$ 2.500,00)</label><br>
                    <label><input type="checkbox" name="teto"> Teto solar (R$ 4.000,00)</label><br>
                    <label><input type="checkbox" name="multimidia"> Multimídia (R$ 1.800,00)</label>
                </div>

                <br>

                <label><input type="checkbox" name="importado"> Importado</label>

                <button type="submit">Calcular</button>

            </form>
        </div>

        <script>
            const contextPath = "<%= request.getContextPath() %>";
        </script>

        <script src="<%= request.getContextPath() %>/js/script1.js"></script>
</body>
</html>