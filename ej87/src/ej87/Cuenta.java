
package ej87;

public class Cuenta {
    private String titular;
    private double cantidad;
    
    public Cuenta(String titular){
        this.titular = titular;
        this.cantidad = 0;
    }
    
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public void setTitular(String nuevoTitular){
        this.titular = nuevoTitular;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public void setCantidad(double nuevaCantidad){
        this.cantidad = nuevaCantidad;
    }
    
    public double getCantidad(){
        return this.cantidad;
    }
    
    public void Ingresar(double dinero){
        this.setCantidad(this.cantidad+=dinero);
    }
    
    public void Retirar(double dinero){
        this.setCantidad(this.cantidad-=dinero);
    }
    
    public String toString(){
        String resultado = "";
        
        resultado+= "Esta cuenta pertenece a "+this.titular+" y posee actualmente"
                + "una cantidad de "+this.cantidad+"€";
        
        return resultado;
    }
    
}
