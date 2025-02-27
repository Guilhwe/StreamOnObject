import es.com.Alura.PelisOn.modelos.Peli;

public class App {
    public static void main(String[] args) throws Exception {
        Peli pelicula1 = new Peli();
        pelicula1.setNombre("Un monstruo viene a verme");
        pelicula1.setAñoDeEstreno(2016);
        pelicula1.getIncluido();
        pelicula1.setDuracionEnMinutos(108);

        pelicula1.puntuar(8.5);
        pelicula1.puntuar(9.0);
        pelicula1.puntuar(7.5);
        pelicula1.puntuar(8.0);
        System.out.println(pelicula1.getTotalEvaluaciones());
        
    }
}
