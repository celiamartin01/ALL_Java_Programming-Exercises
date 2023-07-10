/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
        do{
            System.out.print("Introduzca un número: ");
            Scanner teclado = new Scanner (System.in);
            num = teclado.nextInt();
        
            if ((num%2==0) &&
                (num%3==0)){
                System.out.println(num + " / " + 2 + " = " + (num/2));
                System.out.println(num + " / " + 3 + " = " + (num/3));
            }else{
             System.out.print("Este número no es divisible entre 2 y 3."); 
            }
        }while ((num%2!=0) || (num%3!=0));
        }
        
        
    }
    

