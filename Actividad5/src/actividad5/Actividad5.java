/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad5;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /* Pedir tiempo en segundos
    Dividir entre 60 para conseguir minutos
    Dividir entre 60 para conesguir horas
    
    */
       
     int segundos1;
     int segundosfin;
     int minutos;
     int horas;
            
     Scanner scanner = new Scanner (System.in);
      System.out.println ("Introduzca segundos");
      segundos1 = scanner.nextInt ();
      horas = segundos1 / 3600;
      minutos = (segundos1 - (horas * 3600)) / 60;
      segundosfin = (segundos1 - (horas * 3600)) - (minutos * 60);
      
     
        System.out.println (horas + " horas " + minutos + " minutos y " + segundosfin + " segundos");
              
             
          }
          
          
          
    }
        
    
    
   
            
    



