package org.example;

public class PacienteApp {
    public static void main(String[] args) {

        Paciente angel = new Paciente();

        System.out.println(angel.getDni());

        Paciente jacobo = new Paciente("Jacobo",20,'H',450,120);

        System.out.println(jacobo.calcularIMC());


    }

}
