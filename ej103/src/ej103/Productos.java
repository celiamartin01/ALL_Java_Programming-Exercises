
package ej103;

public class Productos {
    private int fechaCaducidad;
    private int numLote;
    private int fechaEnvasado;
    private String paisOrigen;
    
    public Productos (int fechaCaducidad, int numLote, int fechaEnvasado, 
            String paisOrigen){
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
    }
    
    public int getFechaCaducidad(){
        return fechaCaducidad;
    }
    
    public int getNumLote(){
        return numLote;
    }
    
    public int getFechaEnvasado(){
        return fechaEnvasado;
    }
    
    public String getPaisOrigen(){
        return paisOrigen;
    }
    
    public String toString(){
        return "Fecha caducidad: " + fechaCaducidad + "\nNúmero de lote: " +
                numLote + "\nFecha de envasado: " + fechaEnvasado;
    }
}
