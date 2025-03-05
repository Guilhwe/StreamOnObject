package es.com.Alura.PelisOn.Calculos;


import es.com.Alura.PelisOn.modelos.Produccion;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void añadirProduccion(Produccion produccion) {
        
        tiempoTotal += produccion.getDuracionEnMinutos();
    }

}
