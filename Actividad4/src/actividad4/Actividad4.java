/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           double media;
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
                
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Introduzca cinco números: ");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt ();
        numero3 = scanner.nextInt ();
        numero4 = scanner.nextInt ();
        numero5 = scanner.nextInt ();
        
        media = (numero1 + numero2 + numero3 + numero4 + numero5) / 5;
        
        System.out.println ("La media de " + numero1 + ", " + numero2 +
                ", " + numero3 + ", " + numero4 + " y " + numero5 + " es " + media);
        
        
    }
    
}
