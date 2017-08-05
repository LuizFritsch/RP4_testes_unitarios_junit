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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author VitorSantos
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({teste.LocalizacaoTest.class, teste.CampoTest.class, teste.SimuladorTelaTest.class, teste.CampoEstatisticaTest.class, teste.TesteTest.class, teste.ContadorTest.class, teste.RandomizadorTest.class, teste.SimuladorTest.class, teste.LoboGuaraTest.class, teste.OvelhaTest.class})
public class TesteSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
