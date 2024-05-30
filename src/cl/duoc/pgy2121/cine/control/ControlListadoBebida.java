/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.control;


import cl.duoc.pgy2121.cine.dao.BebidaDao;
import cl.duoc.pgy2121.cine.dao.PopcornDao;
import cl.duoc.pgy2121.cine.dominio.Bebida;
import cl.duoc.pgy2121.cine.dominio.Popcorn;
import java.util.ArrayList;

/**
 *
 * @author israelacunau
 */
public class ControlListadoBebida {
    
    public static ArrayList<Bebida> devuelveBebida(){
    
        ArrayList<Bebida> be = new ArrayList<Bebida>();
        
        be = BebidaDao.retornaBebida(); //Le entrego la coleccion a ve 
  
        return be;
    }
    
    
    public static ArrayList<Bebida> devuelveBebidaNombre(String nombreBebida){
    
        ArrayList<Bebida> be = new ArrayList<Bebida>();
        
        be = BebidaDao.retornaBebidaNombre(nombreBebida); // Le entrego la coleccion a ve 
    
    
        return be;
    } 
    
}
