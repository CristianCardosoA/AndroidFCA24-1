package mx.fca.calculadora.modulo.calculadora.implementation;

import mx.fca.calculadora.modulo.calculadora.enums.CalculadoraError;
import mx.fca.calculadora.modulo.calculadora.interfaces.IDisplay;

public class Display implements IDisplay {
    @Override
    public String muestraResultado(double res) {
        return "ESTOY FELIZ:" + res;
    }

    @Override
    public String muestraError(CalculadoraError error) {
        return "POR IMPLEMENTAR ERROR";
    }
}
