<%-- 
    Document   : Consulta1
    Created on : 15-oct-2018, 10:37:54
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
				<!--
                                        <div class="col-lg-4 col-md-4 col-sm-6">
					<a href="images/primaria.jpg" class="fh5co-project-item image-popup">
						<figure>
							<div class="overlay"><i class="ti-plus"></i></div>
                                                        <img src="<c:url value="/images/primaria.jpg"/>" alt="Image" class="img-responsive">
						</figure>
						<div class="fh5co-text">
							<h2>primaria</h2>
							<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>
						</div>
					</a>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6">
					<a href="images/secundaria.png" class="fh5co-project-item image-popup">
						<figure>
							<div class="overlay"><i class="ti-plus"></i></div>
							<img src="images/secundaria.png" alt="Image" class="img-responsive">
						</figure>
						<div class="fh5co-text">
							<h2>Secundaria</h2>
							<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>
						</div>
					</a>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6">
					<a href="images/img_4.jpg" class="fh5co-project-item image-popup">
						<figure>
							<div class="overlay"><i class="ti-plus"></i></div>
							<img src="images/prepa.jpg" alt="Image" class="img-responsive">
						</figure>
						<div class="fh5co-text">
							<h2>Prepratoria</h2>
							<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>
						</div>
					</a>
				</div>

				<div class="col-lg-4 col-md-4 col-sm-6">
					<a href="images/img_1.jpg" class="fh5co-project-item image-popup">
						<figure>
							<div class="overlay"><i class="ti-plus"></i></div>
							<img src="images/universidad.jpg" alt="Image" class="img-responsive">
						</figure>
						<div class="fh5co-text">
							<h2>Universidad</h2>
							<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>
						</div>
					</a>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6">
					<a href="images/img_5.jpg" class="fh5co-project-item image-popup">
						<figure>
							<div class="overlay"><i class="ti-plus"></i></div>
							<img src="images/img_5.jpg" alt="Image" class="img-responsive">
						</figure>
						<div class="fh5co-text">
							<h2>Constructive heading</h2>
							<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>
						</div>
					</a>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6">
					<a href="images/img_6.jpg" class="fh5co-project-item image-popup">
						<figure>
							<div class="overlay"><i class="ti-plus"></i></div>
							<img src="images/img_6.jpg" alt="Image" class="img-responsive">
						</figure>
						<div class="fh5co-text">
							<h2>Constructive heading</h2>
							<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>
						</div>
					</a>
				</div>
                                                -->
                        </tbody>

                    </c:forEach>
			</div>
		</div>
	</div>
        </div>
        </div>
        
        
        <div class="modal fade" id="miModal" tabindex="-1"  tabindex="-1" role="dialog" aria-labelledby="myModalLabel" style="margin-top:250px" aria-hidden="true">
	<div class="modal-dialog" role="document" >
		<div class="modal-content" >
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>

				<h3 class="modal-title" id="myModalLabel" style="text-align:center ">Materias</h3>
			</div>

			<div class="modal-body" ">
				<table>
<tr>
  <td><strong>Curso</strong></td>
  <td><strong>Horas</strong></td>
  <td><strong>Horario</strong></td>
</tr>
 
<tr>
  <td>CSS</td>
  <td>20</td>
  <td>16:00 - 20:00</td>
</tr>
 
<tr>
  <td>HTML</td>
  <td>20</td>
  <td>16:00 - 20:00</td>
</tr>
 
<tr>
  <td>Dreamweaver</td>
  <td>60</td>
  <td>16:00 - 20:00</td>
</tr>

<tr>
  <td>Dreamweaver</td>
  <td>60</td>
  <td>16:00 - 20:00</td>
</tr>

<tr>
  <td>Dreamweaver</td>
  <td>60</td>
  <td>16:00 - 20:00</td>
</tr>
<tr>
   <td</td>
   </tr>

</table>
                        
                        
                        
			</div>
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
