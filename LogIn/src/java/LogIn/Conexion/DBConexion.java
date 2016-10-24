/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn.Conexion;


import java.sql.*;

/**
 *
 * 
 */
public class DBConexion {
    static String bd = "login";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/"+bd;
    Connection con=null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,login,password);
            System.out.println("Conexion establecida");
        }
        catch(Exception e){
        System.out.println("Error de conexion");    
        }
        return con;    
    }
    public void closeSQL(Object obj){
        try{
            if(obj instanceof Connection){
                ((Connection)obj).close();
                }
            else if(obj instanceof ResultSet){
                ((ResultSet)obj).close();
                }
            else if(obj instanceof Statement){
                ((Statement)obj).close();
                }
            else if(obj instanceof PreparedStatement){
                ((PreparedStatement)obj).close();
                }
            } 
        catch(SQLException e){
            System.out.println(e);
            }
 
        }
}
