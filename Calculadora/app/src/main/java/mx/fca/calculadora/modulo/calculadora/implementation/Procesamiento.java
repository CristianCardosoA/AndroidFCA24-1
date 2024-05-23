package mx.fca.calculadora.modulo.calculadora.implementation;

import mx.fca.calculadora.modulo.calculadora.interfaces.IProcesamiento;
import mx.fca.calculadora.modulo.calculadora.modelo.ControlOperacion;

public class Procesamiento implements IProcesamiento  {
    @Override
    public double procesa(ControlOperacion controlOperacion) {
        double valor = 0.0;
        switch (controlOperacion.getOp()) {
            case SUM:
                valor = controlOperacion.getX() + controlOperacion.getY();
                break;
            case RES:
                valor = controlOperacion.getX() - controlOperacion.getY();
                break;
            case DIV:
                valor = controlOperacion.getX() / controlOperacion.getY();
                break;
            case MUL:
                valor = controlOperacion.getX() * controlOperacion.getY();
                break;
        }
        return valor;
    }
}
