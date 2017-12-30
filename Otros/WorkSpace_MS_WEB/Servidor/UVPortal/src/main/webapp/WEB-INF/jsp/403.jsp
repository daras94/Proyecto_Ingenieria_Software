<%-- 
    Document   : 403
    Created on : 15-dic-2017, 22:02:50
    Author     : david
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error 403: Acceso denegado.</title>
    </head>
    <body>
        <h1>Acceso denegado !!</h1>
        <form action="/logout" method="post">
            <input type="submit" value="Sign in as different user" /> 
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </form>  
    </body>
</html>