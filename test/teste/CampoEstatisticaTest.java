/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

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
public class CampoEstatisticaTest {
    
    public CampoEstatisticaTest() {
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
     * Test of getPopulationDetails method, of class CampoEstatistica.
     */
    @Test
    public void testGetPopulationDetails() {
        System.out.println("getPopulationDetails");
        Campo campo = null;
        CampoEstatistica instance = new CampoEstatistica();
        String expResult = "";
        String result = instance.getPopulationDetails(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redefine method, of class CampoEstatistica.
     */
    @Test
    public void testRedefine() {
        System.out.println("redefine");
        CampoEstatistica instance = new CampoEstatistica();
        instance.redefine();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementaContador method, of class CampoEstatistica.
     */
    @Test
    public void testIncrementaContador() {
        System.out.println("incrementaContador");
        Class animalClass = null;
        CampoEstatistica instance = new CampoEstatistica();
        instance.incrementaContador(animalClass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contadorFinalizado method, of class CampoEstatistica.
     */
    @Test
    public void testContadorFinalizado() {
        System.out.println("contadorFinalizado");
        CampoEstatistica instance = new CampoEstatistica();
        instance.contadorFinalizado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ehViavel method, of class CampoEstatistica.
     */
    @Test
    public void testEhViavel() {
        System.out.println("ehViavel");
        Campo campo = null;
        CampoEstatistica instance = new CampoEstatistica();
        boolean expResult = false;
        boolean result = instance.ehViavel(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
