
package ej103;

public class ProdCongelados extends Productos{
    double tempMantenim;
    
    public ProdCongelados(int fechaCaducidad, int numLote, int fechaEnvasado, 
            double tempMantenim, String paisOrigen){
        super(fechaCaducidad, numLote, fechaEnvasado, paisOrigen);
        this.tempMantenim = tempMantenim;
    }
    
    public double getTempMantenim(){
        return tempMantenim;
    }
    
    public String toString(){
        return super.toString() +  "\nTemperatura de mantenimiento: " +
                tempMantenim;
    }
}
