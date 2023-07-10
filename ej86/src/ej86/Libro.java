
package ej86;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int nPags;
    
    public Libro(int ISBN, String titulo, String autor, int nPags){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nPags = nPags;
    }
    
    public void setISBN (int nuevoISBN){
        this.ISBN = nuevoISBN;
    }
    
    public int getISBN(){
        return this.ISBN;
}
    
    public void setTitulo(String nuevoTitulo){
        this.titulo = nuevoTitulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setAutor(String nuevoAutor){
        this.autor = nuevoAutor;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void setNPags(int nuevoNPags){
        this.nPags = nuevoNPags;
    }
    
    public int getNPags(){
        return this.nPags;
    }  
    
    public String toString(){
        String resultado = "";
        
        resultado+= "El libro "+this.titulo+" con ISBN "+this.ISBN+" creado por "
                +this.autor+" tiene "+nPags+" páginas";
        
        return resultado;
    }
}

