
package ej93;

public class Guerrero {
    
    private String nombre;
    private int saludActual;
    private int pAtaque;
    private int pEscudo;
    private int saludMax;
    boolean muerto; //true: muerto, false: vivo
    Arma arma1;
    private int nivel;
    private int expActual;
    private int siguienteNivel;
    
    public Guerrero (String nombre, int saludMax, int pAtaque, int pEscudo,
            Arma arma1){
        this.nombre = nombre;
        this.pAtaque = pAtaque;
        this.pEscudo = pEscudo;
        this.saludActual = saludMax;
        this.saludMax = saludMax;
        this.arma1 = arma1;
        this.nivel = 1;
        this.expActual = 0;
        this.siguienteNivel = (int)Math.ceil(this.nivel * 10 + this.nivel
                * 1.5);
    }
    
    public int Atacar(Guerrero guerrero2){
        int dañoTotal = 0;
        if (muerto){
            System.out.println(this.nombre + " está muerto.");
        }
        else{
            this.arma1.setResist(arma1.getResist() - 1);
            if (arma1.getResist() < 0){
                dañoTotal += this.pAtaque - guerrero2.getPEscudo();
                if (dañoTotal > 0){
                    guerrero2.saludActual -= dañoTotal;
                
                    this.expActual += 5;
                    if (this.expActual >= this.siguienteNivel){
                        subidaNivel();
                    }
                }
            }
            else{
                dañoTotal += this.pAtaque + this.arma1.getPoder() -
                    guerrero2.getPEscudo();
                
                guerrero2.saludActual -= dañoTotal;
                
                this.expActual += 3;
                if (this.expActual >= this.siguienteNivel){
                    subidaNivel();
                }
            }
            if (guerrero2.saludActual < 0){
                guerrero2.muerto = true;
            }
        }
        return dañoTotal;
    }
    
    public boolean subir(){
        boolean subirNivel = false;
        if (expActual == siguienteNivel){
            subirNivel = true;
        }
        else{
            subirNivel = false;
        }
        return subirNivel;
    }
    
    public void subidaNivel(){
        this.nivel++;
        this.expActual = 0;
        this.siguienteNivel = (int)Math.ceil(this.nivel * 10 + this.nivel
                * 1.5);
        this.pAtaque++;
        this.pEscudo++;
        this.saludMax += 10;
    }
    
    public int getPEscudo(){
        return this.pEscudo;
    }
    
    public String toString(){
        String res = "";
        
        res += "Nombre: " + this.nombre;
        res += "\nAtaque: " + this.pAtaque;
        res += "\nEscudo: " + this.pEscudo;
        res += "\nSalud máxima: " + this.saludMax;
        res += "\nSalud actual: " + this.saludActual;
        res += "\nNivel: " + this.nivel;
        res += "\nExperiencia actual: " + this.expActual;
        
        return res;
    }
}
