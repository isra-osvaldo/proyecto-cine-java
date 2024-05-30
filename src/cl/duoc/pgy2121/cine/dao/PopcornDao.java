/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.dao;

import cl.duoc.pgy2121.cine.bd.Conexion;
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
public class PopcornDao {
    
    
    public static boolean crearPopcorn(Popcorn pop){
        
        boolean res = false;
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try{
        con = Conexion.getConnection();
        
        ps = con.prepareStatement("insert into popcorn (codigo,precio,cantidad,tamanoPopcorn) values(?,?,?,?)");
        ps.setString(1, pop.getCodigo());
        ps.setInt(2, pop.getPrecio());
        ps.setInt(3, pop.getCantidad());
        ps.setString(4, pop.getTamanoPopcorn()+"");

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
                Logger.getLogger(PopcornDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    
        return res;
    }
    
    public static ArrayList<Popcorn> retornaPopcorn(){
    
        ArrayList<Popcorn> popcorns = new ArrayList<Popcorn>();
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; 
        
        try{
        con = Conexion.getConnection();
        
        ps = con.prepareStatement("select * from popcorn");
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            Popcorn pop = new Popcorn();
            pop.setCodigo(rs.getString("codigo"));
            pop.setPrecio(rs.getInt("precio"));
            pop.setCantidad(rs.getInt("cantidad"));
            pop.setTamanoPopcorn(rs.getString("tamanoPopcorn").charAt(0));
            
            popcorns.add(pop); // Agregar objeto a la colección
            
        }
        
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
            
        }finally{
            
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(PopcornDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        return popcorns;
    }    
 
    public static ArrayList<Popcorn> retornaPopcorn(String codigo){
    
         ArrayList<Popcorn> pop = new ArrayList<Popcorn>();
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; 
        
        try{
        con = Conexion.getConnection();
        
        ps = con.prepareStatement("select * from popcorn where codigo =?");
        ps.setString(1, codigo);
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            Popcorn popcorn = new Popcorn();
            popcorn.setCodigo(rs.getString("codigo"));
            popcorn.setPrecio(rs.getInt("precio"));
            popcorn.setCantidad(rs.getInt("cantidad"));
            popcorn.setTamanoPopcorn(rs.getString("tamanoPopcorn").charAt(0));

            pop.add(popcorn);
            
        }
        
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
            
        }finally{
            
             try {
                 rs.close();
                 ps.close();
                 con.close();
             } catch (SQLException ex) {
                 Logger.getLogger(PopcornDao.class.getName()).log(Level.SEVERE, null, ex);
             }
            
        
        }
        
        return pop;
    
    
    
    
    
    }
    
    public static boolean EliminarEntrada(String id){
    
        boolean res = false;
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try{
        con = Conexion.getConnection();
        
        ps = con.prepareStatement("delete from popcorn where codigo =?");
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
                Logger.getLogger(PopcornDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }

        return res;
    
    
    
    
    
    } 
}
