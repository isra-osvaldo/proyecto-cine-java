/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author israelacunau
 */

import java.sql.*;
public class Conexion{
    
private static Conexion instance = new Conexion();

  public  static Conexion getInstance()
  {
     return instance;
  }

 private Conexion(){
   try{
      System.out.println("Conexion() : instanciando Driver");
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Conexion(): Driver instanciado!");
      }catch(Exception e){
      System.out.println("Conexion(): ERROR: No se pudo instanciar el driver");
      e.printStackTrace();
      }
  }


public static Connection getConnection(){

     String url     = "jdbc:mysql://localhost/cine";
     String user    = "root";
     String password= "root";
     return getConnection(url, user, password);
                                         }

public static Connection getConnection(String url, String user, String password){
        Connection conn = null;

        try{
           conn = DriverManager.getConnection(url, user, password);
           }catch (Exception e){
               System.out.println("Conexion:getConnection() : ERROR: No se pudo crear la conexion");
               e.printStackTrace();
           }

           return conn;
           }
    }
    
    

