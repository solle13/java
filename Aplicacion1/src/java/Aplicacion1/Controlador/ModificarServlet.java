/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion1.Controlador;

import Aplicacion1.DAO.UserDAO;
import Aplicacion1.VO.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * 
 */
public class ModificarServlet extends HttpServlet {

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
        try  {
            String Pass1 = request.getParameter("pass");
            String Pass2 = request.getParameter("pass2");
            if(Pass1.equals(Pass2)){
                HttpSession sesion = request.getSession();
                UserDAO reg = new UserDAO();
                String User = (String)sesion.getAttribute("Usuario");
                User registro = new User();
                registro.setNombre(request.getParameter("Nombre")); 
                registro.setPais(request.getParameter("Pais")); 
                registro.setPass(Pass1);
                registro.setId(reg.consultar(User).getId());
                reg.modificar(registro);
                sesion.setAttribute("Usuario", null);
                String Mensaje="Debes volver a iniciar sesión";
                request.setAttribute("Mensaje", Mensaje);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }else{
                String Mensaje="Las contraseñas no son iguales";
                request.setAttribute("Mensaje", Mensaje);
                UserDAO registros = new UserDAO();
                User reg = new User();
                HttpSession sesion = request.getSession();
                reg=registros.consultar((String)sesion.getAttribute("Usuario"));
                request.setAttribute("Usuario", reg.getUsuario());
                request.setAttribute("Nombre", reg.getNombre());
                request.setAttribute("Apellidop", reg.getPais());
                request.getRequestDispatcher("Acceso.jsp").forward(request, response);
            }
            
        }catch(Exception e){
            System.out.println(e);
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
