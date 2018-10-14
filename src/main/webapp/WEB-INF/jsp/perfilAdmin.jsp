<%-- 
    Document   : perfilAdmin
    Created on : 06-oct-2018, 22:21:10
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
    </head>
    <body>
        <h1>AdminPerfil</h1>
        <br>
        <h3>Nombre : ${usuario.getNombre()}</h3>
        <h3>Rol : ${usuario.getRol()}</h3>
        
        <form action="/inicio/logout"> 
            <button>hola</button>
        </form> 
        
        <!--poner el boton para ver los usuarios denunciados   -->
        
             <form action="/inicio/admin/verDenunciados"> 
            <button>denunciados</button>
        </form> 
      
    </body>
</html>
