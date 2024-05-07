package mx.fca.aviones;

import java.util.HashMap;

public class Analizador {

    private HashMap<Integer, Plano> memoria = new HashMap<>();

    public Analizador(){

    }

    public Plano next(int noPaso, Plano plano){
        // Implementa usted
        if (memoria.containsKey(noPaso)){
            return memoria.get(noPaso);
        } else {
            Plano planoNuevo = null;
            // Calcula el sig paso
            // ...
            memoria.put(noPaso, planoNuevo);
        }
        return null;
    }

    public Plano prev(int noPaso) {
        return memoria.get(noPaso);
    }
}
