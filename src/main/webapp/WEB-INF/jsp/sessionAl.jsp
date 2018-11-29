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
        <h3>correo: ${usuario.getCorreo()}</h3>
        <form action="/inicio/logout"> 
            <button>hola</button>
        </form> 
        
        <form action="/inicio/alum/inicioAl/verClases" method="GET"> 
             <input id="hola" name="correoUs" hidden="true" value="${usuario.getCorreo()}">
                
            <button>ver clases</button>
        </form> 
             
          <h1>peticiones de clase aceptadas </h1>    
          <!--<//c:forEach items="${p}" var="pec">
             <h3>materia : </${pec.materia.nombre}</h3> 
              
          <///c:forEach>
            -->
        
    </body>
</html>
