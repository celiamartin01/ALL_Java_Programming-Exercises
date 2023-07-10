
package ej97;

public class Revolver {
    
    private String modelo;
    private String marca;
    private int martillo;
    
    Bala tambor[]; //SOLO LA DEFINO, no la creo
    
    public Revolver(int numBalas, String marca, String mod){
        //paso 1
        this.modelo = mod;
        this.marca = marca;
        this.martillo = 0;
        //paso 2
        this.tambor = new Bala[numBalas];
        //Paso 3
        Bala tmp;
        int ale1, ale2;
        for (int i = 0; i < this.tambor.length; i++) {
            ale1 = (int)(Math.floor(Math.random()*20+1));
            ale2 = (int)(Math.floor(Math.random()*500+1));
            tmp = new Bala(ale1,ale2);
            this.tambor[i] = tmp;
        }
        
    }
    
    
    public String disparar(){
        String res="";
        //Disparo
        if (this.tambor[this.martillo] != null){
            res += "Se ha disparado: "+this.tambor[this.martillo].toString();
            //vacÃ­o esa celda
            this.tambor[this.martillo] = null;
        }
        else{
            res += "No hay bala para disparar...";
        }
        
        //mover el martillo
        this.martillo++;
        if (this.martillo >= this.tambor.length){
            this.martillo = 0;
        }
        return res;
        
    }
    
    
    public String toString(){
        String res ="Marca: "+this.marca+"\n";
        res +="Modelo: "+this.modelo+"\n";
        res +="TamaÃ±o del tambor: "+this.tambor.length+"\n";
        
        for (int i = 0; i < this.tambor.length; i++) {
           if (this.tambor[i] != null){
                res += this.tambor[i].toString();
           }
           else{
               res += "No hay bala\n";
           }
            
        }
        return res;
    }
    
}
