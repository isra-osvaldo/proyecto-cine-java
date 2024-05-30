/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.dao;

import cl.duoc.pgy2121.cine.bd.Conexion;
import cl.duoc.pgy2121.cine.dominio.Bebida;
import cl.duoc.pgy2121.cine.dominio.Entrada;
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
public class EntradaDao {
    
    public static boolean crearEntrada(Entrada ent){
        
        boolean res = false;
        
        Connection con = null;
        PreparedStatement ps = null;
        
        String stock = "";
        
        try{
        con = Conexion.getConnection();
        
        ps = con.prepareStatement("insert into entrada (codigo,precio,cantidad,tipoCliente,tipoPelicula) values(?,?,?,?,?)");
        ps.setString(1, ent.getCodigo());
        ps.setInt(2, ent.getPrecio());
        ps.setInt(3, ent.getCantidad());
        ps.setString(4, ent.getTipoCliente()+"");
        ps.setString(5, ent.getTipoPelicula());

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
                Logger.getLogger(EntradaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    
        return res;
    }
 
    public static ArrayList<Entrada> retornaEntrada(){
    
        ArrayList<Entrada> entradas = new ArrayList<Entrada>();
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; 
        
        try{
        con = Conexion.getConnection();
        
        ps = con.prepareStatement("select * from entrada");
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            Entrada ent = new Entrada();
            ent.setCodigo(rs.getString("codigo"));
            ent.setPrecio(rs.getInt("precio"));
            ent.setCantidad(rs.getInt("cantidad"));
            ent.setTipoCliente(rs.getString("tipoCliente").charAt(0));
            ent.setTipoPelicula(rs.getString("tipoPelicula"));
            
        
            entradas.add(ent); // Agregar objeto a la colección
            
        }
        
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
            
        }finally{
            
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(EntradaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        return entradas;
    }    
    
    public static ArrayList<Entrada> retornaEntradaCodigo(String cod){
    
         ArrayList<Entrada> en = new ArrayList<Entrada>();
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; 
        
        try{
        con = Conexion.getConnection();
        
        ps = con.prepareStatement("select * from entrada where codigo =?");
        ps.setString(1, cod);
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            Entrada entrada = new Entrada();
            entrada.setCodigo(rs.getString("codigo"));           
            entrada.setPrecio(rs.getInt("precio"));
            entrada.setCantidad(rs.getInt("cantidad"));
            entrada.setTipoCliente(rs.getString("tipoCliente").charAt(0));
            entrada.setTipoPelicula(rs.getString("tipoPelicula"));

            en.add(entrada);
            
        }
        
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
            
        }finally{
            
             try {
                 rs.close();
                 ps.close();
                 con.close();
             } catch (SQLException ex) {
                 Logger.getLogger(EntradaDao.class.getName()).log(Level.SEVERE, null, ex);
             }
            
        
        }
        
        return en;
    
    
    
    }
    
    public static boolean EliminarEntrada(String id){
    
        boolean res = false;
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try{
        con = Conexion.getConnection();
        
        ps = con.prepareStatement("delete from entrada where codigo =?");
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
                Logger.getLogger(EntradaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }

        return res;
    
    
    
    
    
    } 
   
}
