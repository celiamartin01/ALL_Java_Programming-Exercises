
package ej87;

public class Ej87 {

    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta ("Celia Martín", 20);
        cuenta1.Ingresar(300);
        cuenta1.Retirar(10);
        System.out.println(cuenta1.toString());
    }
    
}
