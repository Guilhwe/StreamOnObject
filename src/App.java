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
         pelicula1.info();
         serie1.info();
        
        
    }
}
