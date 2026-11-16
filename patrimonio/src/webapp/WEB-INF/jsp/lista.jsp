<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<html>
    <head>
    <tittle> Lista de patrimonio</tittle>
    </head>
<body>
    <h2>Controle de patrimonio</h2>
    <a href="/patrimonio/novo">cadastro novo</a>
    <table>
        <thead>
            <th>ID</th>
            <th>Nr_patrimonio</th>
            <th>Descricao</th>
            <th>Local</th>
            <th>acoes</th>
        </thead>
        <body>
            <c:forEach var="item" items="${listaPatrimonios}">
            <tr>
                <td>${item.ID}</td>
                <td>${item.nr_patrimonio}</td>
                <td>${item.descricao}</td>
                <td>${item.local}</td>
                <td>
                    <a href="/patrimnio/editar/${item,Id}">editar</a>
                    <a href="/patrimnio/excluir/${item,Id}" on click="return confirm('deseja excluir este patrimônio ?')" >excluir</a>
                </td>
            </tr>
            </c:forEach>
        </body>
    </table>
</body>
</html>