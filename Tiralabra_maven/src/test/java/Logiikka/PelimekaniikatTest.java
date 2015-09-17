/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Redande
 */
public class PelimekaniikatTest {
    
    Pelimekaniikat pm;
    
    public PelimekaniikatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.pm = new Pelimekaniikat();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Testataan, että kumpiVoitti-metodi osaa valita voittajan oikein annetuilla valinnoilla.
     */
    @Test
    public void testKumpiVoitti() {
        int pelattu1 = 0;
        int pelattu2 = 1;
        int pelattu3 = 2;
        
        int tekoaly1 = 0;
        int tekoaly2 = 1;
        int tekoaly3 = 2;
        
        int voittaja1 = pm.kumpiVoitti(pelattu1, tekoaly1);
        if (voittaja1 != 0) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja2 = pm.kumpiVoitti(pelattu1, tekoaly2);
        if (voittaja2 != 2) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja3 = pm.kumpiVoitti(pelattu1, tekoaly3);
        if (voittaja3 != 1) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja4 = pm.kumpiVoitti(pelattu2, tekoaly1);
        if (voittaja4 != 1) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja5 = pm.kumpiVoitti(pelattu2, tekoaly2);
        if (voittaja5 != 0) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja6 = pm.kumpiVoitti(pelattu2, tekoaly3);
        if (voittaja6 != 2) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja7 = pm.kumpiVoitti(pelattu3, tekoaly1);
        if (voittaja7 != 2) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja8 = pm.kumpiVoitti(pelattu3, tekoaly2);
        if (voittaja8 != 1) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja9 = pm.kumpiVoitti(pelattu3, tekoaly3);
        if (voittaja9 != 0) {
            fail("Voittajan valinta ei toimi");
        }
    }

    /**
     * Testataan, että metodi vaihtaa valinnan oikeaksi luvuksi.
     */
    @Test
    public void testMuunnaLuvuksi() {
        String syote = "kivi";
        assertEquals(pm.muunnaLuvuksi(syote), 0);
        syote = "paperi";
        assertEquals(pm.muunnaLuvuksi(syote), 1);
        syote = "sakset";
        assertEquals(pm.muunnaLuvuksi(syote), 2);
    }
    
}
