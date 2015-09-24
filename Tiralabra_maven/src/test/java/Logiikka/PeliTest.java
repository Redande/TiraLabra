/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

import java.util.Scanner;
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
public class PeliTest {
    
    Peli peli;
    Scanner lukija;
    
    public PeliTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.lukija = new Scanner(System.in);
        this.peli = new Peli(lukija);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Testataan, että metodi palauttaa oikein true jos syöte on oikein, muuten
     * false.
     */
    @Test
    public void testSyotteenTarkistus() {
        
        String syote1 = "kivi";
        String syote2 = "paperi";
        String syote3 = "sakset";
        String syote4 = "virheellinen";
        
        boolean expResult1 = true;
        boolean expResult2 = true;
        boolean expResult3 = true;
        boolean expResult4 = false;
        
        boolean result1 = peli.syotteenTarkistus(syote1);
        boolean result2 = peli.syotteenTarkistus(syote2);
        boolean result3 = peli.syotteenTarkistus(syote3);
        boolean result4 = peli.syotteenTarkistus(syote4);
        
        if (expResult1 != result1) {
        fail("Pitäisi olla true, koska syöte oli kelvollinen");
        }
        
        if (expResult2 != result2) {
        fail("Pitäisi olla true, koska syöte oli kelvollinen");
        }
        
        if (expResult3 != result3) {
        fail("Pitäisi olla true, koska syöte oli kelvollinen");
        }
        
        if (expResult4 != result4) {
        fail("Pitäisi olla false, koska syöte oli virheellinen");
        }
    }
}
