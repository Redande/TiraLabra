/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiralabra_maven;

import Logiikka.Pelimekaniikat;
import Logiikka.Tekoaly;
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
    
    Pelimekaniikat mekaniikat;
    Tekoaly tekoaly;
    
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
        this.mekaniikat = new Pelimekaniikat();
        this.tekoaly = new Tekoaly();
    }
    
    @After
    public void tearDown() {
    }
}
