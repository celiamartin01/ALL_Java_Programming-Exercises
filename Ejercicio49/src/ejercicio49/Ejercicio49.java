/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio49;

/**
 *
 * @author ceemf
 */
public class Ejercicio49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[] = new int [100];
        int mayor=0;
        int menor=50;
        
        for(int i=0; i<lista.length; i++){
            lista[i] = (int)(Math.round(Math.random()*99)+1);
            System.out.println(lista[i]);
            
            if(lista[i]>mayor){
                mayor=lista[i];             
            }            
            
            if(lista[i]<menor){
                menor=lista[i];
            }
        }
        
        System.out.println("\nEl mayor número del array es " + mayor);
        System.out.println("El menor número del array es " + menor);
    }
    
}
