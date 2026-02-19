package Cajero;

import java.util.Scanner;

public class CuentaBancaria {

    static Scanner teclado = new Scanner(System.in);

    private double saldo;

    public CuentaBancaria() {
        setSaldo(500);
    }

    public void ingresarDinero (double dinero) {
        if (dinero>0) {
            saldo = saldo + dinero;
            System.out.println("Dinero ingresado con éxito. Saldo actual: " + saldo + "€");
        } else {
            System.out.println("El importe a ingresar debe ser mayor que 0.");
        }

    }

    public void retirarDinero(double dinero) {
        if (dinero>0) {
            saldo = saldo - dinero;
            System.out.println("Dinero retirado con éxito. Saldo actual: " + saldo + "€");
        }else {
            System.out.println("El importe a retirar debe ser mayor que 0");
        }

    }

    public void consultarSaldo() {
        System.out.println("Saldo disponible: " + saldo + " €");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                '}';
    }

}
