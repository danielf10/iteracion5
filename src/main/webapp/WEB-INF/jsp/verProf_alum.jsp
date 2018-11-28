<%-- 
    Document   : verProf_alum
    Created on : 28-nov-2018, 13:10:19
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
						<li><a href="<c:url value="/consulta"/>">Contact</a></li>
						<li class="btn-cta"><a href="<c:url value="/consulta"/>"><span>Inicio</span></a></li>
					</ul>
				</div>
			
		</div>
	</nav>   
        
        
        
        
        
        
        <c:forEach items="${cl}" var="c">
            <div>
                profesor:${c.profesor.usuario.nombre}
                materia:${c.materia.nombre}
                
            </div>
        
         </c:forEach>
        
        
         <div  class="gtco-section border-bottom" style="margin-top:5% ">
             
             <div class="gtco-container"> 
        <div class="blog-card">
	<div class="photo photo1"></div>
	
        
        
	<div class="description">
		<h1>Learning to Code</h1>
		<h2>Opening a door to the future</h2>
		<p class="summary">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad eum dolorum architecto obcaecati enim dicta praesentium, quam nobis! Neque ad aliquam facilis numquam. Veritatis, sit.</p>
		<a href="#">Read More</a>
	</div>
</div>
        
        
        <div class="blog-card alt">
        
        
            <div class="description">
		<h1>Mastering the Language</h1>
		<h2>Java is not the same as JavaScript</h2>
		<p class="summary">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad eum dolorum architecto obcaecati enim dicta praesentium, quam nobis! Neque ad aliquam facilis numquam. Veritatis, sit.</p>
		<a href="#">Read More</a>
            </div>
        </div>
                 
       </div>
           
         </div>
    </body>
</html>
