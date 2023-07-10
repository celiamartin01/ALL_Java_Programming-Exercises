
package ej84;

public class Persona {
    String nombre;
    int edad;
    boolean sexo; //True = Hombre; False = Mujer
    String pais;
    
    public Persona (String nombre, int edad, boolean sexo, String pais){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.pais = pais;
    }
    
    public String Saludar (){
        String saludo = "¡Hola! Me llamo "+this.nombre+" y soy de "+this.pais;
        return saludo;
    }
    
    public String mostrarDatos(){
        String info ="";
        
        info += "\nPersona 1\n";
        info += "---------\n";
        info += "Nombre: "+this.nombre+"\n";
        info += "Edad: "+this.edad+"\n";
        if (sexo){
            info += "Sexo: Hombre\n";
        }
        else{
            info += "Sexo: Mujer\n";
        }
        info += "País: "+this.pais+"\n";
        
        return info;
    }
    
    public String toString(){
        String info ="";
        
        info += "\nPersona 1\n";
        info += "---------\n";
        info += "Nombre: "+this.nombre+"\n";
        info += "Edad: "+this.edad+"\n";
        if (sexo){
            info += "Sexo: Hombre\n";
        }
        else{
            info += "Sexo: Mujer\n";
        }
        info += "País: "+this.pais+"\n";
        
        return info;
    }
}
