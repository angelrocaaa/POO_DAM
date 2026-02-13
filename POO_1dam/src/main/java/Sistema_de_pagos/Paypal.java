package Sistema_de_pagos;

public class Paypal extends MetodoPago {

    private static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.com$";


    private String cuenta;
    private double saldo;

    public Paypal(String cuenta) {
        this.cuenta = cuenta;
        saldo = 23;
    }

    public boolean validarPaypal() {
        if (cuenta.matches(CORREO_FORMAT)) {
            return true;
        } else {
            return false;
        }
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Paypal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " €" + " con Paypal");
    }
}
