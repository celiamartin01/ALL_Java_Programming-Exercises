/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Solicitar nombre, DNI y fecha de nacimiento
        Escanear 
        Mostrar
        
        */
        String nombre;
        String dni;
        String nacimiento;
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Nombre");
     
        if (scanner.hasNextInt() == true); {
        nombre = scanner.next();
        
    }
        
        
        System.out.println ("DNI");
        
        if (scanner.hasNextInt () == true); {
        dni = scanner.next ();
       
    }
        
        
        
        System.out.println ("Fecha de nacimiento");
        
        if (scanner.hasNextInt () == true); {
        nacimiento = scanner.next();
        
        System.out.println (" ");
        System.out.println ("Nombre...............: " + nombre);
        System.out.println ("Fecha de nacimiento..: " + nacimiento);
        System.out.println ("DNI..................: " + dni);
    }
        
        
    }
    
}
