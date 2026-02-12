package Suscripciones;

public class PlanGratis extends Suscripcion {

    public PlanGratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obternerBeneficios() {
        System.out.println("Acceso limitado con anuncios.");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: Sin periodo de prueba");
    }

}
