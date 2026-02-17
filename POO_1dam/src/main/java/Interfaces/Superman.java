package Interfaces;

public class Superman extends Superheroe implements Volador, Ataques{

    @Override
    public void volar() {
        System.out.println("Sobrevolando la ciudad vigilando a los malos...");
    }

    @Override
    public void rayoLaser() {
        System.out.println("Disparando láser con los ojos...");
    }

    @Override
    public void alientoHielo() {
        System.out.println("Escupiendo hielo...");
    }
}
