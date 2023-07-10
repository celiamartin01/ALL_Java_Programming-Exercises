/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* PRIMER INTENTO, MÉTODO MANUAL */
        
        /*
        pasar frase a minúscula
        asignar número a cada tramo (subString)
        reordenar tramo
        convertir a mayúscula las letras correspondientes
        */
        
        
        
/*
        String frase = "LA LLUVIA EN SEVILLA ES UNA MARAVILLA";
        String frasemin = frase.toLowerCase ();
     
         System.out.println (frase);
         
        String lalluvia = frasemin.substring (0,10);
        String maravilla = frasemin.substring (21);        
        String sevilla = frasemin.substring (14,20);
       
        String smayus = frase.substring (13, 14);
          System.out.println (lalluvia + maravilla);
          System.out.println (smayus + sevilla + maravilla);
          
        */


String frase = "LA LLUVIA EN SEVILLA ES UNA MARAVILLA";
int S = frase.indexOf ("S");
String sevilla = frase.substring(S);
char letraS = sevilla.charAt (0);
String resultado = sevilla.substring (1); 
String resultadominus = resultado.toLowerCase(); 
System.out.println (letraS + resultadominus);
       
int E1 = frase.indexOf ("E");
String en = frase.substring (0,E1);
String enminus = en.toLowerCase();
System.out.print(enminus);

int E2 = frase.lastIndexOf("E");
String es = frase.substring (E2);
String resultado3 = es.substring (0);
String maravillamin = resultado3.toLowerCase();
System.out.println (maravillamin);


        
        
        

    }
    
}
