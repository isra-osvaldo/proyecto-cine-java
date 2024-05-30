/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.dao;

import cl.duoc.pgy2121.cine.bd.Conexion;
import cl.duoc.pgy2121.cine.dominio.Bebida;
import cl.duoc.pgy2121.cine.dominio.Entrada;
import cl.duoc.pgy2121.cine.dominio.Popcorn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author israelacunau
 */
public class BebidaDao {
    
    public static boolean crearBebida(Bebida be){
        
        boolean res = false;
        
        Connection con = null;
        PreparedStatement ps = null;
        
        String stock = "";
        
        try{
        con = Conexion.getConnection();
        
        ps = con.prepareStatement("insert into bebida (codigo,nombreBebida,precio,cantidad,tamanoBebida) values(?,?,?,?,?)");
        ps.setString(1, be.getCodigo());
        ps.setString(2, be.getNombreBebida());
        ps.setInt(3, be.getPrecio());
        ps.setInt(4, be.getCantidad());
        ps.setString(5, be.getTamanoBebida()+"");
    
        ps.executeUpdate();
        res = true;
        
        }catch(Exception ex){
            
            System.out.println("Error: "+ex.getMessage());
            res = false;
            
        }finally{
        
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(BebidaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    
        return res;
    }
   
    public static ArrayList<Bebida> retornaBebida(){
    
        ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; 
        
        try{
        con = Conexion.getConnection();
        
        ps = con.prepareStatement("select * from bebida");
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            Bebida be = new Bebida();
            be.setCodigo(rs.getString("codigo"));
            be.setNombreBebida(rs.getString("nombreBebida"));
            be.setPrecio(rs.getInt("precio"));
            be.setCantidad(rs.getInt("cantidad"));
            be.setTamanoBebida(rs.getString("tamanoBebida").charAt(0));
            
            
        
            bebidas.add(be); // Agregar objeto a la colección
            
        }
        
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
            
        }finally{
            
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(BebidaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        return bebidas;
    }    
    
    public static ArrayList<Bebida> retornaBebidaNombre(String nombre){
    
         ArrayList<Bebida> be = new ArrayList<Bebida>();
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; 
        
        try{
        con = Conexion.getConnection();
        
        ps = con.prepareStatement("select * from bebida where nombreBebida =?");
        ps.setString(1, nombre);
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            Bebida bebida = new Bebida();
            bebida.setCodigo(rs.getString("codigo"));
            bebida.setNombreBebida(rs.getString("nombreBebida"));
            bebida.setPrecio(rs.getInt("precio"));
            bebida.setCantidad(rs.getInt("cantidad"));
            bebida.setTamanoBebida(rs.getString("tamanoBebida").charAt(0));

            be.add(bebida);
            
        }
        
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
            
        }finally{
            
             try {
                 rs.close();
                 ps.close();
                 con.close();
             } catch (SQLException ex) {
                 Logger.getLogger(BebidaDao.class.getName()).log(Level.SEVERE, null, ex);
             }
            
        
        }
        
        return be;
    
    
    
    }
    
    public static boolean EliminarBebida(String id){
    
        boolean res = false;
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try{
        con = Conexion.getConnection();
        
        ps = con.prepareStatement("delete from bebida where codigo =?");
        ps.setString(1, id);
        ps.executeUpdate();
        res = true;

        }catch(Exception ex){
        
            System.out.println("Error: "+ex.getMessage());
            res = false;
            
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(BebidaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }

        return res;
    
    
    
    
    
    } 
}
