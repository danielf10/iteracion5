<%-- 
    Document   : guardarPerf
    Created on : 19-oct-2018, 16:06:07
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
   
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
    <!-- Bootstrap  -->
	<link rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>">

    
    </head>
    <body>
         
        <!--<nav style="height:100px; margin-top:3% ">
    <div class="nav-wrapper" style="background-image:url(imagenes/b3.jpg)" >
      <a href="#!" class="brand-logo">Logo</a>
      <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
      <ul class="right hide-on-med-and-down" style="display: inline-block">
        <li><a href="sass.html" style="display: inline-block">Sass</a></li>
        <li><a href="badges.html" style="display: inline">Components</a></li>
        <li><a href="collapsible.html">Javascript</a></li>
        <li><a href="mobile.html">Mobile</a></li>
        <li><a class="waves-effect waves-light btn">button</a></li>
      </ul>
    </div>
  </nav>-->
        <div id="page">
        <div class="page-inner">
        <nav class="gtco-nav" role="navigation">
		<div class="gtco-container">
			
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
					<h3>completa todos los campos ${parametro}</h3>
            <form action="/inicio/Gperfil" method="POST" >
            <div class="row form-group">
		<div class="col-md-12" style="margin-top:5%">
                    <label for="nombre">nombre</label>
                    <input type="text" name="nombre" id="nombre" class="form-control" placeholder="nombre">
		</div>
                
                <div class="col-md-12" style="margin-top:5%">
                    <label for="app">apellido paterno</label>
                    <input type="text" name="app" id="app" class="form-control" placeholder="apellido paterno">
		</div>
                
                <div class="col-md-12" style="margin-top:5%">
                    <label for="apm">apellido materno</label>
                    <input type="text" name="apm" id="apm" class="form-control" placeholder="apellido materno">
		</div>
                
                <div class="col-md-12" style="margin-top:5%">
                    <label for="telefono">telefono</label>
                    <input type="text" name="telefono" id="telefono" class="form-control" placeholder="tel">
		</div>
                
                 <div class="col-md-12" style="margin-top:5%">
                
                     <select id="selector" name="rol" onchange="muestraMas()">
		<option value="ROLE_Alumno">alumno</option>
		<option value="ROLE_Profesor">profesor</option>
		<option value="ROLE_Ambos">ambos</option>
                </select>
	

                    <div id="alumno" style="display: none;"
	
                        numero de cuenta:
                        <input id="apellidos" name="apellidos" type="text" />
                        nivel escolar:
                        <input id="numtelefono" name="numtelefono" type="text" />
                    </div>


                    <div id="ambos" style="display: none;">
                        <p>todos</p>
                        ambos:
                        <input id="apellidos" name="apellidos" type="text" />
                        hola:
                        <input id="numtelefono" name="numtelefono" type="text" />
                    </div>

                    <div id="profesor" style="display: none;">
                        cvs:
                        <input id="apellidos" name="apellidos" type="text" />
                        hola:
                        <input id="numtelefono" name="numtelefono" type="text" />
                    </div>
                     
                
           
             </div>
                <div class="col-md-12" style="margin-top:5%">
                    <input id="hola" name="usuario" hidden="true" value="${parametro}">
                 <input type="submit" class="btn btn-primary" value="Enviar">
                  </div>
							
            </div>
          </form>
                                        
       </div>
                                    
                                    </div> 
                            </div>
                    </div>
                </div>
            </div>
                                        </div>
                                        </div>
                                        
        <script type="text/javascript">
            function muestraMas(){
		var var1=document.getElementById('selector').value;
		var var2=document.getElementById('alumno');
		var var3=document.getElementById('profesor');
		var var4=document.getElementById('ambos');
		
		
		if(var1=="ambos"){
			var3.style.display="none";
			var2.style.display="none";
			var4.style.display="block";
		}


		if(var1=="alumno"){
			var4.style.display="none";
			var3.style.display="none";
			var2.style.display="block";
		}
		

		if(var1=="profesor"){
			var4.style.display="none";
			var2.style.display="none";
			var3.style.display="block";
		}
		
		
		

                }
            </script>
            
            <script src="<c:url value="/js/jquery.min.js"/>"></script>
           
    </body>
</html>
