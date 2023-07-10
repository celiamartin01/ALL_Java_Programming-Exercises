
package ej89;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private double lista[];
    
    public Estudiante(String nombre, String apellidos, int tamañoLista){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.lista = new double[tamañoLista];
        
        for (int i=0; i<lista.length; i++){
            lista[i] = -1;
        }
    }
    
    public boolean InsertarNota(double nota){
        boolean resultado = false;
        for (int i=0; i<lista.length; i++){
            if (lista[i] == -1){
                lista[i] = nota;
                i = lista.length;
                resultado = true;
            }
            else{
                resultado = false;
            }
        }
        return resultado;
    }
    
    public String MostrarNotas(){
        String listaNotas = "";
        for (int i=0; i<lista.length-1; i++){
            listaNotas += lista[i] + ", ";
        }
        listaNotas += lista[lista.length-1];
        
        return listaNotas;
    }
    
    public double CalcularMedia(){
        double notasTotal = 0;
        int cantNotas = 0;
        for (int i = 0; i < lista.length; i++){
            if (lista[i] > -1){
                notasTotal += lista[i];
                cantNotas ++;
            }
        }
        
        double media = notasTotal / cantNotas;
        return media;
    }
    
    public String IndicarRangos(){
        int insufic = 0;
        int sufic = 0;
        int notab = 0;
        int sobres = 0;
        
        for (int i = 0; i < lista.length; i++){
            if (lista[i] >= 0 && lista[i] <5){
                insufic++;
            }
            else if (lista[i] >= 5 && lista[i] < 6){
                sufic++;
            }
            else if (lista[i] >=6 && lista[i] < 9){
                notab++;
            }
            else if (lista[i] >=9 && lista[i] <= 10){
                sobres++;
            }
        }
        
        String rangos = "Insuficientes: " + insufic + "\nSuficientes: " + 
                sufic + "\nNotables: " + notab + "\nSobresalientes: " + sobres;
        return rangos;
    }
    
    public String ToString(){
        String datos = "";
        datos += "\nEstudiante: " + this.nombre + " " + this.apellidos;
        datos += "\nNotas: " + MostrarNotas();
        datos += "\nRangos:\n" + IndicarRangos();
        datos += "\nMedia: " + CalcularMedia();
        
        return datos;
    }
    
}
