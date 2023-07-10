
package ej93;

public class Arma {
    private String nombre;
    private int resist;
    private int poder;
    private int nivel;
    
    public Arma(String nombre, int resist, int poder){
        this.nombre = nombre;
        this.resist = resist;
        this.poder = poder;
        this.nivel = 1;
    }
    
    public void subirNivel(){
        this.nivel++;
        this.resist += 2;
        this.poder++;  
    }
    
    public void mejorarArma(String nombreArma){
        if (nombreArma == nombre){
            subirNivel();
        }
    }
    
    public String toString(){
        String res = "";
        
        res += "Nombre: " + this.nombre;
        res += "\nResistencia: " + this.resist;
        res += "\nPoder: " + this.poder;
        res += "\nNivel: " + this.nivel;
        
        return res;
    }
    
    public int getPoder(){
        return this.poder;
    }
    
    public int getResist(){
        return this.resist;
    }
    
    public void setResist(int nuevaResist){
        this.resist = nuevaResist;
    }
    
    public int getNivel(){
        return this.nivel;
    }
    
    public void setNivel(int nuevoNivel){
        this.nivel = nuevoNivel;
    }
}
