package Sistema_de_pagos;

/**
 * Clase madre abstracta que depende cada uno de sus hijos con el metodo de pago que tenga
 */

public abstract class MetodoPago {

    public abstract void procesarPago(double importe);
}
