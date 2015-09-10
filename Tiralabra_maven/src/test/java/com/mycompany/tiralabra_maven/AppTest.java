/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiralabra_maven;

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
public class AppTest {
    
    public AppTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Testataan, että arpoja-metodi arpoo oikein tekoälyn valinnan.
     */
    @Test
    public void testArpoja() {
        int expResult1 = 0;
        int expResult2 = 1;
        int expResult3 = 2;
        int result = App.arpoja();
        if (result != expResult1 && result != expResult2 && result != expResult3) {
            fail("Arpoja ei arponut oikein tekoälyn valintaa");
        }
    }

    /**
     * Testataan, että kumpiVoitti-metodi osaa valita voittajan oikein annetuilla valinnoilla.
     */
    @Test
    public void testKumpiVoitti() {
        String pelattu1 = "kivi";
        String pelattu2 = "paperi";
        String pelattu3 = "sakset";
        
        int tekoaly1 = 0;
        int tekoaly2 = 1;
        int tekoaly3 = 2;
        
        int voittaja1 = App.kumpiVoitti(pelattu1, tekoaly1);
        if (voittaja1 != 0) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja2 = App.kumpiVoitti(pelattu1, tekoaly2);
        if (voittaja2 != 2) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja3 = App.kumpiVoitti(pelattu1, tekoaly3);
        if (voittaja3 != 1) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja4 = App.kumpiVoitti(pelattu2, tekoaly1);
        if (voittaja4 != 1) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja5 = App.kumpiVoitti(pelattu2, tekoaly2);
        if (voittaja5 != 0) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja6 = App.kumpiVoitti(pelattu2, tekoaly3);
        if (voittaja6 != 2) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja7 = App.kumpiVoitti(pelattu3, tekoaly1);
        if (voittaja7 != 2) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja8 = App.kumpiVoitti(pelattu3, tekoaly2);
        if (voittaja8 != 1) {
            fail("Voittajan valinta ei toimi");
        }
        
        int voittaja9 = App.kumpiVoitti(pelattu3, tekoaly3);
        if (voittaja9 != 0) {
            fail("Voittajan valinta ei toimi");
        }
    }
}
