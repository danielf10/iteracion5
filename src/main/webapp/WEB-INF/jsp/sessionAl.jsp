<%-- 
    Document   : sessionAl
    Created on : 02-nov-2018, 11:06:47
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>soy un alumno!</h1>
        
        
        <h3>Nombre : ${usuario.getNombre()}</h3>
        <h3>Rol : ${usuario.getRol()}</h3>
        
        <form action="/inicio/logout"> 
            <button>hola</button>
        </form> 
    </body>
</html>
