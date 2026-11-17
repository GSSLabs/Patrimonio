<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<html>
    <head>
    <tittle> Formulário de patrimonio</tittle>
    </head>
<body>
    <h2>Cadastro / edição de patrimonio</h2>
    <form action="/patrimonios/Salvar" method="POST">
        <label>Nr Patrimonio</label>
            <input type="text" id="nr_Patrimonio" name="nr_Patrimonio" value="${patrimonio.nr_Patrimonio}" required><br>
        <label>descrição</label>
            <input type="text" id="descricao" name="descricao" value="${patrimonio.descricao}" required><br>
        <label>local</label>
            <input type="text" id="local" name="local" value="${patrimonio.local}" required><br>

        <button type="submit">salvar</button><br>
        <a href="/patrimonios">retornar</a>
    </form>
</body>
</html>
