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
public class LocalizacaoTest {
    
    public LocalizacaoTest() {
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
     * Test of equals method, of class Localizacao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Localizacao instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Localizacao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Localizacao instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Localizacao.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Localizacao instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLinha method, of class Localizacao.
     */
    @Test
    public void testGetLinha() {
        System.out.println("getLinha");
        Localizacao instance = null;
        int expResult = 0;
        int result = instance.getLinha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColuna method, of class Localizacao.
     */
    @Test
    public void testGetColuna() {
        System.out.println("getColuna");
        Localizacao instance = null;
        int expResult = 0;
        int result = instance.getColuna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
