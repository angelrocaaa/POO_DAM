package Dispositivos_Inteligente;

public class ParlanteInteligente extends Dispositivo {

    public ParlanteInteligente(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void encender() {
        if (super.estado == false) {
            setEstado(true);
            System.out.println("Activando parlante con comando de voz...");
        } else {
            System.out.println("El parlante ya está encendido");
        }
    }
}
