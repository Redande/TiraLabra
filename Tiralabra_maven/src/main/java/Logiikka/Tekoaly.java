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
    public int taulukkoValinta(int edellinen) {
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
            return randomValinta();
        }
    }
    
    /**
     * Täysin satunnainen valinta
     * @return 
     */
    public int randomValinta() {
        return arpoja();
    }
    
    /**
     * Tilastollisesti ihminen yleensä valitsee ensimmäisenä kiven, joten 
     * tekoäly aloittaa paperilla saadakseen voiton.
     * @return 
     */
    public int aloitusValinta() {
        return 1;
    }
    
    /**
     * Alitajuntaisesti ihmiset eivät pelaa yli kahta kertaa putkeen samaa merkkiä.
     * Lisäksi ihmiset hävitessään alitajuntaisesti vaihtavat valintansa helpommin
     * siihen, mille valinnalle he hävisivät edellisen kierroksen.
     * Tämä metodi käyttää näitä hyväkseen, ja valitsee niiden perusteella omansa. 
     * @param edellinen
     * @param kaksiPutkeen
     * @param voittiko
     * @return 
     */
    public int alitajuntaValinta(int edellinen, boolean kaksiPutkeen, boolean voittiko) {
        if (edellinen == -1) {
            return aloitusValinta();
        }
        if (kaksiPutkeen) {
            if (edellinen == 0) {
                return 2;
            } else if (edellinen == 1) {
                return 0;
            } else {
                return 1;
            }
        } else if (voittiko == false) {
            return haviajanValinta(edellinen);
        } else {
            return taulukkoValinta(edellinen);
        }
    }
    
    /** apumetodi alitajuntaValinnalle, joka määrittelelee valinnan ihmisen häviämän perusteella.
     * Koska tilastollisesti ihmiset hävitessään mieluummin vaihtavat alitajuntaisesti siihen, mille he juuri
     * hävisivät, käytämme tätä hyväksi.
     * Siis jos ihminen esim. hävisi kivelle, hän luultavammin vaihtaa kiveen jos hän aikoo vaihtaa.
     * 
     * @param edellinen
     * @return 
     */
    public int haviajanValinta(int edellinen) {
        if (edellinen == 0) {
            return 2;
        } else if (edellinen == 1) {
            return 0;
        } else {
            return 1;
        }
    }
    
    /**
     * Metodi, jota käytetään jos ihminen toistaa samaa valintaa yli kaksi kertaa.
     * @param edellinen
     * @return 
     */
    public int toistaaSamaa(int edellinen) {
        if (edellinen == 0) {
            return 1;
        } else if (edellinen == 1) {
            return 2;
        } else {
            return 0;
        }
    }
}
