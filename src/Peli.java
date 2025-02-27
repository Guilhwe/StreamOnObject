public class Peli {
    String nombre;
    int añoDeEstreno;
    boolean incluido;
    private double sumaNotas;
    private int totalEvaluaciones;
    int duracionEnMinutos;

    int gettotalEvaluaciones() {
        return totalEvaluaciones;
    }

    void info(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de estreno: " + añoDeEstreno);
        System.out.println("Incluido en StreamOn: " + incluido);
        System.out.println("Nota Media: " + notaMedia());
        System.out.println("Total de evaluaciones: " + totalEvaluaciones);
        System.out.println("Duración en minutos: " + duracionEnMinutos);
    }

    void puntuar(double nota) {
        sumaNotas += nota;
        totalEvaluaciones++;
    }

    double notaMedia() {
        return sumaNotas / totalEvaluaciones;
    }

        
}
