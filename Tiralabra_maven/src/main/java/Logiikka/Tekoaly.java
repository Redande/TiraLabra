package Logiikka;

import java.util.Random;

/**
 * Tämä luokka hoitaa tekoälyyn liittyvät asiat, eli tällä hetkellä sen mitä
 * tekoäly valitsee, ja lisäksi tilastoja siitä kuinka usein pelaaja pelaa
 * minkäkin valinnan edellisen jälkeen, esim kuinka monta kertaa pelaaja on 
 * pelannut sakset kiven jälkeen.
 * @author Redande
 */
public class Tekoaly {
    /**
     * Array, johon tallennetaan montako kertaa kunkin valinnan jälkeen on 
     * pelattu kukin muu valinta, niin että 0 = kivi, 1 = paperi ja 2 = sakset.
     * (siis esim. kohdassa array[0][1] on kuinka monta kertaa kiven jälkeen
     * on pelattu sakset.
     */
    int[][] array;

    public Tekoaly() {
        array = new int[3][];
        taytaArray();
    }
    
    /**
     * Arvotaan tekoälyn valinta arpomalla luku väliltä 0-2, jossa 0 on kivi, 1 on paperi ja 2 on sakset.
     * @return 
     */
    public int arpoja() {
        Random random = new Random();

        int palautus = random.nextInt(3);

        return palautus;
    }
    
    /**
     * Täytetään array aluksi laittamalla nolla jokaiseen kohtaan.
     */
    public void taytaArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[3];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }
    }
    
    /**
     * Lisätään taulukkoon mikä pelattiin edellisen jälkeen
     * @param edellinen
     * @param nykyinen 
     */
    public void lisaaPelattu(int edellinen, int nykyinen) {
        array[edellinen][nykyinen]++;
    }
    
    /**
     * Valitaan tilastojen mukaan paras valinta, eli jos vaikka kiven jälkeen
     * on pelattu 5 kertaa sakset ja 0 kertaa muut, niin jos pelaaja pelaa 
     * kiven, ensi kerralla tekoälyn kannattaa valita kivi voittaakseen sakset.
     * @param edellinen
     * @return 
     */
    public int parasValinta(int edellinen) {
        //selvitetään mitä on pelattu eniten edellisen jälkeen
        int paras = 0;
        int parhaanIndeksi = -1;
        
        for (int i = 0; i < array[edellinen].length; i++) {
            if (array[edellinen][i] > paras) {
                paras = array[edellinen][i];
                parhaanIndeksi = i;
            }
        }
        
        //valitaan parhaan voittava valinta
        
        
        if (parhaanIndeksi != -1) {
            if (parhaanIndeksi == 0) {
                return 1;
            } else if (parhaanIndeksi == 1) {
                return 2;
            } else {
                return 0;
            }
        } else {
            return arpoja();
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
