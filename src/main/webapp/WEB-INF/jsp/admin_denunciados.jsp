    <%-- 
    Document   : admin_denunciados
    Created on : 12-oct-2018, 16:28:53
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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
            <style type="text/css">
             #agregar{
  width: 30%;}
            
            </style>
    </head>
    
    
    <body>
        <h1>estas en la vista de denunciados  yeah !</h1>
        
        
        <table class="table">
                    <thead>
                        <tr>
                            <th>id </th>
                            <th>nombre</th>
                            <th>correo</th>
                            
                            <th>rol</th>
                      
                            
                        </tr>
                    </thead>
                        <c:forEach var="user" items="${ps}">
                        <tbody>
                              
                            <th>${user.idPersona}</th>
                            <th>${user.nombre}</th>
                            <th>${user.correo}</th>
           
                              <th>${user.rol}</th>
                              
                              <th>  
                                <form action="/inicio/admin/eliminaUsuario" method="POST">
                                    <input id="user" name="persona" hidden="true" value="${user.correo}">
                                    <button type="submit" class="btn btn-primary btn-lg active">Eliminar</button>
                                </form> 
                            </th>
                              
                              
                              
                       </tbody>

                    </c:forEach>
                </table>
        
        
    </body>
</html>
