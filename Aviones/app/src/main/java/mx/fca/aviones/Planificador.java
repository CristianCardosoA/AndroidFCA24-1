package mx.fca.aviones;

public class Planificador {

    public static Plano crearRutaInicial() {
        return new Plano(1, Aerolineas.AEROMEXICO);
    }
}
