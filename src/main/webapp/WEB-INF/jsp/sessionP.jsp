<%-- 
    Document   : sessionP
    Created on : 02-nov-2018, 11:08:06
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
        
      <link rel="stylesheet" href="<c:url value="/css/animate.css"/>">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="<c:url value="/css/icomoon.css"/>">
	<!-- Themify Icons-->
	<link rel="stylesheet" href="<c:url value="/css/themify-icons.css"/>">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="<c:url value="/css/magnific-popup.css"/>">

	

	<!-- Theme style  -->
	<link rel="stylesheet" href="<c:url value="/css/style.css"/>">

	<!-- Modernizr JS -->
        <script src="<c:url value="/js/ejemplo.js" />"></script>
	<script src="<c:url value="/js/modernizr-2.6.2.min.js"/>"></script>
    </head>
    <body>
        
        <nav class="gtco-nav" role="navigation">
		<div class="gtco-container" style="background-image:url(prof/imagenes/b3.jpg);height:80px; color: black  ">
			
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
						
						
						<li class="btn-cta"><a href="<c:url value="/prof/crearSes"/>"><span>Crear clase</span></a></li>
                                                <li class="btn-cta"><a href="<c:url value="/logout"/>"><span>cerrar session</span></a></li>
                                                
                                                
                                        </ul>
				</div>
			
		</div>
	</nav>
                                        
         <div  class="gtco-section border-bottom" style="margin-top:5% ">
		<div class="gtco-container">
        <h1>soy un profesor!</h1>
        
        
        <h3>Nombre : ${usuario.getNombre()}</h3>
        <h3>Rol : ${usuario.getRol()}</h3>
        <h3>correo:${usuario.getCorreo()}</h3>
        
        <form action="/inicio/prof/crearSes"> 
            
             <input id="hola" name="correoUs" hidden="true" value="${usuario.getCorreo()}">
            
            <button>crear Session </button>
        </form>
                
        
                </div>
         </div>
        
        <!-- jQuery -->
	<script src="<c:url value="/js/jquery.min.js"/>"></script>
	<!-- jQuery Easing -->
        <script src="<c:url value="/js/jquery.easing.1.3.js"/>"></script>
	<!-- Bootstrap -->
	<script src="<c:url value="/js/bootstrap.min.js"/>"></script>
	<!-- Waypoints -->
	<script src="<c:url value="/js/jquery.waypoints.min.js"/>"></script>
	<!-- Carousel -->
	<script src="<c:url value="/js/owl.carousel.min.js"/>"></script>
	<!-- countTo -->
	<script src="<c:url value="/js/jquery.countTo.js"/>"></script>
	<!-- Magnific Popup -->
	<script src="<c:url value="/js/jquery.magnific-popup.min.js"/>"></script>
	<script src="<c:url value="/js/magnific-popup-options.js"/>"></script>
	<!-- Main -->
	<script src="<c:url value="/js/main.js"/>"></script>
    </body>
</html>
