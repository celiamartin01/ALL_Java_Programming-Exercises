/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio33;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int base;
        int exponente;
        int res=1;
        
        System.out.print("Introduzca el número que desea elevar: ");
        Scanner teclado = new Scanner (System.in);
        base = teclado.nextInt();
        
        System.out.print("Intoduzca el número al que desea elevarlo: ");
        exponente = teclado.nextInt();
        
        int i;
        for (i=1; i<=exponente; i++){
            res=base*res;
        }
        
        System.out.println (base + " elevado a " + exponente + " es " + res);
    }
    
}
