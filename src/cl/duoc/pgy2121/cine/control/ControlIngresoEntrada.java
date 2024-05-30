/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.control;

import cl.duoc.pgy2121.cine.dao.EntradaDao;
import cl.duoc.pgy2121.cine.dominio.Entrada;

/**
 *
 * @author israelacunau
 */
public class ControlIngresoEntrada {
    
public static boolean ingresarEntradas(char tipoCliente, String tipoPelicula, String codigo, int precio, int cantidad){ //Recibe los datos de la capa VIEW

        boolean res = false;
        
        // Crear objeto de tipo Vehiculo 
        Entrada ent = new Entrada(tipoCliente, tipoPelicula, codigo, precio, cantidad );
        
        // Crear la comunicación de la capa de Control y la capa Dao

            res = EntradaDao.crearEntrada(ent); // el método crearVehiculo en Dao recibe un objeto Vehiculo
        
            
             return res;
        }
    
}
