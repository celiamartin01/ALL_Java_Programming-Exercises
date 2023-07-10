/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad21;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println ("Introduzca un año: ");
        Scanner scanner = new Scanner (System.in);
        
        int año;
    
        año = scanner.nextInt();
        
        int div4 = año % 4;
        int div100 = año % 100;
        int div400 = año % 400;
                
        if (div4 == 0 && div100 != 0 || div400 == 0){
            System.out.println (año + " es un año bisiesto");
        } else {
            System.out.println(año + " no es un año bisiesto");
        }
            

    }
    
}
