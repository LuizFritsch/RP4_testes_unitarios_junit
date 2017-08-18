package teste;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import ol.Campo;
import ol.LoboGuara;
import ol.Localizacao;
import ol.Ovelha;
import ol.Simulador;
import ol.SimuladorTela;

public class SimuladorTelaTest {

	
	@Test
	public void testSimuladorTela() {
		SimuladorTela s = new SimuladorTela(100, 100);
		assertEquals(s.getTitle(), "Simulacao Ovelhas and Lobos Guara");
		
		
	}
	@Test
	public void testSimuladorTela1() {
		SimuladorTela s = new SimuladorTela(100, 100);
		assertNotEquals(null, s);
		
		
	}
	
	/*
	 * Tamanho da janela;
	 */
	@Test
	public void testSimuladorTela2() {
		SimuladorTela s = new SimuladorTela(100, 100);
		assertEquals(s.getX(), 100);		
		
	}
	
	/*
	 * Tamanho da janela: Não diz onde a janela deve iniciar:  Como eu testo isso?
	 */
	@Test
	public void testSimuladorTela3() {
		SimuladorTela s = new SimuladorTela(100, 100);
		assertEquals(s.getY(), 100);		
		
	}
	
	/*
	 * Testar as dimeções da tela
	 */
	
	@Test
	public void testSimuladorTela4() {
		SimuladorTela s = new SimuladorTela(1000, 100);
		assertEquals(s.getWidth(), 100);		
		
	}
	/*
	 * Testar as dimeções da tela
	 */
	
	@Test
	public void testSimuladorTela5() {
		SimuladorTela s = new SimuladorTela(100, 1953);
		assertEquals(s.getHeight(), 1953);		
		
	}
	

	@Test
	public void testSimuladorTela6() {
		SimuladorTela s = new SimuladorTela(100, 1953);
		assertTrue(s.isVisible());		
	
	}
	
		
	
	
	//----------------------------------------------------------------------------------------------------------------------------------

	@Ignore
	@Test
	public void testSetCor() {
		fail("Not yet implemented");
	}

	
	
	//----------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testMostraStatus() {
		SimuladorTela s = new SimuladorTela(100, 100);
	     Campo c = new Campo(100, 100);
	     s.mostraStatus(0, c);
	}

	
	//----------------------------------------------------------------------------------------------------------------------------------
	
	@Test
	public void testEhViavel() {
     SimuladorTela s = new SimuladorTela(1, 1);
     Campo c = new Campo(100, 100);
     assertFalse(s.ehViavel(c));
		
	}
	
	/*
	 * Erro: A classe SimuladorTela, tem obrigação de testar o tamnho do campo, se é maior ou menor q 
	 *  o tamnho da simulação da janela?
	 */
	@Test    
	public void testEhViavel1() {
     SimuladorTela s = new SimuladorTela(1, 1);
     Campo c = new Campo(100, 100);
     Localizacao l = new Localizacao(0, 0);
     Localizacao l1 = new Localizacao(0, 1);
     c.lugar(new LoboGuara(true, c, l), l);
     c.lugar(new Ovelha(true, c, l1), l1);
     assertTrue(s.ehViavel(c));
		
	}


}
