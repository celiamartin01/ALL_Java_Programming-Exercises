package ej88;

public class Test {

    public static void main(String[] args) {
        int bolasBlancas = (int) ((Math.random() * 10) + 1);
        int bolasNegras = (int) ((Math.random() * 10) + 1);

        Urna urna1 = new Urna(bolasBlancas, bolasNegras);
        System.out.println("Urna creada con "+bolasBlancas+" bolas blancas y "
        +bolasNegras+" bolas negras");

        while (urna1.Consultar() > 1) {
            char bola1 = urna1.Extraer();
            System.out.println("Se ha extraído una bola "+bola1);
            char bola2 = urna1.Extraer();
            System.out.println("Se ha extraído una bola "+bola2);

            if (bola1 == bola2) {
                urna1.Introducir('b');
                System.out.println("Se ha introducido una bola BLANCA");
            } else {
                urna1.Introducir('n');
                System.out.println("Se ha introducido una bola NEGRA");
            }
            
            System.out.println("Quedan "+urna1.Consultar()+" bolas en la urna");
        }
        
        System.out.println("Se ha extraído la bola final de color "+urna1.Extraer());
        
    }
}
