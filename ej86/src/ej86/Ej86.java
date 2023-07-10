
package ej86;

public class Ej86 {

    public static void main(String[] args) {
        Libro libro1 = new Libro (8734378, "El Quijote", "Cervantes", 1376);
        System.out.println(libro1.toString());
        
        Libro libro2 = new Libro (3984738, "El Señor de los Anillos", "Tolkien", 1272);
        System.out.println(libro2.toString());
        
        libro1.getNPags();
        libro2.getNPags();
        
        if (libro1.getNPags() > libro2.getNPags()){
            System.out.println(libro1.getTitulo()+" tiene más páginas que "+
                    libro2.getTitulo()); 
        }else{
            System.out.println(libro2.getTitulo()+" tiene más páginas que "+
                    libro1.getTitulo());
        }
    }
    
}
