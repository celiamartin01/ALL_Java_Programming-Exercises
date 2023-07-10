/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio55;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Ejercicio55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int lista[] = new int [10];
        int num;
        int mayor=0;
        int nVeces=0;
        int posicion[] = new int [lista.length];
        
        
        for (int i=0; i<lista.length-1; i++){
            System.out.print("Introduce un número: ");
            Scanner teclado = new Scanner (System.in);
            num=teclado.nextInt();
            
            lista[i]=num;
            if(lista[i]>mayor){
                mayor=lista[i];  
            }
            
        }
        
        System.out.println("El valor máximo es el " + mayor);
        
        //Lo hago en otro for porque es cuando ya hemos hecho
        //la comprobación completa de cuál es el mayor
        for (int k=0; k<lista.length; k++){
            if(lista[k]==mayor){
                nVeces++;
            }
        }
        
        System.out.print("Aparece " + nVeces + " en las posiciones ");
        for (int j=0; j<lista.length; j++){
            if(lista[j]==mayor){
                posicion[j]=j;
                System.out.print(j + " ");
            }
        }
        
    }
    
}
