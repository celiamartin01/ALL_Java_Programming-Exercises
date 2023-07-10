/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio57;

/**
 *
 * @author ceemf
 */
public class Ejercicio57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int menor = 101;
        int lista[] = new int[10];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.round(Math.random() * 99) + 1);
            System.out.print(lista[i] + " ");
        }
        System.out.println("");

        int posicion = 0;
        int posMenor = 0;
        do {
            for (int k = posicion; k < lista.length; k++) {
                if (lista[k] < menor) {
                    menor = lista[k];
                    posMenor = k;
                }
            }
            lista[posMenor] = lista[posicion];
            lista[posicion] = menor;
            posicion++;
            menor = 101;
        } while (posicion != lista.length);

        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }

}
