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
public class CampoTest {
    
    public CampoTest() {
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
     * Test of limpa method, of class Campo.
     */
    @Test
    public void testLimpa_0args() {
        System.out.println("limpa");
        Campo instance = null;
        instance.limpa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpa method, of class Campo.
     */
    @Test
    public void testLimpa_Localizacao() {
        System.out.println("limpa");
        Localizacao localizacao = null;
        Campo instance = null;
        instance.limpa(localizacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lugar method, of class Campo.
     */
    @Test
    public void testLugar_3args() {
        System.out.println("lugar");
        Object animal = null;
        int linha = 0;
        int coluna = 0;
        Campo instance = null;
        instance.lugar(animal, linha, coluna);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lugar method, of class Campo.
     */
    @Test
    public void testLugar_Object_Localizacao() {
        System.out.println("lugar");
        Object animal = null;
        Localizacao localizacao = null;
        Campo instance = null;
        instance.lugar(animal, localizacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectAt method, of class Campo.
     */
    @Test
    public void testGetObjectAt_Localizacao() {
        System.out.println("getObjectAt");
        Localizacao localizacao = null;
        Campo instance = null;
        Object expResult = null;
        Object result = instance.getObjectAt(localizacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectAt method, of class Campo.
     */
    @Test
    public void testGetObjectAt_int_int() {
        System.out.println("getObjectAt");
        int linha = 0;
        int coluna = 0;
        Campo instance = null;
        Object expResult = null;
        Object result = instance.getObjectAt(linha, coluna);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localizacaoAdjacenteRandomica method, of class Campo.
     */
    @Test
    public void testLocalizacaoAdjacenteRandomica() {
        System.out.println("localizacaoAdjacenteRandomica");
        Localizacao localizacao = null;
        Campo instance = null;
        Localizacao expResult = null;
        Localizacao result = instance.localizacaoAdjacenteRandomica(localizacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localizacoesAdjacentesLivres method, of class Campo.
     */
    @Test
    public void testLocalizacoesAdjacentesLivres() {
        System.out.println("localizacoesAdjacentesLivres");
        Localizacao localizacao = null;
        Campo instance = null;
        List<Localizacao> expResult = null;
        List<Localizacao> result = instance.localizacoesAdjacentesLivres(localizacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localizacaoAdjacenteLivre method, of class Campo.
     */
    @Test
    public void testLocalizacaoAdjacenteLivre() {
        System.out.println("localizacaoAdjacenteLivre");
        Localizacao localizacao = null;
        Campo instance = null;
        Localizacao expResult = null;
        Localizacao result = instance.localizacaoAdjacenteLivre(localizacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localizacoesAdjacentes method, of class Campo.
     */
    @Test
    public void testLocalizacoesAdjacentes() {
        System.out.println("localizacoesAdjacentes");
        Localizacao localizacao = null;
        Campo instance = null;
        List<Localizacao> expResult = null;
        List<Localizacao> result = instance.localizacoesAdjacentes(localizacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfundidade method, of class Campo.
     */
    @Test
    public void testGetProfundidade() {
        System.out.println("getProfundidade");
        Campo instance = null;
        int expResult = 0;
        int result = instance.getProfundidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLargura method, of class Campo.
     */
    @Test
    public void testGetLargura() {
        System.out.println("getLargura");
        Campo instance = null;
        int expResult = 0;
        int result = instance.getLargura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
