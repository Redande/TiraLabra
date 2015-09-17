package com.mycompany.tiralabra_maven;

import Logiikka.Pelimekaniikat;
import Logiikka.Tekoaly;
import java.util.Scanner;

public class App {

    /**
     * Main jossa itse ohjelma pyörii, ja joka näin alkuvaiheessa hoitaa
     * käyttöliittymän.
     */
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Tekoaly tekoaly = new Tekoaly();
        Pelimekaniikat mekaniikat = new Pelimekaniikat();
        int voitot = 0;
        int haviot = 0;
        int tasapelit = 0;
        int edellinen = -1;

        alkuhopinat();

        while (true) {
            System.out.print("\nValitse: ");
            String syote = lukija.nextLine();

            if (syote.equals("lopeta")) {
                break;
            }

            int pelaajanValinta = mekaniikat.muunnaLuvuksi(syote);

            int tekoalynValinta = tekoaly.parasValinta(pelaajanValinta);

            int voittaja;

            //Tarkistetaan, että syöte on kelvollinen. Jos on, määritellään voittaja.
            if (syote.equals("kivi") || syote.equals("paperi") || syote.equals("sakset")) {
                voittaja = mekaniikat.kumpiVoitti(pelaajanValinta, tekoalynValinta);
            } else {
                System.out.println("Virheellinen valinta");
                continue;
            }

            if (tekoalynValinta == 0) {
                System.out.println("Tekoäly valitsi kiven.");
            } else if (tekoalynValinta == 1) {
                System.out.println("Tekoäly valitsi paperin.");
            } else {
                System.out.println("Tekoäly valitsi sakset.");
            }

            //Lisätään tekoälyn tilastoihin edellisen jälkeinen valinta
            if (edellinen != -1) {
                tekoaly.lisaaPelattu(edellinen, pelaajanValinta);
            }
            
            edellinen = pelaajanValinta;
            
            if (voittaja == 0) {
                System.out.println("Tasapeli.");
                tasapelit++;
            } else if (voittaja == 1) {
                System.out.println("Voitit.");
                voitot++;
            } else {
                System.out.println("Hävisit.");
                haviot++;
            }
            System.out.println("Voitot/häviöt/tasapelit: " + voitot + "/" + haviot + "/" + tasapelit);
        }

    }

    /**
     * Ohjelman alussa tulostettava esittely ohjelmasta ja mitä syötteitä
     * käyttäjä voi syöttää.
     */
    public static void alkuhopinat() {
        System.out.println("Tervetuloa testaamaan kivi-paperi-sakset tekoälyä!");
        System.out.println("Vaihtoehtosi ovat kivi, paperi ja sakset. \nVoit myös kirjoittaa \"lopeta\" jos haluat lopettaa pelaamisen.");
    }
}
