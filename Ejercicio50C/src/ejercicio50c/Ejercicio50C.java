/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio50c;

/**
 *
 * @author ceemf
 */
public class Ejercicio50C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int lista[] = new int [100];
        int mayor=0;
        int posicion=0;
        
        for(int i=0; i<lista.length; i++){
            lista[i] = (int)(Math.round(Math.random()*99)+1);
            
            if (lista[i]>mayor){
                mayor=lista[i];
                posicion=i;
            }
        }
        System.out.println("El mayor número es " + mayor + ". Se encuentra "
                + "en la posición " + posicion);
    }
    
}
