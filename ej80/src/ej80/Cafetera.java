
package ej80;

public class Cafetera{
    //final int CAPACIDAD_MAXIMA = 1000;
    int capacidadMaxima;
    int capacidadActual;

    public Cafetera(int capacidadActual){
        this.capacidadActual = capacidadActual;
        this.capacidadMaxima = 1000;
    }


    public void echarCafe(int cant){
        this.capacidadActual += cant;
        if (this.capacidadActual > this.capacidadMaxima){
            this.capacidadActual = this.capacidadMaxima;
            System.out.println("¡Has echado demasiado! La cafetera se ha desbordado");
        }
        else{
            System.out.println("Hemos echado café");
        }
    }
    
    public void llenarCafetera(){
        if (this.capacidadActual == this.capacidadMaxima){
            System.out.println("La cafetera ya está llena");
        }
        else{
            this.capacidadActual = this.capacidadMaxima;
            System.out.println("Hemos llenado la cafetera al máximo");
        }
    }
    
    public void vaciarCafetera(){
        if (this.capacidadActual == 0){
            System.out.println("La cafetera ya está vacía");
        }
        else{
            this.capacidadActual = 0;
            System.out.println("Hemos vaciado la cafetera");
        }
    }
    
    public void servirTaza(int cantTaza){
        if (this.capacidadActual >= cantTaza){
            this.capacidadActual -= cantTaza;
            System.out.println("Hemos servido una taza");
        }
        else{
            System.out.println("No hay suficiente café para servir esa taza");
        }
    }
    
    public String cantidadCafe(){
        String res = "Hay "+this.capacidadActual+" cc de café en esta cafetera";
        return res;
    }
    

}