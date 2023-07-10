package ej78;

public class Ej78 {
    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Azul",1.5,1.8,4);
        
        System.out.println(coche1.toString());
        coche1.arrancar();
        coche1.parar();
        coche1.parar();
        coche1.echarGasolina(7);
        
        System.out.println(coche1.chequear());
        
    }
    
}
