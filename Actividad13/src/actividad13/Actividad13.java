/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*
        Solicitar dimensiones habitación (m)
                  lado de la baldosa (cm)
                  precio cada baldosa (€)
        Calcular baldosas necesarias para cubrir habitación
                alto*ancho habitación
                metros habitación/metros baldosas
        Calcular precio total
                precio baldosas*precio
        */
        
        System.out.println ("Introduce el largo de la habitación:");
        Scanner scanner = new Scanner (System.in);
        double mlargohab;
        mlargohab = scanner.nextDouble();
        
        System.out.println ("Introduce el ancho de la habitación:");
        double manchohab;
        manchohab = scanner.nextDouble();
        
            
        double cmlargohab;
        double cmanchohab;
        cmlargohab = mlargohab * 100;
        cmanchohab = manchohab * 100;
        
        double areahab;
        areahab = cmlargohab * cmanchohab;
        
        /* La habitación mide areahab*/
                
        System.out.println ("¿Cuántos cm mide el lado de la baldosa?:");
        double cmladobaldosa;
        cmladobaldosa = scanner.nextDouble();
        
        double cmbaldosa;
        cmbaldosa = cmladobaldosa*cmladobaldosa;
        
        
        /* Una baldosa mide cmbaldosa*/
 
        double baldosashab;
        baldosashab = areahab/cmbaldosa;
 
        System.out.println ("Necesitas " + baldosashab + " baldosas");
        
        System.out.println ("¿Cuál es el precio de una baldosa (en euros)?:");
        double eurbaldosa;
        eurbaldosa = scanner.nextDouble();
        
        double total;
        total = eurbaldosa * baldosashab;
        double totalfin = Math.ceil(total);
         /* ¿REDONDEAR HACIA ARRIBA? */
         
         System.out.println ("El precio total a invertir es de " + totalfin + " euros");
         
       
        
    }
    
}
