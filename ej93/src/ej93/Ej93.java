
package ej93;

public class Ej93 {

    public static void main(String[] args) {
        Arma daga = new Arma ("Daga", 10, 7);
        Arma hacha = new Arma ("Hacha", 15, 10);
        
        Guerrero paco = new Guerrero ("Paco", 150, 20, 50, hacha);
        Guerrero eduardo = new Guerrero ("Eduardo", 100, 30, 40, daga);
        
    }
    
}
