<%-- 
    Document   : clientsDiscount
    Created on : 7 nov. 2018, 14:09:17
    Author     : pedago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form>
            
            <input name="taux" type="number" step="0.01" min="0.0" max="99.99" size="5">
            

            
            
            
            
        <input type='submit'>
        </form>
            <table border=2>
        <tr> <th>Code</th> <th>taux</th> <th>DELETE</th> </tr>
        <c:forEach var="code" items="${codes}">
            <tr> <td>${code.GetLettre}</td> <td>${code.GetPourcentage}</td> <td><a href="?action=DELETE&code=B">delete</a></td> </tr>
        </c:forEach>
    </table>
        
        
    </body>
</html>
