/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

import java.sql.Connection;
//import java.sql.DriverManager;
/**
 *
 * @author IGNITER
 */
public class Conexion {
    public static Connection getConexion(){
        String  url = "jdbc:sqlserver://localhost:1433;"
                    + "database=dbCine;"
                    + "user=sa;"
                    + "password=1234;";
        
        try{
            Connection con = DriverManger.getConnection(url);
            return con;
        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
}
