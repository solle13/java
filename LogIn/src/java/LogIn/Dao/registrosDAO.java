/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn.Dao;

import LogIn.Conexion.DBConexion;
import LogIn.Vo.registrosVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * 
 */
public class registrosDAO {
    
    public void registrar(registrosVO persona){
        DBConexion con= new DBConexion();
        try {
            Connection reg=con.conexion();
            String sql="INSERT INTO registros(User, Pass, Nombre, ApellidoP, ApellidoM,Carrera, Matricula) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1,persona.getUser());
            pst.setString(2,persona.getPass());
            pst.setString(3,persona.getNombre());
            pst.setString(4,persona.getApellidoP());
            pst.setString(5,persona.getApellidoM());
            pst.setString(6,persona.getCarrera());
            pst.setString(7,persona.getMatricula());
            pst.execute();
            con.closeSQL(pst);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     public boolean consultarLogIn(String user, String pass){
         DBConexion con= new DBConexion();
         try{   
         Connection reg=con.conexion();
            String sql="SELECT * FROM registros WHERE User='"+user+"' AND Pass='"+pass+"'";
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
         DBConexion con= new DBConexion();
         try{   
         Connection reg=con.conexion();
            String sql="SELECT * FROM registros WHERE User='"+user+"'";
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
     
     public registrosVO consultar(String user){
         DBConexion con= new DBConexion();
         registrosVO registro = new registrosVO();
         try{   
         Connection reg=con.conexion();
            String sql="SELECT * FROM registros WHERE User='"+user+"'";
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet m=pst.executeQuery();
            if(m.next()){
                registro.setId(Integer.parseInt(m.getString("Id")));
                registro.setNombre(m.getString("Nombre"));
                registro.setApellidoP(m.getString("ApellidoP"));
                registro.setApellidoM(m.getString("ApellidoM"));
                registro.setUser(m.getString("User"));
                registro.setCarrera(m.getString("Carrera"));
                registro.setMatricula(m.getString("Matricula"));
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
         DBConexion con= new DBConexion();
        try {
            Connection reg=con.conexion();
            String sql="DELETE FROM registros WHERE User='"+user+"'";
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
     }
     
     public void modificar(registrosVO persona){
         DBConexion con= new DBConexion();
        try {
            Connection reg=con.conexion();
            String sql="UPDATE registros SET Pass=?,Nombre=?,ApellidoP=?,ApellidoM=?,Carrera=?,Matricula=? WHERE Id='"+persona.getId()+"'";
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1,persona.getPass());
            pst.setString(2,persona.getNombre());
            pst.setString(3,persona.getApellidoP());
            pst.setString(4,persona.getApellidoM());
            pst.setString(5,persona.getCarrera());
            pst.setString(6,persona.getMatricula());
            pst.executeUpdate();
            con.closeSQL(pst);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     }

}
