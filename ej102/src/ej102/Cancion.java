
package ej102;

public class Cancion extends Multimedia{
    private String artista;
    private String editor;
    private String genero;
    
    public Cancion (String titulo, String formato, double duracion,
            String artista, String editor, String genero){
        super(titulo, formato, duracion);
        this.artista = artista;
        this.editor = editor;
        String tiposGenero[] = new String[] {"pop", "rock", "flamenco", 
        "hiphop", "R&B", "reggaeton"};
        
        int i=0;
        while (i < tiposGenero.length){
            if (tiposGenero[i].equalsIgnoreCase(genero)){
                this.genero = formato;
                i = tiposGenero.length;
            }
            i++;
        }
        if(!this.genero.equalsIgnoreCase(formato)){
            this.genero = "pop";
        }
    }
    
    public String getArtista(){
        return artista;
    }
    
    public String getEditor(){
        return editor;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public String toString(){
        return super.toString() + "\nArtista: " + this.artista + "\nEditor: "
                + this.editor + "\nGenero: " + this.genero;
    }
}
