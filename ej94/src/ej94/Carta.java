
package ej94;

public class Carta {
    int numero;
    String palo;
    
   public Carta(int numero, String palo){
       this.numero = numero;
       this.palo = palo;
   }
   
   public String toString(){
       String res = "";
       
       res += numero + palo ;
       
       return res;
   }
   
}
