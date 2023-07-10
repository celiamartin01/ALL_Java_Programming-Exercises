/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad30;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num1;
        int num2;
        int i;
        
        System.out.println ("Introduzca el primer número: ");
        Scanner scanner = new Scanner (System.in);
        num1 = scanner.nextInt ();
        System.out.println ("Introduzca el segundo número: ");
        num2 = scanner.nextInt ();
        
         for(i = num1 ; i<=num2; i++){
            System.out.print(i + " ");
        }
         
        if(num1>=num2) {
            System.out.println("Introduzca primero el número más pequeño");
        } else {
            
        }

                
                
       
        
    }
    
}
