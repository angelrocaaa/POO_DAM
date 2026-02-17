package Dispositivos_Inteligente;

import java.util.ArrayList;

public class DispositivoApp {

    public static void main(String[] args) {
        Televisor samsung = new Televisor("samsung",false);
        ParlanteInteligente lg = new ParlanteInteligente("lg",false);
        AireAcondicionado haier = new AireAcondicionado("haier",false);

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();

        listaDispositivos.add(samsung);
        listaDispositivos.add(lg);
        listaDispositivos.add(haier);

        Dispositivo microondas = new Dispositivo("Microondas Balay",false) {
            @Override
            public void encender() {
                System.out.println(nombre + " encendido una sola vez");
            }
        };

        microondas.encender();

        Dispositivo proyector = new Dispositivo("Optoma",false) {
            @Override
            public void encender() {
                if (estado) {
                    System.out.println("El proyector ya esta encendido.");
                } else {
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    estado = true;
                }
            }
        };

        proyector.encender();
        proyector.encender();

        ControlRemoto proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };

        proyector_sinc.sincronizar();

        Dispositivo horno_inteligente = new Dispositivo("Bosh",false) {
            @Override
            public void encender() {
                if (estado) {
                    System.out.println("El horno ya está encendido.");
                } else {
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    estado = true;
                }
            }
        };

        horno_inteligente.encender();
        horno_inteligente.encender();

        listaDispositivos.add(proyector);
        listaDispositivos.add(horno_inteligente);

        for (Dispositivo dispositivo : listaDispositivos) {
            dispositivo.encender();
            if (dispositivo instanceof ControlRemoto) {
                ((ControlRemoto) dispositivo).sincronizar();
            } else if (dispositivo.nombre.equals("Optoma")) {
                proyector_sinc.sincronizar();
            }
            dispositivo.mostrarEstado();
            dispositivo.apagar();
            System.out.println("--------------------");
        }
    }
}
