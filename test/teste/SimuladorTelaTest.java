/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.awt.Color;
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
public class SimuladorTelaTest {
    
    public SimuladorTelaTest() {
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
     * Test of setCor method, of class SimuladorTela.
     */
    @Test
    public void testSetCor() {
        System.out.println("setCor");
        Class animalClass = null;
        Color color = null;
        SimuladorTela instance = null;
        instance.setCor(animalClass, color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostraStatus method, of class SimuladorTela.
     */
    @Test
    public void testMostraStatus() {
        System.out.println("mostraStatus");
        int etapa = 0;
        Campo campo = null;
        SimuladorTela instance = null;
        instance.mostraStatus(etapa, campo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ehViavel method, of class SimuladorTela.
     */
    @Test
    public void testEhViavel() {
        System.out.println("ehViavel");
        Campo campo = null;
        SimuladorTela instance = null;
        boolean expResult = false;
        boolean result = instance.ehViavel(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
