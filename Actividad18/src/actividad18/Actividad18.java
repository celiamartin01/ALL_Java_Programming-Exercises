/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad18;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Actividad18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println ("Introduzca dos números: ");
        
        double n1;
        double n2;
        
        Scanner scanner = new Scanner (System.in);
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();        
        
        if (n1>n2) {
            double resta;
            resta = n1 - n2;
            System.out.println (n1 + " menos " + n2 + " es " + resta);
            
            double division;
            division = n1/n2;
            System.out.println (n1 + " entre " + n2 + " es " + division);
        }
        else {
            double suma;
            suma = n1 + n2;
            System.out.println (n1 + " mas " + n2 + " es " + suma);
            
            double multi;
            multi = n1*n2;
            System.out.println (n1 + " por " + n2 + " es " + multi);
            
            
                    
        }
    }
    
}
