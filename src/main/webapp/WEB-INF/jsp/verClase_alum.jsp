<%-- 
    Document   : ver_clase_alum
    Created on : 27-nov-2018, 17:53:05
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
        <title>JSP Page</title>
    </head>
    <body>
       
        <div  class="gtco-section border-bottom" style="margin-top:5% ">
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
					<h2>Nivel Escolar</h2>
                                 
				</div>
			</div>
                     
                    
			<div class="row">
                            <c:forEach var="niv" items="${nv}">
                        <tbody>
                            
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                
                                    <form action="/inicio/consultaMat" method="GET">
					
                                        <div data-toggle="modal" data-target="#miModal" class="fh5co-project-item ">
                                            
                           
						<figure>
							<div class="overlay"><i class="ti-plus"></i></div>
                                                        <img src="<c:url value="/imagenes/${niv.nombre}.jpg"/>" alt="Image" class="img-responsive">
						</figure>
						<div class="fh5co-text">
							<h2>${niv.nombre}</h2>
                                                        <h3> ${niv.idNivel}  </h3>
							
                                                         <input id="hola" name="mate" hidden="true" value="${niv.idNivel}">
						</div>
                                                <button data-toggle="modal" data-target="#miModal" >hola</button>
			</div>
                                    </form>
				</div>
				
                        </tbody>

                    </c:forEach>
			</div>
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
