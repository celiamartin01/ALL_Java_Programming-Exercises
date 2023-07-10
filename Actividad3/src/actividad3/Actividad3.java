/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Solicitar números
        Leer números
        Calcular operaciones (suma, resta, multiplicación, potencia, división)
        Imprimir resultados
        */
        
        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        double potencia;
        double division;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Introduzca dos números");
        
        if (scanner.hasNextInt() == true);{
        numero1 = scanner.nextInt (); 
        numero2 = scanner.nextInt ();
        
        suma = numero1 + numero2;
        System.out.println ("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        
        resta = numero1 - numero2;
        System.out.println ("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
        
        multiplicacion = numero1 * numero2;
        System.out.println ("La multiplicación de " + numero1 + " y " + numero2 + " es: " + multiplicacion);
        
        division = numero1 / numero2;
        System.out.println ("El cociente de " + numero1 + " entre " + numero2 + " da: " + division);
        
        potencia = Math.pow(numero1, numero2);
        System.out.println (numero1 + " elevado a " + numero2 + " da: " + potencia);
        
        
        
        
    }
        
        
        
    }
    
}
