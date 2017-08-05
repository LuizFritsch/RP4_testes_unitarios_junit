/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VitorSantos
 */
public class OvelhaTest {
    
    public OvelhaTest() {
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
     * Test of corre method, of class Ovelha.
     */
    @Test
    public void testCorre() {
        System.out.println("corre");
        List<Ovelha> novasOvelhas = null;
        Ovelha instance = null;
        instance.corre(novasOvelhas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaViva method, of class Ovelha.
     */
    @Test
    public void testEstaViva() {
        System.out.println("estaViva");
        Ovelha instance = null;
        boolean expResult = false;
        boolean result = instance.estaViva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMorte method, of class Ovelha.
     */
    @Test
    public void testSetMorte() {
        System.out.println("setMorte");
        Ovelha instance = null;
        instance.setMorte();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalizacao method, of class Ovelha.
     */
    @Test
    public void testGetLocalizacao() {
        System.out.println("getLocalizacao");
        Ovelha instance = null;
        Localizacao expResult = null;
        Localizacao result = instance.getLocalizacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
