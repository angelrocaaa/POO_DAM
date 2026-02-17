package Interfaces;

import java.util.ArrayList;

public class VoladoresApp {

    public static void main(String[] args) {

        Superman clark_kent = new Superman();
        Pajaro piolin = new Pajaro();

        clark_kent.volar();
        piolin.volar();

        Spiderman peter_parker = new Spiderman();

        ArrayList<Superheroe> listaSuperheroes = new ArrayList<>();
        listaSuperheroes.add(clark_kent);
        listaSuperheroes.add(peter_parker);

        for (Superheroe superheroe : listaSuperheroes) {
            if (superheroe instanceof Superman) {
                ((Superman) superheroe).alientoHielo();
                ((Superman) superheroe).rayoLaser();
            }
        }
    }
}
