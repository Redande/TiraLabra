package com.mycompany.tiralabra_maven;

import Logiikka.Peli;
import java.util.Scanner;

public class App {

    /**
     * Main, jossa käynnistetään peli.
     */
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Peli peli = new Peli(lukija);
        peli.kaynnista();
    }
}
