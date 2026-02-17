package Sistema_de_pagos;

public class Paypal extends MetodoPago {

    private static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.com$";


    private String cuenta;
    private double saldo;

    public Paypal(String cuenta) {
        this.cuenta = cuenta;
        saldo = 23;
    }

    /**
     * @author dam1
     * @version 1.0
     * Este método comprueba el formato del correo de la cuenta de paypal con la constante del CORREO_FORMAT
     * @return true si el formato del correo es correcto false si no lo es.
     */
    public boolean validarPaypal() {
        if (cuenta.matches(CORREO_FORMAT)) {
            System.out.println("La cuenta de paypal es correcta");
            return true;
        } else {
            System.out.println("ERROR. El formato no es correcto");
            return false;
        }
    }

    /**
     * @author dam1
     * @version 1.0
     * @param importe es la cantidad para ver si el saldo es suficiente para pagar
     * @return true si el importe es menor o igual al saldo y false si el importe es mayor que el saldo.
     */
    public boolean validarSaldo(double importe){
        if (importe>saldo){
            System.out.println("No tienes suficiente saldo para pagar.");
            return false;
        }else {
            System.out.println("Saldo suficiente para pagar");
            return true;
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
