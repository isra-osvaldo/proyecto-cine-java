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
public final class Popcorn extends Producto {
    
    //Atributos
    
    private char tamanoPopcorn;
    
    //Constructor vacío

    public Popcorn() {
    }
    
    //Constructor paramétrico

    public Popcorn(char tamanoPopcorn, String codigo, int precio, int cantidad) {
        super(codigo, precio, cantidad);
        this.tamanoPopcorn = tamanoPopcorn;
    }
    
    //Getter and Setter

    public char getTamanoPopcorn() {
        return tamanoPopcorn;
    }

    public void setTamanoPopcorn(char tamanoPopcorn) {
        this.tamanoPopcorn = tamanoPopcorn;
    }
    
    
    @Override
    public void mostrar(){
    
        super.mostrar();
        System.out.println("Tamaño Refresco: "+this.tamanoPopcorn);
    
    }

    @Override
    public int AsignarPrecioEntrada() {
        
        int valorPopcorn = this.getPrecio();
        
        if(this.tamanoPopcorn == 'N'){
            
            valorPopcorn = PRECIOPOPCORNNORMAL;
        
        }else{
        
            valorPopcorn = PRECIOPOPCORNGRANDE;
        }
        
        return valorPopcorn;    
        
        
    }
    
    
}
