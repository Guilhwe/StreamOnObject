package es.com.Alura.PelisOn.modelos;

public class Peli {
    private String nombre;
    private int añoDeEstreno;
    private boolean incluido;
    private double sumaNotas;
    private int totalEvaluaciones;
    private int duracionEnMinutos;

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }
    public boolean getIncluido() {
        return incluido;
    }
    //this es una referencia a la variable local
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAñoDeEstreno(int añoDeEstreno) {
        this.añoDeEstreno = añoDeEstreno;
    }
    
    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }


    public void info(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de estreno: " + añoDeEstreno);
        System.out.println("Incluido en StreamOn: " + incluido);
        System.out.println("Nota Media: " + notaMedia());
        System.out.println("Total de evaluaciones: " + totalEvaluaciones);
        System.out.println("Duración en minutos: " + duracionEnMinutos);
    }

    public void puntuar(double nota) {
        sumaNotas += nota;
        totalEvaluaciones++;
    }

    public double notaMedia() {
        return sumaNotas / totalEvaluaciones;
    }

        
}
