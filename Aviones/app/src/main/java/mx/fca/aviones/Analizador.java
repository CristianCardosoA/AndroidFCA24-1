package mx.fca.aviones;

import java.util.ArrayList;
import java.util.HashMap;

public class Analizador {

    static HashMap<Integer, Plano> memoria = new HashMap<>();

    public static Plano next(int noPaso, Plano plano){
        // Implementa usted
        if (memoria.containsKey(noPaso)){
            return memoria.get(noPaso);
        } else {
            Plano planoNuevo;
            ArrayList<Avion> nuevosAviones = new ArrayList<>();
            for (Avion avion: plano.aviones) {
                switch (avion.direccion){
                    case NORTH:
                        avion.y = avion.y - 1;
                    case SOUTH:
                        avion.y = avion.y + 1;
                    case EAST:
                        avion.x = avion.x + 1;
                    case WEST:
                        avion.x = avion.x - 1;
                        break;
                }
                nuevosAviones.add(avion);
            }
            planoNuevo = new Plano(noPaso, nuevosAviones);
            memoria.put(noPaso, planoNuevo);
        }
        return null;
    }

    public static Plano prev(int noPaso) {
        return memoria.get(noPaso);
    }
}
