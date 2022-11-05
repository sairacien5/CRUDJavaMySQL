/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

//import java.sql.CallableStatement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

import java.sql.*;
import java.util.*;

/*** @author Saira Urbina Cienfuegos*/

public class DataBase {
    //Cadena de conexión de la BD
    private final String URL="jdbc:sqlserver://localhost:1433;databaseName=PRESTAMOS;"+
            "integratedSecurity=true;"+"encrypt=true;trustServerCertificate=true;";
     
    private Connection conexion; //Para conexión con la BD
    
    public DataBase(){ //Constructor de la clase
        try{
          //Usando Driver conector y cadena de conexión para conectar BD  
          conexion=DriverManager.getConnection(URL);
          System.out.println("Conexiòn Establecida");
          
        }catch(SQLException e){
            System.out.println("Error de conexión");
            e.printStackTrace();
        }
    }
    //Método para actualizar datos en la BD
    public int Actualizar(String consulta){
        
        try{ //Para manejar errores al realizar la conexión y transacción en BD
            Statement st=conexion.createStatement();
            return st.executeUpdate(consulta);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return 1;
    }
    public List Listar(String consulta){
        ResultSet rs=null;
        //Arreglo de elementos en el que se almacenan los datos traídos de BD
        List resultado=new ArrayList(); 
        try{
            Statement st=conexion.createStatement();
            rs=st.executeQuery(consulta);
            resultado=OrganizarDatos(rs);//Llamada a método que organiza datos
            
        }catch(SQLException e){
            System.out.println("No se realizó la consulta");
            e.printStackTrace();
        }
        return resultado;  
    }
    private List OrganizarDatos(ResultSet rs){
        List filas=new ArrayList(); //Arreglo de elementos
        try{
            
            int numColumnas=rs.getMetaData().getColumnCount();
            while(rs.next()){ //Recorre cada registro de la tabla
                Map<String, Object> renglon=new HashMap();
                for(int i=1; i<=numColumnas; i++){
                    //Se obtiene nombre de campo en la BD
                    String nombreCampo=rs.getMetaData().getColumnName(i);
                    Object valor=rs.getObject(nombreCampo);
                    // Por cada campo, se obtine el nombre y el valor del mismo
                    renglon.put(nombreCampo,valor); 
                }
                filas.add(renglon);//Se agrega al arreglo cada registro
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return filas;
    }
    public boolean ejecutarProcedimiento(String nombre){
        try{
            CallableStatement cs=conexion.prepareCall("{call"+nombre+"}");
            return cs.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public void cerrarConexion(){
        try{
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
