package Sistema_de_pagos;

public class AppEcommerce {
    public static void main(String[] args) {

        TarjetaCredito t1 = new TarjetaCredito("1234567891234567","VISA");

        System.out.println(t1.validarTarjeta());
    }
}
