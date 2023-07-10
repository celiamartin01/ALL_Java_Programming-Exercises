
package ej100;

public class Operario extends Empleado{
    private int codTrabajador;
    
    public Operario(String nombre, int cod){
        super(nombre);
        this.codTrabajador = cod;
    }
    
    public int getCodTrabajador(){
        return codTrabajador;
    }
    
    public void setCodTrabajador(int codTrabajador){
        this.codTrabajador = codTrabajador;
    }
    
    public String toString(){
        return "Soy el operario " + super.getNombre() + " con el codigo " 
                + this.codTrabajador;
    }
}
