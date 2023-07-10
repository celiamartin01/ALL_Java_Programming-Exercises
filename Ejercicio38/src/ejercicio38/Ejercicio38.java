/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio38;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Ejercicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Voy a dar por hecho que las notas introducidas no tienen por qué
        //ser un número entero
        
        double nota;
        double total=0;
        double vueltas=0;
        double media=0;
        
        System.out.println("Introduzca una a una sus notas. Cuando haya"
                + " terminado, introduzca -1 para realizar la media.");
        do {
            System.out.print("Introduzca una nota: ");
            Scanner teclado = new Scanner (System.in);
            nota = teclado.nextDouble();
            
            if (nota>0){
            total = nota+total;
            vueltas = vueltas+1;
            media = total/vueltas;
            }
            
        }while (nota>0);
        
        System.out.println("La media de sus notas es " + media);
        
        
    }
    
}
