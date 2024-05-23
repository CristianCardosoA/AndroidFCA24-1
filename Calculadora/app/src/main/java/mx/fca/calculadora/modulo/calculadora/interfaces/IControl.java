package mx.fca.calculadora.modulo.calculadora.interfaces;

import mx.fca.calculadora.modulo.calculadora.enums.Operacion;
import mx.fca.calculadora.modulo.calculadora.modelo.ControlOperacion;

public interface IControl {
    void introduceValorX(int x);
    void introduceValorY(int y);
    void introduceOperacion(Operacion op);
    ControlOperacion igual();
}