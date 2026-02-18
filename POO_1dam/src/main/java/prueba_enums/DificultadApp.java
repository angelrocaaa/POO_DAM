package prueba_enums;

import java.util.Random;
import java.util.Scanner;

public class DificultadApp {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int puntuacion = aleatorio.nextInt(10000);

        System.out.println("Introduce la dificultad [FACIL, MEDIO, DIFICIL, EXPERTO]: ");
        Dificultad dificultad = Dificultad.valueOf(teclado.next());

        int resultado = puntuacion * dificultad.getMultiplicador();

        System.out.println("Puntuación obtenida = " + puntuacion);
        System.out.println("Puntuación final = " + resultado);

    }
}
