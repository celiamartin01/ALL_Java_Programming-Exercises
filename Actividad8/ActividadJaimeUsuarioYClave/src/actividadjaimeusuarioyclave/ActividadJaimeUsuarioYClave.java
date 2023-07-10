/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadjaimeusuarioyclave;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ActividadJaimeUsuarioYClave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        String usuario="";
        String contraseña="";
        
        Scanner scanner = new Scanner (System.in);        
        
        while (!"mariag".equals(usuario) || !"12A34".equals(contraseña)){
            System.out.println("Introduzca su usuario: ");
            usuario = scanner.nextLine();
            System.out.println("Introduzca su contraseña: ");
            contraseña = scanner.nextLine();
            if(!"mariag".equals(usuario) || !"12A34".equals(contraseña)){
                System.out.println("Datos incorrectos. Inténtelo de nuevo");
            }
        }
        System.out.println("¡Bienvenido!");
        
    }
    
}
