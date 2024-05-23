package mx.fca.calculadora.modulo.calculadora.modelo;

import mx.fca.calculadora.modulo.calculadora.enums.Operacion;

public class ControlOperacion {
    double x;
    double y;
    Operacion op;

    public ControlOperacion(double x, double y, Operacion op) {
        this.x = x;
        this.y = y;
        this.op = op;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Operacion getOp() {
        return op;
    }

    public void setOp(Operacion op) {
        this.op = op;
    }
}
