/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.cine.dominio;

/**
 *
 * @author israelacunau
 */
public interface PreciosAplicables {
    
    int PRECIOENTRADAADULTO = 3000;
    int PRECIOENTRADANINO = 2000;
    int PRECIOBEBIDANORMAL = 2000;
    int PRECIOBEBIDAGRANDE = 3000;
    int PRECIOPOPCORNNORMAL = 3000;
    int PRECIOPOPCORNGRANDE = 4000;
    
    int AsignarPrecioEntrada();
    
}
