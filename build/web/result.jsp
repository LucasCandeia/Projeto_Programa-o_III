<%-- 
    Document   : result
    Created on : 18/05/2017, 16:50:31
    Author     : EAD
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="negocio.Mulher"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Resultados</h1>
        <form>
            <table align="center" border="1px" width="80%">
                <tr>
                    <th>Nome</th>
                    <th>Idade</th>
                    <th>Tipo de ciclo</th>
                    <th>Data da ultima menstruação</th>
                    <th>Data da proxima menstruação</th>
                </tr>
                <%
                    ArrayList<Mulher> mulheres = (ArrayList<Mulher>) request.getSession().getAttribute("lista");
                    for (int i = 0; i < mulheres.size(); i++) {
                %>
                <tr>
                    <th><%=mulheres.get(i).getNome()%></th>
                    <th><%=mulheres.get(i).getIdade()%></th>
                    <th><%=mulheres.get(i).getTipo()%></th>
                    <th><%=mulheres.get(i).getData()%></th>
                    <th><%=mulheres.get(i).getProxima()%></th>


                </tr>
                <%
                    }
                %>
            </table>

        </form>
    </body>
</html>
