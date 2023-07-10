
package ej103;

public class ProdRefrigerados extends Productos{
    int codSuperv;
    double tempMantenim;
    
    public ProdRefrigerados(int fechaCaducidad, int numLote, int fechaEnvasado, 
             String paisOrigen, int codSuperv, double tempMantenim){
        super(fechaCaducidad, numLote, fechaEnvasado, paisOrigen);
        this.codSuperv = codSuperv;
        this.tempMantenim = tempMantenim;
    }
    
    public int getCodSuperv(){
        return codSuperv;
    }
    
    public String toString(){
        return super.toString() + "\nCódigo del organismo de supervisión: " +
                codSuperv + "\nTemperatura de mantenimiento recomendada: " 
                + tempMantenim;
    }
}
