package mx.fca.calculadora.modulo.calculadora.implementation;

import mx.fca.calculadora.modulo.calculadora.enums.Operacion;
import mx.fca.calculadora.modulo.calculadora.interfaces.ICalculadora;
import mx.fca.calculadora.modulo.calculadora.interfaces.IControl;
import mx.fca.calculadora.modulo.calculadora.interfaces.IDisplay;
import mx.fca.calculadora.modulo.calculadora.interfaces.IProcesamiento;
import mx.fca.calculadora.modulo.calculadora.modelo.ControlOperacion;

public class Calculadora implements ICalculadora {
    IControl control;
    IProcesamiento procesamiento;
    IDisplay display;

    public Calculadora() {
        this.control = new Control();
        this.procesamiento = new Procesamiento();
        this.display = new Display();
    }

    @Override
    public void introduceX(int x) {
        control.introduceValorX(x);
    }

    @Override
    public void introduceY(int y) {
        control.introduceValorY(y);
    }

    @Override
    public void introduceOp(Operacion operacion) {
        control.introduceOperacion(operacion);
    }

    @Override
    public String igual() {
        ControlOperacion resultadoModelo = control.igual();
        double resultado = procesamiento.procesa(resultadoModelo);
        return display.muestraResultado(resultado);
    }
}
