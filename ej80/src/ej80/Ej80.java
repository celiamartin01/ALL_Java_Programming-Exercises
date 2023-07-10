
package ej80;

public class Ej80 {

    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera (0);
        cafetera1.echarCafe(50);
        cafetera1.llenarCafetera();
        cafetera1.servirTaza(43);
        
        //String ccCafe = cafetera1.cantidadCafe();
        //System.out.println(ccCafe);
        
        System.out.println(cafetera1.cantidadCafe());
    }
    
}
