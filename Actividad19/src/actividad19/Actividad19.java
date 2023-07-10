/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad19;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Actividad19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double num1;
        double num2;
        double num3;
        double num4;
        double num5;
        double mayor;
        
        System.out.println ("Introduzca 5 números: ");
        Scanner scanner = new Scanner (System.in);
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();
        num4 = scanner.nextDouble();
        num5 = scanner.nextDouble();
        
        double menor;
        menor=num1;
        if (num2 < menor){
            menor=num2;
        }
        if (num3 < menor){
            menor=num3;
        } 
        
        if (num4 < menor){
            menor=num4;
        }
        if (num5 < menor){
            menor=num5;
        }
        if (menor<0){
            System.out.println ("Número erróneo, todos los valores deben ser mayor que 0");
        }
        
        else {
        
        mayor=num1;
        if (num2 > mayor){
            mayor=num2;
        }
        if (num3 > mayor){
            mayor=num3;
        } 
        
        if (num4 > mayor){
            mayor=num4;
        }
        if (num5 > mayor){
            mayor=num5;
        }
       
        System.out.println (mayor);
            
    }
    }
}
