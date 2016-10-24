/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn.Controlador;

import LogIn.Dao.registrosDAO;
import LogIn.Vo.registrosVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 
 */
public class RegistrarServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         try {
            String Pass1 = request.getParameter("pass1");
            String Pass2 = request.getParameter("pass2");
            if(Pass1.equals(Pass2)){
                registrosDAO registroDao = new registrosDAO();
                String user=request.getParameter("user");
                if(!registroDao.consultarUser(user)){
                    registrosVO registro = new registrosVO();
                    registro.setUser(request.getParameter("user")); 
                    registro.setNombre(request.getParameter("nombre")); 
                    registro.setApellidoP(request.getParameter("apellido1")); 
                    registro.setApellidoM(request.getParameter("apellido2")); 
                    registro.setCarrera(request.getParameter("carrera")); 
                    registro.setMatricula(request.getParameter("matricula")); 
                    registro.setPass(Pass1);
                    registroDao.registrar(registro);
                    String Mensaje="Se ha registrado correctamente, ahora puede iniciar sesión";
                    request.setAttribute("Mensaje", Mensaje);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                else{
                    String Mensaje="El usuario ya existe";
                    request.setAttribute("Mensaje", Mensaje);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            }
            else{
                String Mensaje="Las contraseñas no son iguales";
                request.setAttribute("Mensaje", Mensaje);
                request.getRequestDispatcher("Registrar.jsp").forward(request, response);
            }
        }
        catch(Exception e){
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
