public class Peli {
    String nombre;
    int añoDeEstreno;
    boolean incluido;
    double nota;
    int totalEvaluaciones;
    int duracionEnMinutos;

    void info(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de estreno: " + añoDeEstreno);
        System.out.println("Incluido en Netflix: " + incluido);
        System.out.println("Nota: " + nota);
        System.out.println("Total de evaluaciones: " + totalEvaluaciones);
        System.out.println("Duración en minutos: " + duracionEnMinutos);
    }
}
