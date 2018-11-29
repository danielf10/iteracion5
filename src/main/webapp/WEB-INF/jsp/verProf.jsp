<%-- 
    Document   : verProf
    Created on : 26-nov-2018, 9:19:51
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <!-- Theme style  -->
	<link rel="stylesheet" href="<c:url value="/css/style2.css"/>">
        
          <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
        <!-- Bootstrap  -->
	<link rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>">
    </head>
    <body>
        
        
         <nav class="gtco-nav" role="navigation">
		<div class="gtco-container" style="background-image:url(imagenes/b3.jpg);height:80px; color: black  ">
			
			<div class="row">
				<div class="col-sm-4 col-xs-12">
					<div id="gtco-logo"><a href="index.html">SEC <em>.</em></a></div>
				</div>
				<div class="col-xs-8 text-right menu-1">
					<ul>
						<li><a href="features.html">Features</a></li>
						<li><a href="tour.html">Tour</a></li>
						<li class="has-dropdown">
							<a href="#">Dropdown</a>
							<ul class="dropdown">
                                                            <li><a href="#" style="color:black !important">Web Design</a></li>
								<li><a href="#">eCommerce</a></li>
								<li><a href="#">Branding</a></li>
								<li><a href="<c:url value="/prueba"/>">API</a></li>
							</ul>
						</li>
						<li><a href="pricing.html">Pricing</a></li>
						<li><a href="<c:url value="/"/>">Iniciar Session</a></li>
						<li class="btn-cta"><a href="<c:url value="/"/>"><span>Registrarse</span></a></li>
					</ul>
				</div>
			
		</div>
	</nav>   
        
        
        
        
        
        
        
        
        
        
        
        
         <div  class="gtco-section border-bottom" style="margin-top:5% ">
             <div class="gtco-container"> 
         <c:forEach items="${cl}" var="c">
        <div class="blog-card">
	<div class="photo photo1"></div>
	
        
        
	<div class="description">
		<h1>${c.profesor.usuario.nombre}  ${c.profesor.usuario.app}  </h1>
		<h2>${c.materia.nombre}</h2>
		<p class="summary">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad eum dolorum architecto obcaecati enim dicta praesentium, quam nobis! Neque ad aliquam facilis numquam. Veritatis, sit.</p>
		
               
	</div>
</div>
                 </c:forEach>
        
        
       
                 
       </div>
         </div>
    </body>
</html>
