
package ej104;

public class Profesor {
    String nombre;
    Asignatura asig[];
    int horasProfe;
    boolean dandoClase;
    
    public Profesor (String nombre, int numAsig){
        this.nombre = nombre;
        dandoClase = false;
        
        int asigAle = (int)((Math.random()*numAsig)+1);
        asig = new Asignatura[asigAle];
        for(int i=0; i<asig.length; i++){
            int codAle = (int)((Math.random()*100)+1);
            int horaAle = (int)((Math.random()*3)+5);
            asig[i] = new Asignatura(codAle, horaAle);
        }
        
        
    }
}
