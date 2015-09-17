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
public class TekoalyTest {
    
    Tekoaly tko;
    
    public TekoalyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tko = new Tekoaly();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Testataan, että arpoja arpoo oikein, eli luvun pitää olla väliltä 0-2.
     */
    @Test
    public void testArpoja() {
        int testi = tko.arpoja();
        if (testi == 0 || testi == 1 || testi == 2) {
            
        } else {
            fail("ei arponut oikein");
        }
    }
    
    /**
     * Testataan, että taytaArray -metodi täyttää taulukon nollilla.
     */
    @Test
    public void testTaytaArray() {
        tko.taytaArray();
        int[][] testiarray = tko.array;
        for (int i = 0; i < testiarray.length; i++) {
            for (int j = 0; j < testiarray[i].length; j++) {
                if (testiarray[i][j] != 0) {
                    fail("ei täytetty oikein");
                }
            }
        }
    }
    /**
     * Testataan, että lisaaPelattu -metodi lisää laskuria yhdellä
     */
    @Test
    public void testLisaaPelattu() {
        tko.lisaaPelattu(0, 0);
        assertEquals(tko.array[0][0], 1);
    }
    /**
     * Testataan, että parasValinta -metodi osaa valita oikein
     */
    @Test
    public void testParasValinta() {
        tko.lisaaPelattu(0, 1);
        tko.lisaaPelattu(0, 1);
        tko.lisaaPelattu(0, 1);
        tko.lisaaPelattu(0, 1);
        tko.lisaaPelattu(0, 1);
        assertEquals(tko.parasValinta(0), 2);
    }
}
