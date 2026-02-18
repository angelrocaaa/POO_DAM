package prueba_enums;

public class SemaforoApp {

    public static void main(String[] args) {

        Semaforo semaforo = Semaforo.ROJO;

        for (int i = 0; i < 10; i++) {
            System.out.println(semaforo);
            semaforo = semaforo.siguiente();
        }

    }
}
