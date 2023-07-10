/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio66;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String ruta="src/ejercicio66/";
        FileReader lector;
        BufferedReader mibuffer;
        
        System.out.print("Indique el nombre del fichero que desea leer: ");
        String fichero;
        
        Scanner teclado = new Scanner (System.in);
        fichero=teclado.nextLine();
        
        if (fichero.equals("")){
            ruta=ruta+"aurora.txt";
        }else{
            ruta=ruta+fichero;
        }
        
        try{
            lector = new FileReader (ruta);
            mibuffer = new BufferedReader (lector);
            
            String linea ="";
            
            do{
                linea = mibuffer.readLine();
                if (linea != null){
                    System.out.println(linea);
                }
            }while (linea != null);
            
            mibuffer.close();
            lector.close();
            
        }catch (IOException e){
            System.out.println("ERROR leyendo el fichero");
        }
        
    }
    
}
