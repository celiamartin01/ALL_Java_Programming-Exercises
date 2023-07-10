
package ej94;

public class Baraja {
    Carta mazo[] = new Carta[48];
    
    public Baraja(){
        for (int i = 0; i < 12; i++){
            mazo[i] = new Carta(i+1, " \u2660 ");
            mazo[i+12] = new Carta (i+1, " \u2663 ");
            mazo[i+24] = new Carta (i+1, " \u2665 ");
            mazo[i+36] = new Carta (i+1, " \u2666 ");
        }
    }
    
    public String Mostrar(){
        String res = "";
        
        for (int i = 0; i < 12; i++){
            if (i < 9){
                res += "0";
            }
            res += mazo[i] + " ";
            if (i < 9){
                res += "0";
            }
            res += mazo[i+12] + " ";
            if (i < 9){
                res += "0";
            }
            res += mazo[i+24] + " ";
            if (i < 9){
                res += "0";
            }
            res += mazo[i+36] + " ";
            
            res += "\n";
            
        }
        
        return res;
    }
}

