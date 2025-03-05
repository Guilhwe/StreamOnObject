package es.com.Alura.PelisOn.modelos;

public class Serie extends Produccion {
    private int temporadas;
    private int capitulos;
    private boolean activa;
    private int minutosPorCapitulo;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public boolean getActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getMinutosPorCapitulo() {
        return minutosPorCapitulo;
    }

    public void setMinutosPorCapitulo(int minutosPorCapitulo) {
        this.minutosPorCapitulo = minutosPorCapitulo;
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * capitulos * minutosPorCapitulo;
    }
}
