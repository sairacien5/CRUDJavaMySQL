
package Modelo;

import java.sql.Date;
//import java.util.List;
import java.util.*;

/**
 *
 * @author Saira Urbina
 */
public class DAOCliente {
    
    public Cliente Insertar(String cedula, String nombres, String apellidos, 
            String telefono, Date fechaNacimiento){
        String transaccion="INSERT INTO cliente VALUES('"
                + cedula +"', '"
                + nombres +"', '"
                +apellidos +"', '"
                +telefono + "', '"
                +fechaNacimiento+"')";    
        if (new DataBase().Actualizar(transaccion)>0){
            return new Cliente(cedula,nombres, apellidos, 
            telefono, fechaNacimiento);
        }
        return null; 
    }
    public int Actualizar(String cedula, String nombres, String apellidos, 
            String telefono, Date fechaNacimiento){
        
        String transaccion="UPDATE cliente SET nombre='"
                + nombres +"', apellidos='"
                +apellidos +"', telefono '"
                +telefono + "',fechaNacimiento '"
                +fechaNacimiento+"'WHERE cedula='"
                +cedula+"'";
      
       return new DataBase().Actualizar(transaccion);
    }
    
    public Cliente ObtenerDatos(String cedula){
        //String transaccion=
        return null;
    }
    public List ObtenerDatos(){
        
        return null;
    }
    
    public boolean Insertar(String cedula){
        
        return true;
    }
    
}