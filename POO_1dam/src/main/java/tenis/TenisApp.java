package tenis;

public class TenisApp {

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Alcaraz",1);
        Jugador jugador2 = new Jugador("Sinner",2);

        Partido partido = new Partido(jugador1,jugador2);
    }
}
