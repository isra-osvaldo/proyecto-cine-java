/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.control;

import cl.duoc.pgy2121.cine.dao.EntradaDao;
import cl.duoc.pgy2121.cine.dao.PopcornDao;

/**
 *
 * @author israelacunau
 */
public class ControlEliminarPopcorn {
    
        
    public static boolean eliminarPopcorn(String codigo){
    
        boolean res = false;
    
        res = PopcornDao.EliminarEntrada(codigo);
    
        return res;
    
    }
    
}
