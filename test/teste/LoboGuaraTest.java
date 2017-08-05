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
public class LoboGuaraTest {
    
    public LoboGuaraTest() {
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
     * Test of caca method, of class LoboGuara.
     */
    @Test
    public void testCaca() {
        System.out.println("caca");
        List<LoboGuara> novosLobos = null;
        LoboGuara instance = null;
        instance.caca(novosLobos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVivo method, of class LoboGuara.
     */
    @Test
    public void testEstaVivo() {
        System.out.println("estaVivo");
        LoboGuara instance = null;
        boolean expResult = false;
        boolean result = instance.estaVivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalizacao method, of class LoboGuara.
     */
    @Test
    public void testGetLocalizacao() {
        System.out.println("getLocalizacao");
        LoboGuara instance = null;
        Localizacao expResult = null;
        Localizacao result = instance.getLocalizacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
