package com.mycompany.tiralabra_maven;

import java.util.Random;
import java.util.Scanner;

public class App {

    private static int voitot;
    private static int haviot;
    private static int tasapelit;

    /**
     * Main jossa itse ohjelma pyörii, ja joka näin alkuvaiheessa hoitaa käyttöliittymän.
     */
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        voitot = 0;
        haviot = 0;
        tasapelit = 0;
        alkuhopinat();

        while (true) {
            System.out.print("\nValitse: ");
            String pelattu = lukija.nextLine();

            if (pelattu.equals("lopeta")) {
                break;
            }

            int tekoaly = arpoja();

            if (tekoaly == 0) {
                System.out.println("Tekoäly valitsi kiven.");
            } else if (tekoaly == 1) {
                System.out.println("Tekoäly valitsi paperin.");
            } else {
                System.out.println("Tekoäly valitsi sakset.");
            }

            int voittaja = 9;

            if (pelattu.equals("kivi") || pelattu.equals("paperi") || pelattu.equals("sakset")) {
                voittaja = kumpiVoitti(pelattu, tekoaly);
            } else {
                System.out.println("Virheellinen valinta");
            }

            if (voittaja != 9) {
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

    }

    /**
     * Ohjelman alussa tulostettava esittely ohjelmasta ja mitä syötteitä käyttäjä voi syöttää.
     */
    public static void alkuhopinat() {
        System.out.println("Tervetuloa testaamaan kivi-paperi-sakset tekoälyä!");
        System.out.println("Vaihtoehtosi ovat kivi, paperi ja sakset. \nVoit myös kirjoittaa \"lopeta\" jos haluat lopettaa pelaamisen.");
    }

    /**
     * Arvotaan tekoälyn valinta arpomalla luku väliltä 0-2, jossa 0 on kivi, 1 on paperi ja 2 on sakset.
     */
    public static int arpoja() {
        Random random = new Random();

        int palautus = random.nextInt(3);

        return palautus;
    }
    
    /**
     * Metodi, jossa verrataan pelaajan ja tekoälyn valintoja, ja palautetaan kumpi voitti.
     */
    public static int kumpiVoitti(String pelattu, int tekoaly) {
        // 0 = kivi, 1 = paperi, 2 = sakset

        int pelaaja = 0;
        if (pelattu.equals("kivi")) {
            pelaaja = 0;
        } else if (pelattu.equals("paperi")) {
            pelaaja = 1;
        } else {
            pelaaja = 2;
        }

        //palautuksessa 0 = tasapeli, 1 = pelaaja voitti, 2 = tekoäly voitti
        int voittaja = 9;

        if (pelaaja == tekoaly) {
            return voittaja = 0;
        } else if (pelaaja == 0 && tekoaly == 2) {
            return voittaja = 1;
        } else if (pelaaja == 1 && tekoaly == 0) {
            return voittaja = 1;
        } else if (pelaaja == 2 && tekoaly == 1) {
            return voittaja = 1;
        } else {
            return voittaja = 2;
        }
    }

//    public static void tekoalyVoittaa() {
//        Scanner lukija = new Scanner(System.in);
//        alkuhopinat();
//        while (true) {
//            System.out.print("\nValitse: ");
//            String pelattu = lukija.nextLine();
//            String tekoaly = "";
//            if (pelattu.equals("lopeta")) {
//                break;
//            } else if (pelattu.equals("kivi")) {
//                tekoaly = "paperin";
//            } else if (pelattu.equals("paperi")) {
//                tekoaly = "sakset";
//            } else if (pelattu.equals("sakset")) {
//                tekoaly = "kiven";
//            } else {
//                System.out.println("virheellinen syöttö");
//            }
//            System.out.println("Tekoäly valitsi " + tekoaly + ".");
//            System.out.println("Hävisit tämän kierroksen, yritä uudestaan.");
//        }
//    }
}
