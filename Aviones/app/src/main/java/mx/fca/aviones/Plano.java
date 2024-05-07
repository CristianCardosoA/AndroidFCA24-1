package mx.fca.aviones;

public class Plano {

    public Avion[] aviones;

    public int col;

    public int row;

    public int noPaso;

    Plano(int noPaso, Avion[] aviones ) {

        this.noPaso = noPaso;
        this.aviones = aviones;

        int tmpX = 0;
        int tmpY = 0;
        for (Avion avion: aviones) {
            if (avion.x > tmpX) {
                tmpX = avion.x;
            }
            if (avion.y > tmpX) {
                tmpY = avion.y;
            }
        }
        col = tmpX;
        row = tmpY;
    }

    public Plano next() {
        // Tus vas a implementar
        return null;
    }

    public Plano prev() {
        // Tu vas a implementar

        return null;
    }
}
