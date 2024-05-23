package mx.fca.calculadora.modulo.calculadora.interfaces;

import mx.fca.calculadora.modulo.calculadora.enums.CalculadoraError;

public interface IDisplay {
    String muestraResultado(double res);
    String muestraError(CalculadoraError error);
}
