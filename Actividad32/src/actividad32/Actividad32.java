/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad32;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Actividad32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num;
        int div2;
        int div3;
        
        System.out.println("Introduzca un número: ");
        Scanner scanner = new Scanner (System.in);
        
        num = scanner.nextInt();
        if (num%2 !=0 ||
            num%3 != 0){
        System.out.println("Este número no es divisible entre 2 y 3. Introduzca un valor diferente");
    }else {
    div2 = num/2;
    div3 = num/3;
    System.out.println(num + " entre 2 es: " + div2);
    System.out.println(num + " entre 3 es: " + div3);
}
    
    }
}
