<%-- 
    Document   : admin_denunciados
    Created on : 12-oct-2018, 16:28:53
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
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
                            <th>contrasenia</th>
                            <th>rol</th>
                      
                            
                        </tr>
                    </thead>
                        <c:forEach var="usuario" items="${ps}">
                        <tbody>
                        
                            <th>${usuario.id}</th>
                            <th>${usuario.nombre}</th>
                            <th>${usuario.correo}</th>
                             <th>${usuario.contrasenia}</th>
                              <th>${usuario.rol}</th>
                              
                              
                              
                              
                              
                       </tbody>

                    </c:forEach>
                </table>
        
        
    </body>
</html>
