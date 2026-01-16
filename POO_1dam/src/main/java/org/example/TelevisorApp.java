package org.example;

public class TelevisorApp {
    public static void main(String[] args) {

        Televisor lg = new Televisor(5,50);

        lg.subirCanal();
        lg.subirCanal();
        lg.subirCanal();
        lg.bajarVolumen();
        lg.bajarVolumen();
        lg.bajarCanal();
        lg.subirVolumen();

        System.out.println(lg.getCanal() + " " + lg.getVolumen());

        Televisor samsung = new Televisor();
        System.out.println(samsung.getCanal() + " " + samsung.getVolumen());


    }
}
