package Copa_del_rey;

public class Entrenador extends MutxamelFC implements AccionesDeportivas {

    private static final String FORMATO_FORMACION = "[1-9]-[1-9]-[1-9]";

    private String formacionPreferida;
    private Equipos equipo;

    public Entrenador(String nombre, int edad, String formacionPreferida, Equipos equipo) {
        super(nombre, edad);
        this.formacionPreferida = formacionPreferida;
        this.equipo = equipo;
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + getNombre() + " esta concentrado en la ciudad donde juegan.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador " + getNombre() + " ha viajado a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El entrenador " + getNombre() + " esta celebrando el tremendo golazo de su equipo");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador " + getNombre() + " manda a entrenar a su equipo" + getEquipo());
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El " + getEquipo() + " del entrenador " + getNombre() + " jugará el partido contra el " + rival);
    }

    public boolean validarFormacion() {
        if (formacionPreferida.matches(FORMATO_FORMACION)) {
            System.out.println("La formación para jugar el partido es correcta.");
            return true;
        } else {
            System.out.println("La formación para jugar el partido no es correcta");
            return false;
        }
    }

    public void planificarEntrenamiento() {
        System.out.println("El entrenador " + getNombre() + " planifica el entrenamiento para que su equipo " + getEquipo() + " este en una buena forma física.");
    }

    public void hacerCambios () {
        System.out.println("El entrenador " + getNombre() + " decide hacer un cambio para seguir con el partido en sus manos.");
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }
}
