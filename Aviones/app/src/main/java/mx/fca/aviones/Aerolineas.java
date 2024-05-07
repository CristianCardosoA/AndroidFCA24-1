package mx.fca.aviones;

public class Aerolineas {

    public static Avion[] AEROMEXICO = {
            new Avion(Direccion.EAST, 0, 0),
            new Avion(Direccion.WEST, 2, 0),
            new Avion(Direccion.WEST, 5, 2),
            new Avion(Direccion.WEST, 15, 2),
            new Avion(Direccion.WEST, 1, 20)
    };

    public static Avion[] VIVAEROBUS = {
            new Avion(Direccion.EAST, 0, 0),
            new Avion(Direccion.WEST, 2, 0),
    };
}
