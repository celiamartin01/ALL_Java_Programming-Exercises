/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio48;

/**
 *
 * @author ceemf
 */
public class Ejercicio48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int flags[] = new int []{0,1,0,-1,0,-1,-1,-1,0,0,-1};
        int tivic[] = new int [flags.length];
        
        for(int i=0; i<flags.length; i++){
            tivic[i]=flags[i];
        }
        
        for(int k=0; k<tivic.length; k++){
            if(tivic[k]<0){
                tivic[k]=8;
            }
            System.out.print(tivic[k] + " ");
        }
        
    }
    
}
