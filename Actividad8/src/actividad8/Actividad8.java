/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad8;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Actividad8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println ("Introduzca el número de caras que tendrá su dado");
        Scanner scanner = new Scanner (System.in);
        int caras = scanner.nextInt ();
       
        double dado = Math.random()*caras;
        double dadoentero = Math.floor (dado);
        System.out.println ("Ha salido el número " + dadoentero);
        
        /* A veces, me da como resultado el número 0; como lo evito?
           (cuando sale de resultado 0,3 x ejemplo, lo redondea hacia 0)
        
        convertir en int para que no aparezca el .0 ?
        */
    }
    
}
