/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad31;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Actividad31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num;
        int i;
        
        System.out.println("Introduzca un número entero: ");
        Scanner scanner = new Scanner (System.in);
        num = scanner.nextInt();
        
        for (i=0; i<=num; i++){
            if (num%i == 0){
                System.out.println (i + " ");
            }
        }
        
        
    }
    
}
