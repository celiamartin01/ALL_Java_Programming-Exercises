/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio54;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Ejercicio54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valores [] = new int []{2, 4, 6, 8, 1, 3, 5, 7};
        boolean comprobacion=true;
        
        System.out.print("Introduce un número: ");
        Scanner teclado = new Scanner(System.in);
        int num;
        num = teclado.nextInt();      
        
        for (int i=0; i<valores.length; i++){
            if(num==valores[i]){
                System.out.println(num + " se encuentra en el array");
                i=valores.length;
            }else{
                comprobacion=false;
            }
        }
        if (comprobacion==false){
            System.out.println(num + " no se encuentra en el array");
        }
        
    }
        
        
    }
    

