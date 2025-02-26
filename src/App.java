public class App {
    public static void main(String[] args) throws Exception {
        Peli pelicula1 = new Peli();
        pelicula1.nombre = "Un monstruo viene a verme";
        pelicula1.añoDeEstreno = 2016;
        pelicula1.incluido = true;
        pelicula1.nota = 9.5;
        pelicula1.totalEvaluaciones = 1000;
        pelicula1.duracionEnMinutos = 108;

        pelicula1.info();
    }
}
