<%-- 
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log In</title>
        <link rel="stylesheet" type="text/css" href="CSS/Estilos.css">
        <link href="CSS/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
    <header>
        <div id="Titulo">Programación Web</div>
    </header>
	<div class="container">
        <section class="main row"> 
            <div id="contenedor" class="col-xs-12">
                <div id="form">
                <form action="Validar" method="post">
                    <h1>INGRESO</h1>
                    ${Mensaje}
                    <div class="form-group">
                    
                    <input class="form-control"  name="user" type="text" placeholder="Usuario" required />
                    
                    <input class="form-control"  name="pass" type="password" placeholder="Contraseña" required/>
                    </div>
                    <input type="submit"  value="Entrar" class="btn btn-block btn-sample" />
                </form>
                <div id="reg">
                    <a href="Registrar.jsp"><h3>Registrar</h3></a>
                </div>
                </div>
                
            </div>
        </section>
    </div>

    <footer>
        
    </footer>
        <!-- JQUERY -->
    <script src="js/jquery-1.12.1.min.js"></script>
    <!-- BOOTSTRAP -->
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>
