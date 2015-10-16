package Logiikka;

import java.util.Scanner;

/**
 * Luokka, jossa hoidetaan pelin pyörittäminen
 * @author Redande
 */
public class Peli {

    Tekoaly tekoaly;
    Pelimekaniikat mekaniikat;
    int voitot;
    int haviot;
    int tasapelit;
    int edellinen;
    boolean kaksiPutkeen;
    Scanner lukija;
    boolean pelaajaVoitti;

    public Peli(Scanner lukija) {
        this.tekoaly = new Tekoaly();
        this.mekaniikat = new Pelimekaniikat();

        this.lukija = lukija;

        voitot = 0;
        haviot = 0;
        tasapelit = 0;
        edellinen = -1;
        kaksiPutkeen = false;
        pelaajaVoitti = false;
    }

    /**
     * Päämetodi, jossa ohjelma pyörii
     */
    public void kaynnista() {
        alkuhopinat();

        while (true) {
            System.out.print("\nValitse: ");
            String syote = lukija.nextLine();

            if (syote.equals("lopeta")) {
                break;
            }

            int pelaajanValinta = mekaniikat.muunnaLuvuksi(syote);

            int tekoalynValinta = tekoaly.viisasValinta(edellinen);

            //Tarkistetaan, että syöte on kelvollinen.
            if (!syotteenTarkistus(syote)) {
                System.out.println("Virheellinen valinta");
                continue;
            }

            //Määritellään voittaja
            int voittaja = mekaniikat.kumpiVoitti(pelaajanValinta, tekoalynValinta);

            //Tulostetaan tekoälyn valinta
            kerroTekoalynValinta(tekoalynValinta);

            //Lisätään tekoälyn tilastoihin edellisen jälkeinen valinta
            if (edellinen != -1) {
                tekoaly.lisaaPelattu(edellinen, pelaajanValinta);
//                if (edellinen == pelaajanValinta) {
//                    if (kaksiPutkeen) {
//                        kaksiPutkeen = false;
//                    }
//                    kaksiPutkeen = true;
//                } else {
//                    kaksiPutkeen = false;
//                }
            }

            edellinen = pelaajanValinta;

            kerroVoittaja(voittaja);
            
            if (voittaja == 1) {
                pelaajaVoitti = true;
            } else {
                pelaajaVoitti = false;
            }
        }
    }

    /**
     * Tarkistetaan, että käyttäjän syöte on oikein
     * @param syote
     * @return 
     */
    public boolean syotteenTarkistus(String syote) {
        return syote.equals("kivi") || syote.equals("paperi") || syote.equals("sakset");
    }

    /**
     * Ohjelman alussa tulostettava esittely ohjelmasta ja mitä syötteitä
     * käyttäjä voi syöttää.
     */
    public void alkuhopinat() {
        System.out.println("Tervetuloa testaamaan kivi-paperi-sakset tekoälyä!");
        System.out.println("Vaihtoehtosi ovat kivi, paperi ja sakset. \nVoit myös kirjoittaa \"lopeta\" jos haluat lopettaa pelaamisen.");
    }

    /**
     * Metodi, jossa kerrotaan minkä tekoäly valitsi
     * @param valinta 
     */
    public void kerroTekoalynValinta(int valinta) {
        if (valinta == 0) {
            System.out.println("Tekoäly valitsi kiven.");
        } else if (valinta == 1) {
            System.out.println("Tekoäly valitsi paperin.");
        } else {
            System.out.println("Tekoäly valitsi sakset.");
        }
    }

    /**
     * Metodi, jossa kerrotaan kumpi voitti
     * @param voittaja 
     */
    public void kerroVoittaja(int voittaja) {
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
