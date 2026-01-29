package Immobilaria;

public class InmoApp {

    public static void main(String[] args) {
        Casa pisito = new Casa("Calle Falsa 123");

        System.out.println(pisito.getPropietario());

        pisito.crearHabitacion("cocina",40);
        pisito.crearHabitacion("baño",20);
        pisito.crearHabitacion("dormitorio",80);
        pisito.crearHabitacion("dormitorio",90);
        pisito.crearHabitacion("salon",120);


        pisito.mostrarHabitacion();
        System.out.println("La habitación más grande es " + pisito.getHabitacionMasGrande().getNombre());

        pisito.eliminarHabitaciones("baño");
        pisito.mostrarHabitacion();
        pisito.eliminarHabitaciones("baño");

        pisito.getListaHabitaciones().get(0).agregarElectrodomestico("microondas",70);
        pisito.getListaHabitaciones().get(0).mostrarElectrodomestico();

    }
}
