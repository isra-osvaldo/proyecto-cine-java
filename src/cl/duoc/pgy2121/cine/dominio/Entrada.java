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
public final class Entrada extends Producto {
    
    //Atributos
    private char tipoCliente;
    private String tipoPelicula;

    //Constructor vacío
    public Entrada() {
    }
    
    //Constructor paramétrico
    
    public Entrada(char tipoCliente, String tipoPelicula, String codigo, int precio, int cantidad) {
        super(codigo, precio, cantidad);
        this.tipoCliente = tipoCliente;
        this.tipoPelicula = tipoPelicula;
    }

    
    //Getter and Setter
    
    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoPelicula() {
        return tipoPelicula;
    }

    public void setTipoPelicula(String tipoPelicula) {
        this.tipoPelicula = tipoPelicula;
    }
    
    
    @Override
    public void mostrar(){
    
        super.mostrar();
        System.out.println("Tipo Cliente: "+this.tipoCliente);
        System.out.println("Tipo Película: "+this.tipoPelicula);
    
    
    }
    
    @Override
    public int AsignarPrecioEntrada(){
    
        int valorBebida = this.getPrecio();
        
        if(this.tipoCliente == 'N'){
            
            valorBebida = PRECIOBEBIDANORMAL;
        
        }else{
        
            valorBebida = PRECIOBEBIDAGRANDE;
        }
        
        return valorBebida;
    }
    
    
}
