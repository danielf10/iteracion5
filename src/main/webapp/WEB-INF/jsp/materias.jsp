<%-- 
    Document   : materias
    Created on : 25-nov-2018, 19:26:19
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
        <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
        <!-- Bootstrap  -->
	<link rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>">
        <title>JSP Page</title>
    </head>
    <body>
       
       
            
                  
                    
                    
               
           
        
          
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
					<h2>Materias</h2>
					
				</div>
			</div>
           
            <c:forEach items="${mat}" var="m">
			
				<div class="col-md-4">
					<div class="price-box popular">
                                            <form action="/inicio/consultProf" method="GET">
						<h2 class="pricing-plan">${m.nombre}</h2>
						<div class="price"></div>
						<input id="hola" name="materia" hidden="true" value="${m.idmateria}">
						<hr>
						<button  class="btn btn-default btn-sm">profesores</button>
						
                                                </form>
					</div>
				</div>
				
			
		</c:forEach>
            
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
