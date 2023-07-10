
package ej89;

public class Ej89 {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Celia", "Martín Fuentes", 3);
        
        System.out.println(estudiante1.InsertarNota(8));
        System.out.println(estudiante1.InsertarNota(7));
        System.out.println(estudiante1.InsertarNota(9));
        System.out.println(estudiante1.InsertarNota(9));
        System.out.println(estudiante1.MostrarNotas());
        System.out.println(estudiante1.CalcularMedia());
        
        System.out.println(estudiante1.IndicarRangos());
        System.out.println(estudiante1.ToString());
    }
    
}
