
package ej102;

public class Pelilcula extends Multimedia{
    private String actorPrin;
    private String actrizPrin;
    
    public Pelilcula (String titulo, String formato, double duracion, String actorPrin, String actrizPrin){
        super(titulo, formato, duracion);
        this.actorPrin = actorPrin;
        this.actrizPrin = actrizPrin;
    }
    
    public String getActorPrin(){
        return actorPrin;
    }
    
    public String getActrizPrin(){
        return actrizPrin;
    }
    
    public String toString(){
        return super.toString() + "\nActor principal: " + this.actorPrin + 
                "\nActriz principal: " + this.actrizPrin;
    }
    
    public boolean equals(Pelilcula peli){
        if(super.getFormato().equals(peli.getFormato()) && 
                this.getDuracion() == peli.getDuracion()){
            return true;
        }
        else{
            return false;
        }
    }
}
