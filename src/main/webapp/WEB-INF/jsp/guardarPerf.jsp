<%-- 
    Document   : guardarPerf
    Created on : 19-oct-2018, 16:06:07
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
         <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
   
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </head>
    <body>
         
        <nav style="height:100px">
    <div class="nav-wrapper" style="background-image:url(imagenes/b3.jpg)" >
      <a href="#!" class="brand-logo">Logo</a>
      <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
      <ul class="right hide-on-med-and-down">
        <li><a href="sass.html">Sass</a></li>
        <li><a href="badges.html">Components</a></li>
        <li><a href="collapsible.html">Javascript</a></li>
        <li><a href="mobile.html">Mobile</a></li>
        <li><a class="waves-effect waves-light btn">button</a></li>
      </ul>
    </div>
  </nav>
        
        <p>para completar el registro llena los campos por favor</p>
        
<form action="#">
<div class="input-field col s12" >
    <select multiple>
      <option value="" disabled selected>Choose your option</option>
      <option value="1">Option 1</option><br>
      <option value="2">Option 2</option><br>
      <option value="3">Option 3</option>
    </select>
    
  </div>
</form >
         
     
        
        <div class="row" style="width: 50%"  >
    <form action="/inicio/guardaPerfil" method="POST" class="col s12">
         <div class="row">
             <div class="input-field col s6">
        <select name="rol" >
                <option value="ROLE_Usuario">ROLE_Usuario</option>
                <option value="ROLE_Admin">ROLE_Admin</option>
                <option value="ROLE_Root">ROLE_Root</option>
                
            </select>
                 </div>
             </div>
        
      <div class="row">
        <div class="input-field col s6">
          <input placeholder="Placeholder" id="first_name" type="text" class="validate">
          <label for="first_name">nombre</label>
        </div>
        <div class="input-field col s6">
          <input id="last_name" type="text" class="validate">
          <label for="last_name">apellido materno</label>
        </div>
          <div class="input-field col s6">
          <input id="last_name" type="text" class="validate">
          <label for="last_name">apellido paterno</label>
          
        </div>
          <div>
              
          </div>
      </div>
      <div class="row">
         
        <div class="input-field col s12">
          <input disabled value="I am not editable" id="disabled" type="text" class="validate">
          <label for="disabled">Disabled</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input id="telefono" type="text" class="validate">
          <label for="telefono">Telefono</label>
        </div>
      </div>
      
      </div>
     <input type="submit" class="btn btn-primary" value="Enviar">
    </form>
  </div>
        
         <c:if test="${usuario!=nul}">
            <h1>ke onda</h1>
            <h3>c:if</h3>
            Nombre usuario loggeado : ${usuario.nombre} 
            <br>
            Rol : ${usuario.rol}
        </c:if>
           <select name="ral" >
                <option value="ROLE_Usuario">ROLE_Usuario</option>
                <option value="ROLE_Admin">ROLE_Admin</option>
                <option value="ROLE_Root">ROLE_Root</option>
                
            </select>
            
            <script src="<c:url value="/js/jquery.min.js"/>"></script>
           
    </body>
</html>
