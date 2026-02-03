package tenis;

import java.util.ArrayList;

public class Partido {
    private Jugador jugador1;
    private Jugador jugador2;
    private ArrayList<Set> listaSets;

    public Partido (Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        listaSets = new ArrayList<>();
        jugador1.getRival(jugador2);
        jugador2.getRival(jugador1);
    }

    public void insertarSET(int puntosJ1, int puntosJ2) {


    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public ArrayList<Set> getListaSets() {
        return listaSets;
    }

    public void setListaSets(ArrayList<Set> listaSets) {
        this.listaSets = listaSets;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "jugador1=" + jugador1 +
                ", jugador2=" + jugador2 +
                ", listaSets=" + listaSets +
                '}';
    }

}
