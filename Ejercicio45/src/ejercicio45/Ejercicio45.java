/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio45;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numRandom = (int)Math.floor((Math.random()*100)+1); 
        System.out.println(numRandom);
        /*
        Para indicar un intervalo en Math.random hay que multiplicarlo por el
        valor máximo del intervalo +1 (+1 pq no incluye el último número del 
        intervalo)
        Le sumo 1 al random para que el valor nunca sea 0
        */
        
     //   ESTO NO ES CORRECTO!! FÓRMULA EMPLEADA
     
        //int numRandomEntero = (int) numRandom;
        /*
        Esto es hacer un cast, convertir un double en un int. Con esto el 
        programa no hace un redondeo, sino que simplemente quita los decimales
        (aunque salga 5,99999 el resultado es 5)
        */
        
        int numUser;
        
        do{
            System.out.print("Introduce un número entero: ");
            Scanner teclado = new Scanner (System.in);
            numUser=teclado.nextInt();
            
            if (numUser>numRandom){
                System.out.println("¡¡Te has pasado!!");
            }
            else if (numUser<numRandom){
                System.out.println("¡¡Te has quedado corto!!");
            }
        }while(numUser != numRandom);
        
            System.out.println("¡¡Lo lograste!!");
        }

        
    }
    

