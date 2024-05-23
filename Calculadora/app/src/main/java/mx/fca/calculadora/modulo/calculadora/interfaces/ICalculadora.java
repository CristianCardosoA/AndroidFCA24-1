package mx.fca.calculadora.modulo.calculadora.interfaces;

import mx.fca.calculadora.modulo.calculadora.enums.Operacion;

public interface ICalculadora {
    void introduceX(int x);
    void introduceY(int y);
    void introduceOp(Operacion operacion);
    String igual();
}
