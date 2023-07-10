/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad46;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Actividad46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int total;
        double turnoDecimal;
        int turno;
        int fin=0;
        double sacarDecimal;
        int sacar;
        
        System.out.print("Introduce un número entero: ");
        Scanner teclado = new Scanner (System.in);
        total = teclado.nextInt();
        
        while (total<0){
            System.out.println("El número debe ser positivo");
            System.out.print("Introduce un número entero: ");
            total = teclado.nextInt();
        }
        //num es el número de bolas que habrá en la urna
        
        System.out.println("Hay " +total+ " bolas en la urna");
        
        turnoDecimal=Math.random() *2;
        turno=(int)turnoDecimal;
        
        switch(turno){
            case 0: System.out.println("Empieza la máquina");
            break;
            case 1: System.out.println("Empiezas tú");
            break;
        }
       
            if (turno==0){
                do{
                sacarDecimal=(Math.random()+1)*4;
                sacar=(int)sacarDecimal;
                
                switch(sacar){
                    case 1: fin=(total-1);
                    break;
                    case 2: fin=(total-2);
                    break;
                    case 3: fin=(total-3);
                    break;
                  }                
                System.out.println("La máquina saca " +sacar+ " bolas");
                System.out.println("Quedan " +fin+ " bolas");
                
                if (fin>0){
                    System.out.print("Es tu turno. ¿Cuántas bolas quieres sacar? ");
                    sacar=teclado.nextInt();
                    
                    while (sacar>3){
                        System.out.println("Sólo puedes sacar 1, 2 o 3"
                                    + " bolas");
                        System.out.print("¿Cuántas bolas quieres sacar?");
                        sacar=teclado.nextInt();
                        }
                    
                    fin=total-sacar;
                    
                        System.out.println("Sacas " +sacar+ " bolas");
                        System.out.println("Quedan " +fin+ "bolas");
                              
                }else{
                    System.out.println("¡Has ganado!");
                }
                
                
                }while(fin>0);
                
                }else if(turno==1){
                        System.out.println("Es tu turno");
                        }
                
        
        
        
        
    
    
}
}