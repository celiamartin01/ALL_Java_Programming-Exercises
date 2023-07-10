
package ej88;

public class Urna {
    private int bolasBlancas;
    private int bolasNegras;
    
    public Urna(int bolasBlancas, int bolasNegras){
        this.bolasBlancas = bolasBlancas;
        this.bolasNegras = bolasNegras;
    }
    
    public int Consultar(){
        int suma = this.bolasBlancas + this.bolasNegras;
        return suma;
    }
    
    public void Introducir(char bola){
        if (bola == 'b'){
            this.bolasBlancas++;
        }
        else if (bola == 'n'){
            this.bolasNegras++;
        }
    }
    
    public char Extraer(){
        int suma = this.bolasBlancas + this.bolasNegras;
        int nAleatorio = (int)((Math.random()*1)+suma);
        if (nAleatorio <= this.bolasBlancas){
            this.bolasBlancas--;
            return 'b';
        }
        else{
            this.bolasNegras--;
            return 'n';
        }
    }
}


