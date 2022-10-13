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
//
import java.util.*;


/**
 *
 * @author Saira Urbina Cienfuegos
 */
public class DataBase {
    private final String URL="jdbc:sqlserver://localhost:1433;databaseName=";
    private final String USER="sa";
    private final String PASSWORD="sa";
    private Connection conexion;
    
    public DataBase(){
        try{
            conexion=DriverManager.getConnection(URL,USER,PASSWORD);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public int Actualizar(String consulta){
        try{
            Statement st=conexion.createStatement();
            return st.executeUpdate(consulta);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
    public List Listar(String consulta){
        ResultSet rs=null;
        List resultado=new ArrayList();
        try{
            Statement st=conexion.createStatement();
            rs=st.executeQuery(consulta);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return resultado;
        
    }
    private List OrganizarDatos(ResultSet rs){
        List filas=new ArrayList();
        try{
            int numColumnas=rs.getMetaData().getColumnCount();
            while(rs.next()){
                Map<String, Object> renglon=new HashMap();
                for(int i=1; i<=numColumnas; i++){
                    String nombreCampo=rs.getMetaData().getColumnName(i);
                    Object valor=rs.getObject(nombreCampo);
                    renglon.put(nombreCampo,valor);
                }
                filas.add(renglon);
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
