<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enhorabuena</title>
    </head>

    <body>
        <h1>Bienvenidos</h1>
         ${parametro}
        
        <br>
        <form action="/Repaso/peticion3" method="GET">
            <input id="parametro" type="text" name="param" placeholder="Parametro">
            <button> Apachurrame</button>
        </form>
        
        <br>
        <hr>
        <form action="/Repaso/guardaUsuario" method="POST">
            <input id="nombre" type="text" name="nombre" placeholder="Nombre">
            <input id="correo" type="email" name="correo" placeholder="Correo">
            <input id="Contrasenia" type="password" name="contrasenia" placeholder="Contrasenia">
            <!--<input type="text" name="rol" list="rol" placeholder="rol">-->
            <select name="rol" >
                <option value="ROLE_Usuario">ROLE_Usuario</option>
                <option value="ROLE_Admin">ROLE_Admin</option>
                <option value="ROLE_Root">ROLE_Root</option>
                
            </select>
            <button> Guardame</button>
        </form>
        
        <br>
        <sec:authorize access="!isAuthenticated()">
        <%--<c:if test="${usuario==nul}">--%>
            <form action="/Repaso/login" method="POST">
                <input id="correo" name="username" placeholder="Usuario"/>
                <input id="contrasena" name="password" type="password" placeholder="Contrasenia"/>
                <button>login</button>              

            </form>
        <%--</c:if>--%>
        </sec:authorize>
        <br>
        <sec:authentication var="user" property="principal" />
        <sec:authorize access="isAuthenticated()">
             ${user.username}
            <form action="/Repaso/logout"> 
                <button>logout</button>
            </form> 
        </sec:authorize>
        <sec:authorize access="hasRole('ROLE_Root')">
            <h3>Es root</h3>
        </sec:authorize>
        <sec:authorize access="hasRole('ROLE_Admin')">
            <h3>Es admin</h3>
        </sec:authorize>
        <br>
        
        <c:if test="${usuario!=nul}">
            <h3>c:if</h3>
            Nombre usuario loggeado : ${usuario.nombre} 
            <br>
            Rol : ${usuario.rol}
        </c:if>
            
        
   
</html>
