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
public class SqlServerConexion extends Conexion {
    public SqlServerConexion(){}
    
    @Override
    public String conexion(){
        return "Conexion Sql Server";
    }
}
