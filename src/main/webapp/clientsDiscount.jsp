<%-- 
    Document   : clientsDiscount
    Created on : 7 nov. 2018, 14:09:17
    Author     : pedago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>COUCOU</h1>
        <h1>la taille ${taille}</h1>

        <table border=2>
            <tr> <th>Id</th> <th>Name</th> <th>Supprimer</th></tr>

            <c:forEach items="${codes}" var="element"> 
                <tr> 
                    <td>${element.lettre}</td> 
                    <td> <fmt:formatNumber minIntegerDigits="2" minFractionDigits="2" maxFractionDigits="2" value="${element.pourcentage}"/> % </td> 
            <td><a href="?action=DELETE&code=${element.lettre}" >delete</a></td>

        </tr>
    </c:forEach>
</table>
<div><h4></h4></div>

</body>
</html>
