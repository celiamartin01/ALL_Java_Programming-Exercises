
package ej104;

public class test {
    public static void main(String[] args) {
        Profesor manolo = new Profesor ("Manolo", 7);
        for(int i=0; i<manolo.asig.length; i++){
            System.out.println(manolo.asig[i]);
        }
    }
}
