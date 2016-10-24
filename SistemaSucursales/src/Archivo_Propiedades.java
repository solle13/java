
import java.io.IOException;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rikardo
 */
public class Archivo_Propiedades {
    public Properties getPropiedades(){
        try{
            Properties propiedades = new Properties();
            propiedades.load(getClass().getResourceAsStream("DatosBase.properties"));
            if(!propiedades.isEmpty()){
                return propiedades;
            }else{
                return null;
            }
        }
        catch(IOException ex){
            return null;
        }
    }        
}
