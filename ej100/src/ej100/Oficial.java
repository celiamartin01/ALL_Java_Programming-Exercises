
package ej100;

public class Oficial extends Operario {
    
    public Oficial (String nombre, int codTrabajador){
        super(nombre, codTrabajador);
    }
    
    public String toString(){
        return "Soy el oficial " + super.getNombre() + " con el código " + 
                super.getCodTrabajador();
    }
}
