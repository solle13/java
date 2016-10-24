<%-- 
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="CSS/Estilos.css">
        <link href="CSS/bootstrap.min.css" rel="stylesheet">
        
    </head>
    <body>
    <header>
        <div id="Titulo2">Bienvenido</div>
    </header>
        <div class="container">
        <section class="main row"> 
            <div class="col-xs-12 col-sm-12 col-md-8">
                <div id="datos" >
                   <div id="headDatos">
                        Tus datos personales
                   </div> 
                    <br><h2>Nombre: ${Nombre} ${Apellidop} ${Apellidom}
                    <br><br>Carrera: ${Carrera} 
                    <br><br>Matricula: ${Matricula}
                    <br><br>Usuario: ${Usuario}</h2>
                    <br><h3>${Modificar}</h3><br><br>
                    <div class="botones">
                        <a href="Eliminar" class="btn btn-block btn-sample" >Darse de baja</a>
                    </div>
                    <div class="botones">
                        <a href="CerrarSesion" class="btn btn-block btn-sample" >Cerrar sesion</a>
                    </div>
                </div>
                
            </div>
            <div class="col-xs-12 col-sm-12 col-md-4">
                
                <nav class="modificar">
                    
                    <ul>
                        <li>
                            <a id="mod" href="#" class="btn btn-block btn-sample" >Modificar</a>
                            <div id="mod-content" >
                                <form action="Modificar" method="post">
                                    <div class="form-group">
                                    <input class="form-control" placeholder="Pass" name="pass1" type="password"  required/>
                    <input class="form-control" placeholder="Pass Confirmación" name="pass2" type="password" required/>
                                    <input class="form-control" placeholder="Nombre" name="nombre" type="text"  required/>
                                    <input class="form-control" placeholder="Apellido Paterno" name="apellido1" type="text"  required/>
                                    <input class="form-control" placeholder="Appelido Materno" name="apellido2" type="text"  required/>
                                    <input class="form-control" placeholder="Carrera" name="carrera" type="text" required/>
                                    <input class="form-control" placeholder="Matrícula" name="matricula" type="text" required />
                                    </div>
                                    <input type="submit"  value="Modificar" class="btn btn-block btn-sample" />
                                </form>
                            </div>
                        </li>
                    </ul>
                </nav>
            </div>
            
        </section>
        </div>
	   <footer>
        
    </footer>
       
            <!-- JQUERY -->
    <script src="js/jquery-1.12.1.min.js"></script>
    <!-- BOOTSTRAP -->
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/modificar.js"></script>
    </body>
</html>
