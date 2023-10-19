package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Saira Urbina Cienfuegos
 */
public class DAOArticulo {
    //Método para insertar datos en la BD
    public Articulo Insertar(int numero, String titulo, java.sql.Date inicio, 
            java.sql.Date fin) {
        String transaccion = "INSERT INTO articulo (numero,titulo_art, inicio,"
                + "fin) VALUES('"
                + numero + "', '"
                + titulo + "', '"
                + inicio + "', '"
                + fin + "')";
        //Llama al método Actualizar ubicado en DataBase.java
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Articulo(numero, titulo,  inicio, fin);
        }
        return null;
    }
    //Métod para actualizar un registro en la BD
    public int Actualizar(int id, int numero, String titulo, java.sql.Date inicio, 
            java.sql.Date fin) {

        String transaccion = "UPDATE articulo SET numero='"
                + numero + "', titulo_art='"
                + titulo + "', inicio= '"
                + inicio + "',fin= '"
                + fin + "' WHERE id_articulo="
                + id ;

        return new DataBase().Actualizar(transaccion);
    }
    
        //Método para seleccionar todos los registros de la tabla
    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM articulo";
        //Llama a método Listar de DataBase.java  
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Articulo> articulos = new ArrayList(); //Arreglo de Articulos
        //Ciclo que recorre cada registro y los agrega al arreglo articulos
        for (Map registro : registros) { 
           Articulo art = new Articulo((int) registro.get("id_articulo"),
                    (int) registro.get("numero"),
                    (String) registro.get("titulo_art"),
                    (java.sql.Date) registro.get("inicio"),
                    (java.sql.Date) registro.get("fin"));
            articulos.add(art);
        }
        return articulos; //Retorna todos los articulos ubicados en la tabla de BD     
    }
    
        //Método para eliminar un registro de la tabla en la BD
    public int Eliminar(int id) {
     String transaccion = "DELETE FROM articulo WHERE id_articulo='"+ id +"'";       
        
     return new DataBase().Actualizar(transaccion);
    }
}
