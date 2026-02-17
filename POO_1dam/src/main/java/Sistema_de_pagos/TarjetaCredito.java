package Sistema_de_pagos;

public class TarjetaCredito extends MetodoPago{

    private final int LONGITUD_ESPERADA = 16;

    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo.toUpperCase();
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " €" + " con tarjeta de crédito " + tipo);
    }

    /**
     * @author dam1
     * @version 1.0
     * Este método comprueba que la longitud de la tarjeta sea el que dice la constante y el tipo dela tarjeta sea igual a una de las que le pasamos.
     * @return true si la longitud y el tipo es valido y false si alguna de las dos validaciones no es valida
     */

    public boolean validarTarjeta() {
        if (nro_tarjeta.length() == LONGITUD_ESPERADA && tipo.equals("VISA") || tipo.equals("MASTERCARD") || tipo.equals("MAESTRO")) {
            System.out.println("La tarjeta de crédito es valida.");
            return true;
        } else {
            System.out.println("La tarjeta de crédito no es valida.");
            return false;
        }
    }
}
