<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    </body>
    
   
</html>
