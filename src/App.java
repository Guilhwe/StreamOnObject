import es.com.Alura.PelisOn.Calculos.CalculadoraDeTiempo;
import es.com.Alura.PelisOn.modelos.Peli;
import es.com.Alura.PelisOn.modelos.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        Peli pelicula1 = new Peli();
        pelicula1.setNombre("Un monstruo viene a verme");
        pelicula1.setAñoDeEstreno(2016);
        pelicula1.setDuracionEnMinutos(108);
        pelicula1.setDirector("J.A. Bayona");
        
        pelicula1.puntuar(8.5);
        pelicula1.puntuar(9.0);
        pelicula1.puntuar(7.5);
        pelicula1.puntuar(8.0);
        
        
        Serie serie1 = new Serie();
        serie1.setNombre("El baile de las luciérnagas");
        serie1.setAñoDeEstreno(2021);
        
        serie1.setTemporadas(1);
        serie1.setCapitulos(8);
        serie1.setActiva(true);
        serie1.setMinutosPorCapitulo(50);

    Peli pelicula2 = new Peli();
    pelicula2.setNombre("Dos rubias de pelo en pecho");
    pelicula2.setAñoDeEstreno(2004);
    pelicula2.setDuracionEnMinutos(109);
    pelicula2.setDirector("Keenen Ivory Wayans");

    CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
    calculadora.añadirProduccion(pelicula1);
    calculadora.añadirProduccion(serie1);
    calculadora.añadirProduccion(pelicula2);
    System.out.println("El tiempo total de visualización es de: " + calculadora.getTiempoTotal() + " minutos");
        
    }
}
