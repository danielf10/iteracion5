<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enhorabuena</title>
                                
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
        
        <div class="gtco-loader"></div>
	
	<div id="page">

	
	<div class="page-inner">
	<nav class="gtco-nav" role="navigation">
		<div class="gtco-container">
			
			<div class="row">
				<div class="col-sm-4 col-xs-12">
                                    <div id="gtco-logo"><a href="<c:url value="/"/>" style="color:black ; font-size:41px ">SEC</a></div>
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
	
	<header id="gtco-header" class="gtco-cover" role="banner" style="background-image: url(images/img_4.jpg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					

					<div class="row row-mt-15em">
						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
							<span class="intro-text-small">Bienvenido</span>
							<h1>Es hora de Estudiar </h1>	
						</div>
						<div class="col-md-4 col-md-push-1 animate-box" data-animate-effect="fadeInRight">
							<div class="form-wrap">
								<div class="tab">
									<ul class="tab-menu">
										<li class="active gtco-first"><a href="#" data-tab="signup">Sign up</a></li>
										<li class="gtco-second"><a href="#" data-tab="login">Login</a></li>
									</ul>
									<div class="tab-content">
										<div class="tab-content-inner active" data-content="signup">
											<form action="/inicio/guardaUsuario"   onSubmit="return validarPasswd()"  method="POST">
                                                                                            
                                                                                            
                                                                                                <div class="row form-group">
													<div class="col-md-12">
														<label for="username">User</label>
                                                                                                               
														<input type="text" name="nombre" placeholder="Nombre de usuario" class="form-control" id="nombre">
													</div>
                                                                                                    </div>
                                                                                            
												<div class="row form-group">
													<div class="col-md-12">
														<label for="username">Email</label>
                                                                                                                
														<input type="email" name="correo" placeholder="Correo" class="form-control" id="correo">
													</div>
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label for="password">Password</label>
                                                                                                               
														<input type="password" placeholder="Contrasenia" class="form-control" name="contrasenia" id="Contrasenia">
													</div>
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label for="password2">Repeat Password</label>
														<input type="password" class="form-control" name="contrasenia2" id="contrasenia2">
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
                                                                                                            <input type="submit" class="btn btn-primary" onclick="validarPasswd()" value="Sign up">
													</div>
												</div>
											</form>	
										</div>

										<div class="tab-content-inner" data-content="login">
											
                                                                                    <sec:authorize access="!isAuthenticated()">
                                                                                    <form action="/inicio/login" method="POST">
												<div class="row form-group">
													<div class="col-md-12">
                                                                                                            
														<label for="username"> Email</label>
														
                                                                                                                <input type="text" name="username" placeholder="Correo" class="form-control" id="correo" >
													</div>
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label for="password">Password</label>
                                                                                                                
														<input type="password" name="password" placeholder="Contrasenia" class="form-control" id="contrasena">
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<input type="submit" class="btn btn-primary" value="Login">
													</div>
												</div>
                                                                                        
                                                                                        </sec:authorize>
            
                                                                                        
											</form>	
										</div>

									</div>
								</div>
							</div>
						</div>
					</div>
							
					
				</div>
			</div>
		</div>
	</header>
        
        
           <script type="text/javascript">
              function validarPasswd(){
                   var p1 = document.getElementById("contrasenia").value;
                    var p2 = document.getElementById("password").value;
                    
                    if (p1==p2) {
                            
                             
                    } 
                    else{
                     alert("Las contrasenias no iguales");
                 }
                }
                        
               </script>
        
        
        
        <!--
        <h1>Bienvenidos</h1>
         ${parametro}
        
        <br>
        <form action="/Repaso/peticion3" method="GET">
            <input id="parametro" type="text" name="param" placeholder="Parametro">
            <button> Apachurrame</button>
        </form>
        
        <br>
        <hr>
        <form action="/inicio/guardaUsuario" method="POST">
            <input id="nombre" type="text" name="nombre" placeholder="Nombre">
            <input id="correo" type="email" name="correo" placeholder="Correo">
            <input id="Contrasenia" type="password" name="contrasenia" placeholder="Contrasenia">
            <!--<input type="text" name="rol" list="rol" placeholder="rol">-->
            <!--
            <select name="rol" >
                <option value="ROLE_Usuario">ROLE_Usuario</option>
                <option value="ROLE_Admin">ROLE_Admin</option>
                <option value="ROLE_Root">ROLE_Root</option>
                
            </select>
             <select name="rol" >
                <option value="ROLE_Usuario">ROLE_Usuario</option>
                <option value="ROLE_Admin">ROLE_Admin</option>
                <option value="ROLE_Root">ROLE_Root</option>
                
            </select>
            <button class="btn-cta"> Guardame</button>
        </form>
        
        <br>
        <sec:authorize access="!isAuthenticated()">
        <%--<c:if test="${usuario==nul}">--%>
            <form action="/inicio/login" method="POST">
                <input id="correo" name="username" placeholder="Usuario"/>
                <input id="contrasena" name="password" type="password" placeholder="Contrasenia"/>
                <button>login</button>              

            
        <%--</c:if>--%>
        </sec:authorize>
        <br>
        <sec:authentication var="user" property="principal" />
        <sec:authorize access="isAuthenticated()">
             ${user.username}
            <form action="/Repaso/logout"> 
                <button>logout</button>
            </form> 
        </sec:authorize>
        <sec:authorize access="hasRole('ROLE_Root')">
            <h3>Es root</h3>
        </sec:authorize>
        <sec:authorize access="hasRole('ROLE_Admin')">
            <h3>Es admin</h3>
            
        </sec:authorize>
            
        <sec:authorize access="hasRole('alumno')">
            <h3>Es alumno</h3>
            
        </sec:authorize>
            
            
        <sec:authorize access="hasRole('profesor')">
            <h3>Es profesor</h3>
            
        </sec:authorize>
            
         <sec:authorize access="hasRole('ambos')">
            <h3>Es ambos</h3>
            
        </sec:authorize>   
        <br>
        
        <c:if test="${usuario!=nul}">
            <h1>ke onda</h1>
            <h3>c:if</h3>
            Nombre usuario loggeado : ${usuario.nombre} 
            <br>
            Rol : ${usuario.rol}
        </c:if>
            -->
        
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
</html>
