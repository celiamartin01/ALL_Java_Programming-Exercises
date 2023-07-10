
package ej102;

public class Multimedia {
    private String titulo;
    private String formato;
    private double duracion;
    
    public Multimedia (String titulo, String formato, double duracion){
        this.titulo = titulo;
        this.duracion = duracion;
        String tiposFormato[] = new String[] {"mp3", "wav", "aac", "mp4", "mkv",
        "mov", "flv"};
        this.formato = "mp3";
        
        int i=0;
        while (i < tiposFormato.length){
            if (formato.equalsIgnoreCase(tiposFormato[i])){
                this.formato = formato;
                i = tiposFormato.length;
            }
            i++;
        }
        
        /*
        for (int i=0; i<tiposFormato.length; i++){
            if (tiposFormato[i].equals(formato)){
                formato = tiposFormato[i];
            }
            else {
                formato = "mp3";
                i = tiposFormato.length;
            }
        }
        */
        
        /*
        int i=0;
        while (i < tiposFormato.length){
            if (tiposFormato[i].equalsIgnoreCase(formato)){
                this.formato = formato;
                i = tiposFormato.length;
            }
            i++;
        }
        if(!this.formato.equalsIgnoreCase(formato)){
            this.formato = "mp3";
        }
        */
    }
    
    public String toString(){
        return "Titulo: " + this.titulo + "\nFormato: " + this.formato + 
                "\nDuración: " + this.duracion;
    }
    
    public boolean equals(Multimedia multi){
        //return (this.formato.equals(multi.formato) && 
        //this.duracion == multi.duracion);
        if(this.formato.equals(multi.formato) && this.duracion == multi.duracion){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getFormato(){
        return this.formato;
    }
    
    public double getDuracion(){
        return this.duracion;
    }
}


