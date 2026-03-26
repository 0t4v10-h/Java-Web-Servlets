<%@ page import="br.aula.carros.model.Carro" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Resultado</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style1.css">
</head>

<body>

<div class="container">

<h2>Resumo do Carro</h2>

<%
    Carro carro = (Carro) request.getAttribute("carro");
    String total = request.getAttribute("total").toString();
%>

<div class="linha">Tipo: <%= carro.getTipo() %></div>
<div class="linha">Modelo: <%= carro.getModelo() %></div>
<div class="linha">Motor: <%= carro.getMotor() %></div>
<div class="linha">Importado: <%= carro.isImportado() ? "Sim" : "Não" %></div>

<div class="total">
Preço Final: R$ <%= total %>
</div>

<a href="index.jsp">← Voltar</a>

</div>

</body>
</html>