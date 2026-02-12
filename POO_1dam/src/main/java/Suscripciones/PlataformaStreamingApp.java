package Suscripciones;

import java.util.ArrayList;

public class PlataformaStreamingApp {

    public static void main(String[] args) {

        ArrayList<Suscripcion> listaSuscripciones = new ArrayList<>();

        Suscripcion gratis = new PlanGratis("Gratis",0.0);

        Suscripcion basico = new PlanBasico("Básico",9.99);

        Suscripcion premium = new PlanPremium("Premium",14.99);

        Suscripcion familiar = new PlanFamiliar("Familiar",19.99);

        listaSuscripciones.add(gratis);
        listaSuscripciones.add(basico);
        listaSuscripciones.add(premium);
        listaSuscripciones.add(familiar);

        for (Suscripcion suscripcion : listaSuscripciones) {
            suscripcion.mostrarInfo();
            suscripcion.obternerBeneficios();
            suscripcion.obtenerPeriodoPrueba();
        }
    }
}
