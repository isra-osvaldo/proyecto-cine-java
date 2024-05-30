/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.control;

import cl.duoc.pgy2121.cine.dao.BebidaDao;
import cl.duoc.pgy2121.cine.dao.EntradaDao;
import cl.duoc.pgy2121.cine.dominio.Bebida;
import cl.duoc.pgy2121.cine.dominio.Entrada;
import java.util.ArrayList;

/**
 *
 * @author israelacunau
 */
public class ControlListadoEntrada {
    
    public static ArrayList<Entrada> devuelveEntrada(){
    
        ArrayList<Entrada> ent = new ArrayList<Entrada>();
        
        ent = EntradaDao.retornaEntrada();  //Le entrego la coleccion a ve 
  
        return ent;
    }
    
        public static ArrayList<Entrada> devuelveEntradaCodigo(String codigoEntrada){
    
        ArrayList<Entrada> en = new ArrayList<Entrada>();
        
        en = EntradaDao.retornaEntradaCodigo(codigoEntrada); // Le entrego la coleccion a ve 
    
    
        return en;
    } 
    
    
}
