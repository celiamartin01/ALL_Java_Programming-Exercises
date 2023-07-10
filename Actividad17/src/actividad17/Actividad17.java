/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad17;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Actividad17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Introduzca su contraseña: ");
        Scanner scanner = new Scanner (System.in);
        
        String contraseña;
        contraseña = scanner.nextLine();
        
        System.out.println ("Introdúzcala de nuevo para su confirmación: ");
        Scanner scanner2 = new Scanner (System.in);
        
        String contraseña2;
        contraseña2 = scanner2.nextLine();
                
        if (contraseña.equals(contraseña2)) {
            System.out.println ("Contraseña confirmada");
        }
        else {
            System.out.println ("Contraseña incorrecta");
        }
        
        
    }
    
}
