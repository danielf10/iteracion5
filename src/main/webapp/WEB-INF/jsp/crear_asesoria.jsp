<%-- 
    Document   : crear_asesoria
    Created on : 05-nov-2018, 6:21:12
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear asesoria </title>
        
         <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
    <!-- Bootstrap  -->
	<link rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>">
        

    </head>
    <body>
        
        
        
        
        
        
       <div class="page-inner">
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
								<li><a href="#">Web Design</a></li>
								<li><a href="#">eCommerce</a></li>
								<li><a href="#">Branding</a></li>
								<li><a href="<c:url value="/prueba"/>">API</a></li>
							</ul>
						</li>
						<li><a href="pricing.html">Pricing</a></li>
						<li><a href="<c:url value="/consulta"/>">Contact</a></li>
						<li class="btn-cta"><a href="<c:url value="/consulta"/>"><span>Consulta</span></a></li>
					</ul>
				</div>
			
		</div>
	</nav>

                                        
        
        
        
        
        
        
        
        <div class="row" style=" margin-left:40%"  >
   
        
         
      
        
        
            
            <div class="gtco-section border-bottom">
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-24">
	<div class="col-md-6 animate-box">
					<h3>crear clase</h3>
             <h1>${correo}</h1>
         
               
              
                    <form action="/inicio/prof/crearSes/verMat" method="GET" >
                    <input id="hola" name="nivel" hidden="true" value="1">
                           <input id="a" name="correoU" hidden="true" value="${Correo}">
                    <button>primaria</button>
                    
                    </form>  
               
                        <form action="/inicio/prof/crearSes/verMat" method="GET" >
                        <input id="hoa" name="nivel" hidden="true" value="2">
                               <input id="hola1" name="correoU" hidden="true" value="${correo}">
                        <button>secundaria</button>
                    
                        </form>  
                    
                        <form action="/inicio/prof/crearSes/verMat" method="GET" >
                        <input id="ha" name="nivel" hidden="true" value="3">
                               <input id="hola2" name="correoU" hidden="true" value="${correo}">
                        <button>prepapratoria</button>
                    
                        </form>  
                    
                        <form action="/inicio/prof/crearSes/verMat" method="GET" >
                        <input id="h" name="nivel" hidden="true" value="4">
                               <input id="hola3" name="correoU" hidden="true" value="${correo}">
                        <button>universidad</button>
                    
                        </form>  
               
           
               
                 <form action="/inicio/prof/crearSes/crear" method="GET" >   
                   <c:forEach items="${mat}" var="m">
                        <div> 
                        <input type="radio" value="${m.idmateria}" name="materia">${m.nombre}<br>
                    
                    
                        </div>
                   </c:forEach>
                    
                    
                
                
                
                
                
                
                
            
                
                    <div class="col-md-12" style="margin-top:5%">
                    <label for="app">costo</label>
                    <input type="text" name="costo" id="costo" class="form-control" placeholder="$ costo">
                    </div>
                
               
                
                <input id="hollla" name="correoP" hidden="true" value="${correo}">
                
                 <button>crear</button>
               
          </form>
                    					
            </div>
                 
                 
                                        
       </div>
                                    
                                    </div> 
                            </div>
                    </div>
                </div>
            </div>
                 
                 </div>
                 
                 
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
