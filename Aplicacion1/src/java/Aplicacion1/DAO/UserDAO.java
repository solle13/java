/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion1.DAO;

import Aplicacion1.Conexion.Conexion;
import Aplicacion1.VO.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * 
 */
public class UserDAO {
     public void registrar(User persona){
        Conexion con= new Conexion();
        try {
            Connection reg=con.conexion();
            String sql="INSERT INTO usuarios(Usuario, Pass, Nombre, Pais) VALUES (?,?,?,?)";
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1,persona.getUsuario());
            pst.setString(2,persona.getPass());
            pst.setString(3,persona.getNombre());
            pst.setString(4,persona.getPais());
            pst.execute();
            con.closeSQL(pst);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     public boolean consultarLogIn(String user, String pass){
         Conexion con= new Conexion();
         try{   
         Connection reg=con.conexion();
            String sql="SELECT * FROM usuarios WHERE Usuario='"+user+"' AND Pass='"+pass+"'";
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet m=pst.executeQuery();
            if(m.next())
                return true;
            else
                return false;
         }catch(Exception e){
            return false;
         }
           
     }
     public boolean consultarUser(String user){
         Conexion con= new Conexion();
         try{   
         Connection reg=con.conexion();
            String sql="SELECT * FROM usuarios WHERE Usuario='"+user+"'";
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet m=pst.executeQuery();
            if(m.next())
                return true;
            else
                return false;
         }catch(Exception e){
            return false;
         }
           
     }
     
     public User consultar(String user){
         Conexion con= new Conexion();
         User registro = new User();
         try{   
         Connection reg=con.conexion();
            String sql="SELECT * FROM usuarios WHERE Usuario='"+user+"'";
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet m=pst.executeQuery();
            if(m.next()){
                registro.setId(Integer.parseInt(m.getString("Id")));
                registro.setNombre(m.getString("Nombre"));
                registro.setUsuario(m.getString("Usuario"));
                registro.setPais(m.getString("Pais"));
                registro.setPass(m.getString("Pass"));
                return registro;
            }
            else{
                return null;
            }
                
         }catch(Exception e){
            return null;
         }
           
     }
     
     public void eliminar(String user){
         Conexion con= new Conexion();
        try {
            Connection reg=con.conexion();
            String sql="DELETE FROM usuarios WHERE Usuario='"+user+"'";
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
     }
     
     public void modificar(User persona){
         Conexion con= new Conexion();
        try {
            Connection reg=con.conexion();
            String sql="UPDATE usuarios SET Pass=?,Nombre=?,Pais=? WHERE Id='"+persona.getId()+"'";
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1,persona.getPass());
            pst.setString(2,persona.getNombre());
            pst.setString(3,persona.getPais());
            pst.executeUpdate();
            con.closeSQL(pst);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     }

}
