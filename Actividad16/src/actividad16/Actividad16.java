/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad16;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Actividad16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println ("Introduzca sus notas: ");
        Scanner scanner = new Scanner (System.in);
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        nota1 = scanner.nextDouble ();
        nota2 = scanner.nextDouble ();
        nota3 = scanner.nextDouble ();
        
        media = (nota1 + nota2 + nota3)/3;
        
        if (media >6.5){
            System.out.println ("Promocionado con una media de " + media);
        }
        else{
            System.out.println ("No promocionas");
        }
    
    
    }
    
    

    
}
