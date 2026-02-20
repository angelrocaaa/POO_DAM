package Copa_del_rey;

public class Jugador extends MutxamelFC{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posiciones;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posiciones) {
        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posiciones = posiciones;
    }

    public void calentar() {
        System.out.println("El jugador " + getNombre() + " con dorsal " + dorsal + " salta al campo a calentar.");
    }

    public void descansar() {
        System.out.println("El jugador " + getNombre() + " con dorsal " + dorsal + " está descansando...");
    }

    public void marcarGol() {
        System.out.println("El jugador " + getNombre() + " con dorsal " + dorsal + " ha metido un autentico golazooo.");
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " con dorsal " + dorsal + " ha acudido a la concentración.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("EL jugador " + getNombre() + " con dorsal " + dorsal + " ha viajado a la ciudad de " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El jugador " + getNombre() + " con dorsal " + dorsal + " está celebrando el gol de su compañero.");
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public Posiciones getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(Posiciones posiciones) {
        this.posiciones = posiciones;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", posiciones=" + posiciones +
                '}';
    }

}
