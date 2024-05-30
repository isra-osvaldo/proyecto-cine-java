/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.control;

import cl.duoc.pgy2121.cine.dao.BebidaDao;
import cl.duoc.pgy2121.cine.dao.EntradaDao;

/**
 *
 * @author israelacunau
 */
public class ControlEliminarBebida {
    
    public static boolean eliminarBebida(String codigo){
    
    boolean res = false;
    
    res = BebidaDao.EliminarBebida(codigo);
    
    return res;
    
    }
    
}
