package org.example;

import java.util.Scanner;

public class PacienteApp {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.next();

        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        System.out.println("Introduce tu genero: ");
        String genero = teclado.next();

        char genero_letra = genero.charAt(0);

        System.out.println("Introduce tu peso: ");
        int peso = teclado.nextInt();

        System.out.println("Introduce tu altura: ");
        int altura = teclado.nextInt();

        Paciente primer_objeto = new Paciente(nombre,edad,genero_letra,peso,altura);

        primer_objeto.mostrarInformacion();

        System.out.println(primer_objeto);

        System.out.println(primer_objeto.calcularIMC());
        System.out.println(primer_objeto.esMayorDeEdad());

        Paciente segundo_objeto = new Paciente(nombre,edad,genero_letra);

        segundo_objeto.mostrarInformacion();

        System.out.println(primer_objeto.esMayorDeEdad());

        Paciente tercer_objeto = new Paciente();

        tercer_objeto.mostrarInformacion();

//        Paciente angel = new Paciente();
//
//        System.out.println(angel.getDni());
//
//        Paciente jacobo = new Paciente("Jacobo",18,'H',470,180);
//
//        System.out.println(jacobo.calcularIMC());
//
//        System.out.println(jacobo.esMayorDeEdad());
//
//        if (jacobo.esMayorDeEdad()) {
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("No es mayor de edad");
//        }
//
//        Paciente paciente2 = new Paciente("angel",69,'H',60,171);
//
//        System.out.println(paciente2.getGenero());


    }

}
