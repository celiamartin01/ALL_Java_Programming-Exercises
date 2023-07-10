
package ej104;

public class Asignatura {
    int codigo;
    int horasAsig;
    
    public Asignatura (int codigo, int horasAsig){
        this.codigo = codigo;
        this.horasAsig = horasAsig;
    }
    
    public String toString(){
        return "Codigo: " + codigo + "\nNúmero de horas: " + horasAsig;
    }
}
