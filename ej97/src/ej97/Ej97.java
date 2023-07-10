
package ej97;

public class Ej97 {

    public static void main(String[] args) {
        
        Revolver piun = new Revolver(6, "Winchester", "Wenorro");
        System.out.println(piun);
        
        for (int i = 0; i < 22; i++) {
            System.out.println(piun.disparar());
        }
        
        
        System.out.println(piun);
        
    }
    
}
