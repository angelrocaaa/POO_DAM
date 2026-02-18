package prueba_enums;

public enum Semaforo {
    ROJO,VERDE,AMARILLO;

    public Semaforo siguiente() {
        switch (ordinal()) {
            case 0: return VERDE;
            case 1: return AMARILLO;
            default: return ROJO;
        }
    }

}
