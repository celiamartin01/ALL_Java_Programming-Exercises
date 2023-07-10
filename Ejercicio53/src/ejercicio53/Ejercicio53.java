/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio53;

/**
 *
 * @author ceemf
 */
public class Ejercicio53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valores [] = new int []{2,4,6,8,1,3,5,7};
        int copia [] = new int [(valores.length)+2];
        
        for (int i=0; i<valores.length; i++){
            copia[i]=valores[i];
            System.out.print(copia[i] + " ");
            for (int k=0; k<valores.length; k++){
                if(k==3){
                    copia[3]=200;
                    copia[k+1]=valores[k];
                    System.out.print(copia[k]);
                }
            }
            
           System.out.print(copia[i] + " ");
        }
        
    }
    
}
