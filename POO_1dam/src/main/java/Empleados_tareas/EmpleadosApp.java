package Empleados_tareas;

import java.util.ArrayList;

public class EmpleadosApp {

    public static void asignarTarea(Empleados empleados) {
        System.out.println("Asignando tarea al empleado...");
    }

    public static void main(String[] args) {
        Desarollador jacobo = new Desarollador();
        Disenyador angel = new Disenyador();
        Gerente kevin = new Gerente();

        ArrayList<Empleados> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(jacobo);
        listaEmpleados.add(angel);
        listaEmpleados.add(kevin);

        for (Empleados empleados : listaEmpleados) {
            empleados.realizarTarea();
        }

        asignarTarea(jacobo);

        System.out.println("----- Agregando tareas -----");
        Empleados jorge = new Disenyador();
        Empleados raul = new Gerente();

        asignarTarea(jorge);
        asignarTarea(raul);
    }
}
