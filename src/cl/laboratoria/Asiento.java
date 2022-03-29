package cl.laboratoria;

public class Asiento {
    private int NumAsiento;
    private int ValorAsiento;
    private boolean Reservado;

    public int getNumAsiento() {
        return NumAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        NumAsiento = numAsiento;
    }

    public int getValorAsiento() {
        return ValorAsiento;
    }

    public void setValorAsiento(int valorAsiento) {
        ValorAsiento = valorAsiento;
    }

    public boolean isReservado() {
        return Reservado;
    }

    public void setReservado(boolean reservado) {
        Reservado = reservado;
    }

    public Asiento(int numAsiento, int valorAsiento, boolean reservado) {
        NumAsiento = numAsiento;
        ValorAsiento = valorAsiento;
        Reservado = false;
    }
}
