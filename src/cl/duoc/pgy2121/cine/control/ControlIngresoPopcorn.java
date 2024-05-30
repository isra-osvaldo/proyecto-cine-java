/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.control;

import cl.duoc.pgy2121.cine.dao.PopcornDao;
import cl.duoc.pgy2121.cine.dominio.Popcorn;



/**
 *
 * @author israelacunau
 */
public class ControlIngresoPopcorn {
    
public static boolean ingresarPopcorn(char tamanoPopcorn, String codigo, int precio, int cantidad){ //Recibe los datos de la capa VIEW

        boolean res = false;
        
        // Crear objeto de tipo Vehiculo 
        Popcorn pop = new Popcorn(tamanoPopcorn, codigo, precio, cantidad );
        
        // Crear la comunicación de la capa de Control y la capa Dao

            res = PopcornDao.crearPopcorn(pop); // el método crearVehiculo en Dao recibe un objeto Vehiculo
        
            
             return res;
        }
    
}
