<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
    <html>

    <head>
        <title>Resultado</title>
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <div class="container">
            <h2>Resultado</h2>

            <% String nome=request.getParameter("nome"); String idade=request.getParameter("idade"); String
                tempo=request.getParameter("tempo"); String res=request.getParameter("res"); %>

                <p>Nome: <%= nome %>
                </p>
                <p>Idade: <%= idade %>
                </p>
                <p>Tempo: <%= tempo %>
                </p>
                <p><strong>
                        <%= res %>
                    </strong></p>

                <br>
                <a href="index.jsp">← Voltar</a>
        </div>
    </body>

    </html>