/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad20;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Actividad20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println ("Introduzca 3 números: ");
        Scanner scanner = new Scanner (System.in);
        
        double num1;
        double num2;
        double num3;
        
        num1 = scanner.nextDouble ();
        num2 = scanner.nextDouble ();
        num3 = scanner.nextDouble ();
        
        double mayor;
        mayor = num1;
        if (num2>mayor){
            mayor=num2;
        }
        if (num3>mayor){
            mayor=3;
        }
        
        
        double menor;
        menor = num1;
        if (num2<menor){
            menor = num2;
        }
        if (num3<0){
            menor = num3;
        }
        
        if (mayor<0){
            System.out.println ("Los números introducidos son: " + num1 + ", " + num2 + " y " +num3);
            System.out.println ("El mayor es: " + mayor);
            System.out.println ("El menor es: " + menor);
        }
         else { System.out.println ("Valores incorrectos");
        
        }
    }
    
}
