/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.control;

import cl.duoc.pgy2121.cine.dao.BebidaDao;
import cl.duoc.pgy2121.cine.dominio.Bebida;

/**
 *
 * @author israelacunau
 */
public class ControlIngresoBebida {
    
    public static boolean ingresarBebida(String nombreBebida, char tamanoBebida, String codigo, int precio, int cantidad){
    
        boolean res = false;
        
        Bebida be = new Bebida(nombreBebida,tamanoBebida,codigo,precio,cantidad);
        
        res = BebidaDao.crearBebida(be);
        
        return res;
    
    
    
    
    }
    
}
