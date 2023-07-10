/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio36;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Ejercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int suma1;
        int suma2;
        int suma3;
        int suma4;
        int suma5;
        int menores1;
        int menores2;
        int menores3;
        int menores4;
        int menores5;
        
        System.out.print("Introduzca su primer número: ");
        Scanner teclado = new Scanner (System.in);
        num1=teclado.nextInt();
        
        System.out.print("Introduzca su segundo número: ");
        num2=teclado.nextInt();
        
        System.out.print("Introduzca su tercer número: ");
        num3=teclado.nextInt();
        
        System.out.print("Introduzca su cuarto número: ");
        num4=teclado.nextInt();
        
        System.out.print("Introduzca su quinto número: ");
        num5=teclado.nextInt();
        
        System.out.println("La suma de todos sus números es " + 
                (num1+num2+num3+num4+num5));
        
        if (num1>36){
            suma1=num1;
        }else{
            suma1=0;
        }
        
        if (num2>36){
            suma2=num2;
        }else{
            suma2=0;
        }
        
        if (num3>36){
            suma3=num3;
        }else{
            suma3=0;
        }
        
        if (num4>36){
            suma4=num4;
        }else{
            suma4=0;
        }
        
        if (num5>36){
            suma5=num5;
        }else{
            suma5=0;
        }
        
        System.out.println("La suma de los números mayores a 36 es " +
                (suma1+suma2+suma3+suma4+suma5));
        
        if (num1<10){
            menores1=num1;
        }else{
            menores1=0;
        }
        
        if (num2<10){
            menores2=num2;
        }else{
            menores2=0;
        }
        
        if (num3<10){
            menores3=num3;
        }else{
            menores3=0;
        }
        
        if (num4<10){
            menores4=num4;
        }else{
            menores4=0;
        }
        
        if (num5<10){
            menores5=num5;
        }else{
            menores5=0;
        }
        
        System.out.println("La suma de los números menores de 10 es " +
                (menores1+menores2+menores3+menores4+menores5));
    }
    
}
