package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ListaCompra {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        ArrayList<String> listaProductos = new ArrayList<>();

        System.out.println("Lista vacia?: " + listaProductos.isEmpty());

        listaProductos.add("Platanos");

        System.out.println("Lista vacia?: " + listaProductos.isEmpty());

        listaProductos.addAll(Arrays.asList("Pollo","Pepino","San jacobos","Nuggets de pollo","Lomo adobado"));

        System.out.println(listaProductos);

        System.out.println(listaProductos.get(2));

        listaProductos.set(1,"Queso");

        System.out.println(listaProductos);

        System.out.println("Contiene Pollo la lista: " + listaProductos.contains("Pollo"));

        System.out.println("Dime el producto que quieres añadir:");
        String producto = teclado.next();

        if (listaProductos.contains(producto)) {
            System.out.println("Este producto ya existe en la lista");
            System.out.println(listaProductos);
        } else {
            listaProductos.add(producto);
            System.out.println(producto + " ha sido añadido a la lista");
        }

        System.out.println("Dime el producto que quieres modificar:");
        String producto2 = teclado.next();

        System.out.println("Dime la posición en la lista:");
        int posicion = teclado.nextInt();

        if (listaProductos.contains(producto2)) {
            System.out.println("Este producto ya existe en la lista");
        } else {
            listaProductos.set(posicion,producto2);
            System.out.println(producto2 + " ha sido añadido a la lista");
        }

        System.out.println("Elementos en la lista de la compra: " + listaProductos.size());

        ArrayList<String> lista_clonada = new ArrayList<>(listaProductos);

        lista_clonada.clear();

        System.out.println("Está la lista vacia? " + lista_clonada.isEmpty());

        boolean sonIguales = listaProductos.equals(lista_clonada);

        lista_clonada.addAll(Arrays.asList("Pollo","Nuggets de pollo"));

        System.out.println(listaProductos);

        ArrayList<String> faltantes = new ArrayList<>(listaProductos);

        System.out.println(faltantes.removeAll(lista_clonada));

        System.out.println(faltantes);

        ArrayList<Integer> precios = new ArrayList<>();

        for (int i = 0; i < listaProductos.size(); i++) {
            precios.add(aleatorio.nextInt(11));
        }

        System.out.println(precios);
    }
}
