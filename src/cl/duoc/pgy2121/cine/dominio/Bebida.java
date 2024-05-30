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
public final class Bebida extends Producto {
    
    //Atributos
    private String nombreBebida;
    private char tamanoBebida;
    
    //Constructor vacío

    public Bebida() {
    }
    
    //Constructor paramétrico

    public Bebida(String nombreBebida, char tamanoBebida, String codigo, int precio, int cantidad) {
        super(codigo, precio, cantidad);
        this.nombreBebida = nombreBebida;
        this.tamanoBebida = tamanoBebida;
        
    }

    //Getter and Setter
    
    public char getTamanoBebida() {
        return tamanoBebida;
    }

    public void setTamanoBebida(char tamanoBebida) {
        this.tamanoBebida = tamanoBebida;
    }

    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }
    
    
    @Override
    public void mostrar(){
    
        super.mostrar();
        System.out.println("Nombre Bebida: "+this.nombreBebida);
        System.out.println("Tamaño Bebida: "+this.tamanoBebida);
    
    }

    @Override
    public int AsignarPrecioEntrada() {
        
        int valorBebida = this.getPrecio();
        
        if(this.tamanoBebida == 'N'){
            
         valorBebida = PRECIOBEBIDANORMAL;
        
        }else{
        
            valorBebida = PRECIOBEBIDAGRANDE;
        }
        
        return valorBebida;        
        
    }
}
