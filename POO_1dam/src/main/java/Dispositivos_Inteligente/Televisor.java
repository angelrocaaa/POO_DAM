package Dispositivos_Inteligente;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con el control remoto...");
    }

    @Override
    public void encender() {
        if (super.estado == false) {
            setEstado(true);
            System.out.println("Encendiendo televisor");
        } else {
            System.out.println("El televisor ya está encendido");
        }
    }

}
