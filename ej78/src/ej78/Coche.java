
package ej78;

public class Coche {
    
    String color;
    double ancho;
    double alto;
    int puertas;
    int ruedas;
    boolean apagado; //True: el coche está apagado; Falso: el coche está encendido
    int gasolina;
    final int MAX_GASOLINA = 50;


    public Coche(String color, double ancho, double alto,
        int puertas){
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;
        this.puertas = puertas;
        this.ruedas = 4;
        this.apagado = true;
        this.gasolina = MAX_GASOLINA;
    }

    public void arrancar(){
        if (apagado){
            if (gasolina >= 5){
                System.out.println("Hemos arrancado el coche. Esto consume 5 litros"
                    + " de gasolina.");
            apagado = false;
            gasolina -= 5;
            }           
            else{
                System.out.println("No tienes gasolina suficiente.");
            }
        }
        else{
            System.out.println("El coche ya está arrancado.");
        }
    }
    
    public void parar(){
        if (!apagado){
            System.out.println("Hemos apagado el coche.");
            apagado = true;
        }
        else{
            System.out.println("El coche ya está apagado.");
        }
    }
    
    public void desplazarse(){
        if (!apagado){
            if (gasolina >= 20){
                System.out.println("El coche se está moviendo.");
                gasolina -= 20;
            }
            else{
                System.out.println("No tienes gasolina suficiente.");
            }
        }
        else{
            System.out.println("Debes encender el coche para realizar esta acción.");
        }
    }
    
    public void echarGasolina(int cantGasolina){
        if (apagado){
            this.gasolina += cantGasolina;
            if (this.gasolina > MAX_GASOLINA){
                this.gasolina = 50;
            }
            System.out.println("Has echado "+cantGasolina+" litros de gasolina."
                    + " Tienes "+this.gasolina+" litros totales de gasolina.");
        }
        else{
            System.out.println("Para echar gasolina, el coche debe estar apagado.");
        }
    }
    
    /*public boolean chequear(){
        if (gasolina <= 0){
            return false; //false = no hay gasolina 
        }
        else{
            return true; //true = sí hay gasolina
        }
    }*/
    
    public boolean chequear(){
        boolean check;
        if (this.gasolina <= 0){
            check = false;
        }
        else{
            check = true;
        }
        return check;
    }
    
    public String toString(){
        String res ="";
        
        res += "Coche 1\n";
        res += "-------\n";
        res += "Color: "+this.color+"\n";
        res += "Ancho: "+this.ancho+"\n";
        res += "Alto: "+this.alto+"\n";
        res += "Puertas: "+this.puertas+"\n";
        res += "Ruedas: "+this.ruedas+"\n";
        res += "Gasolina inicial: "+this.gasolina+"\n";
        return res;  
    }
    
    
    
}