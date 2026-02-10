package Carrefour;

public class EmpleadosApp {

    public static void main(String[] args) {

        Cajero jorge = new Cajero(147,"Jorge", 100);

        jorge.mostrarInfo();

        Reponedor denis = new Reponedor(199,"Denis",5);

        denis.mostrarInfo();

        Seguridad raul = new Seguridad(333,"Raúl",33);

        raul.agregarArmas("Táser");
        raul.agregarArmas("Porra");
        raul.mostrarInfo();
    }
}
