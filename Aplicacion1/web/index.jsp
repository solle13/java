<%-- 
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
        <script src="http://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>


    
    <link rel="stylesheet" href="css/reset.css">

    <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css'>

        <link rel="stylesheet" href="css/style.css">
        
    </head>
    <body>
        <div id="Mensaje" ><h3>${Mensaje}</h3></div>
	<form action="Validacion" method="post" class="login">
  
  <fieldset>
    
  	<legend class="legend">Login</legend>
    
    <div class="input">
    	<input type="text" placeholder="Usuario" required name="user" />
      <span><i class="fa fa-user" ></i></span>
    </div>
    
    <div class="input">
    	<input type="password" placeholder="Password" required name="pass" />
      <span><i class="fa fa-lock"></i></span>
    </div>
    
    <button type="submit" class="submit"><i class="fa fa-long-arrow-right"></i></button>
    
  </fieldset>
  
  
  
</form>

<form action="Crear" method="post" class="login3">
  
  <fieldset>
    
  	<legend class="legend">Registrar </legend>
    
    <div class="input">
    	<input type="text" placeholder="Usuario" required name="User" />
      <span><i class="fa fa-user" ></i></span>
    </div>

    <div class="input">
    	<input type="text" placeholder="Nombre" required name="Nombre" />
      <span><i class="fa fa-male" ></i></span>
    </div>

    <div class="input">
    	<input type="text" placeholder="Pa&iacute;s" required name="Pais" />
      <span><i class="fa fa-globe" ></i></span>
    </div>
    
    <div class="input">
    	<input type="password" placeholder="Password" required name="pass" />
      <span><i class="fa fa-lock"></i></span>
    </div>

    <div class="input">
    	<input type="password" placeholder="Confir. Pass" required name="pass2" />
      <span><i class="fa fa-lock" ></i></span>
    </div>
    
    <button type="submit" class="submit2"><i class="fa fa-long-arrow-right"></i></button>
    
  </fieldset>
  
  
  
</form>

    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js/index.js"></script>
</body>
</html>
