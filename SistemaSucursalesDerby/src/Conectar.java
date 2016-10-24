import java.sql.*;
import javax.swing.JOptionPane;

public class Conectar {
    Connection con=null;
    public Connection CrearDB(){
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	    con=DriverManager.getConnection("jdbc:derby:.//DB//Derby.DB;create=true");
		if(con!=null){
			String creartabla1="create table sucursales(IdSucursal varchar(10), NomSucursal varchar(30), IdGerente varchar(10),  NomGerente varchar(20), ApellGerente varchar(35), EdadGerente INTEGER, FotoGerente BLOB(16M), Ventas INTEGER, Zona varchar(10))";
			String creartabla2="create table pass(Id varchar(10), Password varchar(25))";
                        String admin="INSERT INTO pass(Id,Password) VALUES (?,?)";
			PreparedStatement pst=con.prepareStatement(creartabla1);
			pst.execute();
			pst.close();
			PreparedStatement pst2=con.prepareStatement(creartabla2);
			pst2.execute();
			pst2.close();
                        PreparedStatement pst3=con.prepareStatement(admin);
                        pst3.setString(1,"12345");
                        pst3.setString(2,"12345");
			pst3.executeUpdate();
			pst3.close();
			JOptionPane.showMessageDialog(null,"Base de datos creada");
			}
        }
		catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
			}

return con;
}


    public Connection conexion(){
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con=DriverManager.getConnection("jdbc:derby:.//DB//Derby.DB");
            System.out.println("Conexion establecida");
        }
        catch(Exception e){
        System.out.println("Error de conexion "+e);    
        }
        return con;    
    }
    public int conexion2(){
        int x=0;
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con=DriverManager.getConnection("jdbc:derby:.//DB//Derby.DB");
            System.out.println("Conexion establecida");
            x=1;
        }
        catch(Exception e){
            x=0;
            System.out.println("Error de conexion "+e);    
            }
        return x;    
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
