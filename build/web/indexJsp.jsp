<%-- 
    Document   : indexJsp
    Created on : 19/05/2017, 21:26:17
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilo.css" />
        <title>Cadastro</title>
    </head>
    <body>
        <div id="conteiner">
            <a href="indexJsp.jsp" > <img src="imagens/.jpg" height="100" width="755"></a>
        <h1>Cadastro</h1>
        <form action="ServM" method="POST">

            Nome: 
            <input type="text" name="nome"/><br>

            Idade:
            <input type="number" name="idade" max="120" min="1"/><br>

            Tipo de ciclo:
            <select name="tipo">
                <option value="Normal">Normal</option>
                <option value="Irregular">Irregular</option>
            </select><br>

            Data da ultima mestruaccao:
            <input type="date" name="data"/><br>

            <input type="submit" value="Gravar"/>
        </form>
        <form action="result.jsp">
            <input type="submit" value="Resultados" />
        </form>
        <footer><br><br>Desenvolveldores: José Hilton, Lucas Candeia, Julio Cesar, Luis Antônio e Dioclecio Amoroso.</footer>
        </div>
    </body>
</html>
