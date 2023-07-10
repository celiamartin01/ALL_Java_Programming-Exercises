/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad36;

import java.util.Scanner;

/**
 *
 * @author ceemf
 */
public class Actividad36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int suma;
        int mayor1;
        int mayor2;
        int mayor3;
        int mayor4;
        int mayor5;
        int suma36;
        int menor1;
        int menor2;
        int menor3;
        int menor4;
        int menor5;
        int suma10;
        Scanner scanner = new Scanner (System.in);        
        
        System.out.println("Introduce tu primer número: ");
        num1 = scanner.nextInt();
        System.out.println("Introduce tu segundo número: ");
        num2 = scanner.nextInt();
        System.out.println("Introduce tu terecer número: ");
        num3 = scanner.nextInt();
        System.out.println("Introduce tu cuarto número: ");       
        num4 = scanner.nextInt();
        System.out.println("Introduce tu quinto número: ");
        num5 = scanner.nextInt();
                            
        suma= num1 + num2 + num3 + num4 + num5;
        System.out.println("La suma de todos estos números es: " + suma);
        
        if (num1>36){
            mayor1=num1;
        }else{
            mayor1=0;
        }
        
        if (num2>36){
            mayor2=num2;
        }else{
            mayor2=0;
        }
        
        if (num3>36){
            mayor3=num3;
        }else{
            mayor3=0;
        }
        
        if (num4>36){
            mayor4=num4;
        }else{
            mayor4=0;
        }
        
        if (num5>36){
            mayor5=num5;
        }else{
            mayor5=0;
        }
        
        suma36 = mayor1 + mayor2 + mayor3 + mayor4 + mayor5;
        System.out.println("La suma de los números mayores a 36 es: " + suma36); 
        
        if (num1<10){
            menor1=num1;
        }else{
            menor1=0;
        }
        
        if (num2<10){
            menor2=num2;
        }else{
            menor2=0;
        }
        
        if (num3<10){
            menor3=num3;
        }else{
            menor3=0;
        }
        
        if (num4<10){
            menor4=num4;
        }else{
            menor4=0;
        }
        
        if (num5<10){
            menor5=num5;
        }else{
            menor5=0;
        }
        
        suma10=menor1 + menor2 + menor3 + menor4 + menor5;
        System.out.println("La suma de los números menores a 10 es: " + suma10);
        
        
        
    }
    
}
