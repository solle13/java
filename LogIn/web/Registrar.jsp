<%-- 
    Document   : Registrar
    Created on : 07-jun-2016, 23:38:15
    Author     : Rikardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar</title>
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
                <form action="Registrar" method="post">
                    <h1>REGISTRO</h1>
                    ${Mensaje}
                    <div class="form-group">
                    <input class="form-control" placeholder="Usuario" name="user" type="text"  required/>
                    <input class="form-control" placeholder="Pass" name="pass1" type="password"  required/>
                    <input class="form-control" placeholder="Pass Confirmación" name="pass2" type="password" required/>
                    <input class="form-control" placeholder="Nombre" name="nombre" type="text"  required/>
                    <input class="form-control" placeholder="Apellido Paterno" name="apellido1" type="text" required />
                    <input class="form-control" placeholder="Apellido Materno" name="apellido2" type="text" required />
                    <input class="form-control" placeholder="Carrera" name="carrera" type="text" required/>
                    <input class="form-control" placeholder="Matrícula" name="matricula" type="text" required />
                    </div>
                    <input type="submit"  value="Registrarse" class="btn btn-block btn-sample" />
                </form>
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
