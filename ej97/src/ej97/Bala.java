
package ej97;

public class Bala {
    
    private double calibre; //mm
    private double longitud;
    
    public Bala(double c, double l){
        this.calibre = c;
        this.longitud = l;
    }
    
    public Bala(){
        this.calibre = 9;
        this.longitud = 200;
    }
    
    public String toString(){
        String res = "BALA: "+this.calibre+" mm de calibre y "+this.longitud+" mm de longitud\n";
        return res;
    }
    
}
