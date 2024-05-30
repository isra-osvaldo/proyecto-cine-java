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
public abstract class Producto implements PreciosAplicables {
    
    //Atributos
    
    private String codigo;
    private int precio;
    private int cantidad;
    
    //Constructor vacío

    public Producto() {
    }
    
    
    //Constructor paramétrico

    public Producto(String codigo, int precio, int cantidad) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
 
    //Getter and Setter
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    public void mostrar(){
    
        System.out.println("Código: "+this.codigo);
        System.out.println("Precio: $"+this.precio);
        System.out.println("Cantidad: "+this.cantidad);
    
    }
   
    
    public int calcularTotal(){
    
        int total = 0;
        
        total = this.cantidad * this.AsignarPrecioEntrada();

        return total;
    }
    
    
}
