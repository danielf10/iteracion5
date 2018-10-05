<%-- 
    Document   : perfil
    Created on : Oct 5, 2018, 9:54:03 AM
    Author     : jonh
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil</title>
    </head>
    <body>
        <h1>Perfil</h1>
        <br>
        <h3>Nombre : ${usuario.getNombre()}</h3>
        <h3>Rol : ${usuario.getRol()}</h3>
        <form action="/Repaso/logout"> 
            <button>logout</button>
        </form> 
      
    </body>
</html>
