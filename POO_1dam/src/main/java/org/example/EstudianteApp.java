package org.example;

public class EstudianteApp {

    public static void main(String[] args) {

        Estudiante angel = new Estudiante("angel","1DAM","angel@iesmutxamel.com");

        System.out.println(angel.getNIA());
        System.out.println(angel);

        Estudiante denis = new Estudiante("denis");

        System.out.println(denis.getNIA());
        System.out.println(denis);
    }
}
