package mx.fca.calculadora.modulo.calculadora.implementation;

import mx.fca.calculadora.modulo.calculadora.enums.Operacion;
import mx.fca.calculadora.modulo.calculadora.interfaces.IControl;
import mx.fca.calculadora.modulo.calculadora.modelo.ControlOperacion;

public class Control implements IControl {
    Operacion operacionTemporal;
    String valorX = "";
    String valorY = "";

    @Override
    public void introduceValorX(int x) {
        valorX += String.valueOf(x);
    }

    @Override
    public void introduceValorY(int y) {
        valorY += String.valueOf(y);
    }

    @Override
    public void introduceOperacion(Operacion op) {
        operacionTemporal = op;
    }

    private void flush() {
        operacionTemporal = null;
        valorX = "";
        valorY = "";
    }

    @Override
    public ControlOperacion igual() {
        double x = Double.parseDouble(valorX);
        double y = Double.parseDouble(valorY);
        Operacion op = operacionTemporal;
        ControlOperacion controlOperacion = new ControlOperacion(x, y, op);
        flush();
        return controlOperacion;
    }
}
