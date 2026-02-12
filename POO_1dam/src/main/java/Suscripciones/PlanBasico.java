package Suscripciones;

public class PlanBasico extends Suscripcion{

    public PlanBasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obternerBeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estándar sin anuncios");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: 30 días de prueba");
    }
}
