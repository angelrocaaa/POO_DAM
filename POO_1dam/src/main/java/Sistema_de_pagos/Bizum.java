package Sistema_de_pagos;

import java.util.Random;

public class Bizum extends MetodoPago {

    static Random aleatorio = new Random();
    private static final int LONGITUD_PIN = 6;
    private static final String FORMATO_NUMERO = "[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
    private String generarPin = " ";

    private String telefono;
    private int pin;

    public Bizum (String telefono) {
        this.telefono = telefono;
        setPin();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setPin() {
        for (int i = 0; i < LONGITUD_PIN; i++) {
            generarPin += aleatorio.nextInt(0,10);
        }
        pin = Integer.parseInt(generarPin);
        System.out.println(pin);
    }

    public void validarBizum() {

    }

    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " €" + " con Bizum");
    }
}
