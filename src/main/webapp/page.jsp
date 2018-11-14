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
        <form method='GET'>
            Code : <input name="code" size="1" maxlength="1" pattern="[A-Z]{1}+" title="Une lettre en MAJUSCULES"><br/>
            Taux : <input name="taux" type="number" step="0.01" min="0.0" max="99.99" size="5"><br/>
            <input type="hidden" name="action" value="ADD">
            <input type="submit" value="Ajouter">
        </form>
        
        <table border=2>
            <tr> <th>Id</th> <th>Name</th> <th>Supprimer</th></tr>

            <c:forEach var="code" items="${codes}" > 
                <tr> <td>${code.lettre}</td> <td>${code.pourcentage}</td> <td><a href="?action=DELETE&code=${code.lettre}">delete</a></td> </tr>
            </c:forEach>
</table>

</body>
</html>
