
package ej103;

public class ProdFrescos extends Productos{
    String metodoConserv;
    
    public ProdFrescos(int fechaCaducidad, int numLote, int fechaEnvasado, 
            String paisOrigen, String metodoConserv){
        super(fechaCaducidad, numLote, fechaEnvasado, paisOrigen);
        this.metodoConserv = metodoConserv;
    }
    
    public String getMetodoConserv(){
        return metodoConserv;
    }
    
    public String toString(){
        return super.toString() + "\nMétodo de conservación: " + metodoConserv;
    }
}
