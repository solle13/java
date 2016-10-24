import java.sql.*;
import java.util.Properties;

public class Conectar {
    Connection con=null;
    public Connection conexion(){
        Properties propiedades = new Archivo_Propiedades().getPropiedades();
        String iphost=propiedades.getProperty("iphost");
        String namedb=propiedades.getProperty("namedb");
        String usuario=propiedades.getProperty("usuario");
        String contrasena=propiedades.getProperty("contrasena");
        String puerto=propiedades.getProperty("puerto");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://"+iphost+":"+puerto+"/"+namedb+"",""+usuario+"",""+contrasena+"");
            System.out.println("Conexion establecida");
        }
        catch(Exception e){
        System.out.println("Error de conexion");    
        }
        return con;    
    }
    public void closeSQLNegotiator(Object obj){
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
