
package ej85;

public class Monstro {
    String nombre;
    int pE;
    int vidas;
    int pHambre;
    boolean estado; //true = vivo; false = muerto;
    
    public Monstro(String nombre){
        this.nombre = nombre;
        this.pE = 10;
        this.pHambre = 3;
        this.vidas = 3;
        this.estado = true;
    }    
    
    public void Jugar(){
        if (!estado){
            System.out.println("¡"+nombre+"está muerto!");
        }else{
        if (this.pE > 3){
            if (this.pHambre < 1){
                System.out.println("¡"+nombre+" está demasiado hambriento para jugar!");
            }
            else{
                System.out.println("¡"+nombre+" se lo está pasando en grande!");
                this.pE -= 3;
                this.pHambre -= 1;
                if (this.pE == 0 || this.pHambre == 0){
                      this.vidas -= 1;
                      if (this.vidas == 0){
                          estado = false;
                      }else{                   
                    System.out.println(nombre+" ha muerto... Por suerte, ¡aun "
                            + "le quedan "+vidas+" vidas! Revive con los valores por"
                                    + " defecto");
                    this.pE = 10;
                    this.pHambre = 3;
                      }
                    } 
                }
            }
        else{
            System.out.println("¡"+nombre+" no tiene suficientes puntos"
                        + " de energía!");
        }     
    }
    }
    
    public void Comunicarse(){
        if (!estado){
            System.out.println("¡"+nombre+"está muerto!");
        }else{
            System.out.println("¡"+nombre+" se está comunicando contigo!");
            this.pE -= 1;
            if (this.pE == 0 || this.pHambre == 0){
                      this.vidas -= 1;
                      if (this.vidas == 0){
                          estado = false;
                      }else{                   
                    System.out.println(nombre+" ha muerto... Por suerte, ¡aun "
                            + "le quedan "+vidas+" vidas! Revive con los valores por"
                                    + " defecto"); 
                    this.pE = 10;
                    this.pHambre = 3;
                      }
                    }
        
    }
    }
    
    public void Comer(String comida){
        if (!estado){
            System.out.println("¡"+nombre+"está muerto!");
        }else{
        //Su comida favorita es el pescado
        if (this.pE < 1){
            System.out.println("¡"+nombre+" no tiene suficientes puntos"
                        + " de energía!");
        }
        else{
            this.pE -= 2;
            if (comida.equals("pescado")){
            this.pHambre += 3;
            System.out.println("¡Esa es la comida favorita de "+nombre+"! Está"
                    + " saltando de felicidad. Recupera 3 puntos de hambre");
            
            }
            else{
                this.pHambre += 2;
                System.out.println(nombre+" ha recuperado 2 puntos de hambre");
            }
            if (this.pE == 0 || this.pHambre == 0){
                      this.vidas -= 1;
                      if (this.vidas == 0){
                          estado = false;
                      }else{                   
                    System.out.println(nombre+" ha muerto... Por suerte, ¡aun "
                            + "le quedan "+vidas+" vidas! Revive con los valores por"
                                    + " defecto");  
                    this.pE = 10;
                    this.pHambre = 3;
                      }
                    }
        }
        
    }
    }
    
    public void Dormir (){
        if (!estado){
            System.out.println("¡"+nombre+"está muerto!");
        }else{
        this.pE += 5;
        System.out.println(nombre+" ha ganado 5 puntos de esfuerzo");
    }
    }
}
