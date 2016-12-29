/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Rikardo
 */
public class Factory {
    String tipo;
    
    public Factory(String tipo){
        this.tipo = tipo;
    }
    
    public Conexion crearConexion(){
        if(tipo.equalsIgnoreCase("Oracle")){
            return new OracleConexion();
        }
        else if(tipo.equalsIgnoreCase("MySql")){
            return new MySqlConexion();
        }
        else if(tipo.equalsIgnoreCase("SqlServer")){
            return new SqlServerConexion();
        }
        else{
            return null;
        }
    }
}
