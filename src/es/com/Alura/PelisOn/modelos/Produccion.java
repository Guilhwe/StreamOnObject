package es.com.Alura.PelisOn.modelos;

public class Produccion {
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
        //Busca si el objeto es una instancia de la clase Peli
        if (this instanceof Peli) {
            //toma el objeto que llama al metodo y lo convierte en un objeto de la clase Peli
            Peli peli = (Peli) this;//usa el objeto en cuestion
            System.out.println("Director: " + peli.getDirector());
            System.out.println("Duración en minutos: " + duracionEnMinutos);
        } else if (this instanceof Serie) {
            //toma el objeto que llama al metodo y lo convierte en un objeto de la clase Serie
            Serie serie = (Serie) this;//usa el objeto en cuestion
            System.out.println("Temporadas: " + serie.getTemporadas());
            System.out.println("Capitulos: " + serie.getCapitulos());
            System.out.println("Activa: " + serie.getActiva());
            System.out.println("Minutos por capitulo: " + serie.getMinutosPorCapitulo());
        }
    }

    public void puntuar(double nota) {
        sumaNotas += nota;
        totalEvaluaciones++;
    }

    public double notaMedia() {
        return sumaNotas / totalEvaluaciones;
    }
}
