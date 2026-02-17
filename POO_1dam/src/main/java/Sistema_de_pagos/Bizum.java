package Sistema_de_pagos;

import java.util.Random;
import java.util.Scanner;

/**
 * @author dam1
 * @version 1.0
 */

public class Bizum extends MetodoPago {

    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();

    private static final int LONGITUD_PIN = 6;
    private static final String FORMATO_NUMERO = "[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
    private final int TAMANYO_TELEFONO = 9;

    private String telefono;
    private int pin;

    public Bizum (String telefono) {
        this.telefono = telefono;
        pin = setPin();
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

    /**
     * @author dam1
     * @version 1.0
     * Este metodo lo que hace es generar un pin de manera aleatorio con numeros del 0 al 9 con una longitud de 6 caracteres.
     * @return un int que antes era un String pero con el parseInt lo pasamos a int
     */

    public int setPin() {

        String generarPin = "";
        for (int i = 0; i < LONGITUD_PIN; i++) {
            generarPin += aleatorio.nextInt(0,10);
        }

        System.out.println(generarPin);
        return Integer.parseInt(generarPin);
    }

    /**
     * @author dam1
     * @version 1.0
     * Este metodo lo que hace es que valida una operación de Bizum comprobando que el teléfono tenga la longitud correcta y que el PIN introducido coincida con el que ya tenemos.
     * @return boolean true si todas las validaciones son correctas false si algo no se cumple
     */

    public boolean validarBizum(){
        System.out.println("Escribe el pin de Bizum");
        int pin = teclado.nextInt();
        teclado.nextLine();

        if (telefono.length() == TAMANYO_TELEFONO && pin == this.pin){
            System.out.println("Bizum válido");
            return true;
        } else if (telefono.length() != TAMANYO_TELEFONO) {
            System.out.println("La cantidad de números debería de ser " + TAMANYO_TELEFONO);
            return false;
        }else {
            System.out.println("Pin incorrecto");
            return false;
        }
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
