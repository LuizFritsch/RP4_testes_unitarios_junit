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
public class SimuladorTest {
    
    public SimuladorTest() {
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
     * Test of executaLongaSimulacao method, of class Simulador.
     */
    @Test
    public void testExecutaLongaSimulacao() {
        System.out.println("executaLongaSimulacao");
        Simulador instance = new Simulador();
        instance.executaLongaSimulacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of simulacao method, of class Simulador.
     */
    @Test
    public void testSimulacao() {
        System.out.println("simulacao");
        int numEtapas = 0;
        Simulador instance = new Simulador();
        instance.simulacao(numEtapas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of simulacaoUmaEtapa method, of class Simulador.
     */
    @Test
    public void testSimulacaoUmaEtapa() {
        System.out.println("simulacaoUmaEtapa");
        Simulador instance = new Simulador();
        instance.simulacaoUmaEtapa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redefine method, of class Simulador.
     */
    @Test
    public void testRedefine() {
        System.out.println("redefine");
        Simulador instance = new Simulador();
        instance.redefine();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
