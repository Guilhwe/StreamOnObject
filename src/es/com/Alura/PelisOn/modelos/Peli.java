package es.com.Alura.PelisOn.modelos;

public class Peli {
    public String nombre;
    public int añoDeEstreno;
    public boolean incluido;
    private double sumaNotas;
    private int totalEvaluaciones;
    public int duracionEnMinutos;

    public int gettotalEvaluaciones() {
        return totalEvaluaciones;
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
