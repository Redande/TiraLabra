package Logiikka;

public class Pelimekaniikat {
    
    public Pelimekaniikat() {
        
    }
    
    /**
     * Metodi, jossa verrataan pelaajan ja tekoälyn valintoja, ja 
     * palautetaan kumpi voitti.
     * @param pelaaja
     * @param tekoaly
     * @return 
     */
    public int kumpiVoitti(int pelaaja, int tekoaly) {
        //pelatuissa 0 = kivi, 1 = paperi, 2 = sakset

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
    
    /**
     * Metodissa muunnetaan pelaajan valinta Stringista Integeriksi.
     * @param pelattu
     * @return 
     */
    public int muunnaLuvuksi(String pelattu) {
        if (pelattu.equals("kivi")) {
            return 0;
        } else if (pelattu.equals("paperi")) {
            return 1;
        } else {
            return 2;
        }
    }
}
