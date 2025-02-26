public class App {
    public static void main(String[] args) throws Exception {
        Peli pelicula1 = new Peli();
        pelicula1.nombre = "Un monstruo viene a verme";
        pelicula1.añoDeEstreno = 2016;
        pelicula1.incluido = true;
        pelicula1.duracionEnMinutos = 108;

        pelicula1.puntuar(8.5);
        pelicula1.puntuar(9.0);
        pelicula1.puntuar(7.5);
        pelicula1.info();
    }
}
