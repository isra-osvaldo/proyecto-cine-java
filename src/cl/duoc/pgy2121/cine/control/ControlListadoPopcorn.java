/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.control;


import cl.duoc.pgy2121.cine.dao.PopcornDao;
import cl.duoc.pgy2121.cine.dominio.Popcorn;
import java.util.ArrayList;

/**
 *
 * @author israelacunau
 */
public class ControlListadoPopcorn {
    
    
    public static ArrayList<Popcorn> devuelvePopcorn(){
    
        ArrayList<Popcorn> pop = new ArrayList<Popcorn>();
        
        pop = PopcornDao.retornaPopcorn(); //Le entrego la coleccion a ve 
  
        return pop;
    }
    
    public static ArrayList<Popcorn> devuelvePopcornCodigo(String codigoPopcorn){
    
        ArrayList<Popcorn> pop = new ArrayList<Popcorn>();
        
        pop = PopcornDao.retornaPopcorn(codigoPopcorn); // Le entrego la coleccion a ve 
    
    
        return pop;
    } 
    
}
