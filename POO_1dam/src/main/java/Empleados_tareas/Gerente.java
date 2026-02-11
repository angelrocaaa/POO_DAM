package Empleados_tareas;

public class Gerente extends Empleados{

    @Override
    public void realizarTarea() {
        System.out.println("Supervisando el proyecto y organizando requisitos");
    }
}
