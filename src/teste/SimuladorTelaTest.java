package teste;

import static org.junit.Assert.*;

import java.awt.Color;

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
		SimuladorTela s = new SimuladorTela(780, 1378);
		assertEquals(s.getRootPane().getHeight(), 741);		
		
	}
	
	/*
	 * Testar as dimeções da tela
	 */
	
	@Test
	public void testSimuladorTela5() {
		SimuladorTela s = new SimuladorTela(780,1200);
		assertEquals(s.getHeight(), 780);		
		
	}
	
	@Test
	public void testSimuladorTela6() {
		SimuladorTela s = new SimuladorTela(100, 1953);
		assertTrue(s.isVisible());		
	
	}
	
		
	
	
	//----------------------------------------------------------------------------------------------------------------------------------

	
	//Erro: Passando null ele adiciona objeto null a lista com a cor Laranja.
	
	@Test (expected = IllegalArgumentException.class)
	public void testSetCor() {	   
		SimuladorTela s = new SimuladorTela(1000, 1000);
		s.setCor(null, Color.ORANGE);		
		
	}
	
	@Test 
	public void testSetCor1() {	   
		SimuladorTela s = new SimuladorTela(1000, 1000);
		Ovelha ove = new Ovelha(true, new Campo(1, 1), new Localizacao(0,0));
		s.setCor(ove.getClass(), Color.ORANGE);
		assertEquals(s.getCores().get(ove.getClass()), Color.ORANGE);
	  			
	}
	
	@Test 
	public void testSetCor2() {	   
		SimuladorTela s = new SimuladorTela(10, 10);
		Campo c = new Campo (1000,1000);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		LoboGuara lobo = new LoboGuara(true, c, new Localizacao(100, 100));
		
		s.setCor(c.getObjectAt(0, 0).getClass(), Color.ORANGE);
		s.setCor(c.getObjectAt(100,100).getClass(), Color.BLUE);
		assertEquals(s.getCores().get(lobo.getClass()), Color.BLUE);
		    			
	}
	
	
	
	/*
	 * Erro: Passar uma cor diferente da cor salva para este animal,
	 * o metodo não valida a cor salva, ele atualiza todos para a ultima cor passada pelo setCor().
	 */
	@Test 
	public void testSetCor3() {	   
		SimuladorTela s = new SimuladorTela(10, 10);
		Campo c = new Campo (1000,1000);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(170, 199));
		LoboGuara lobo = new LoboGuara(true, c, new Localizacao(100, 100));
		
		s.setCor(c.getObjectAt(0, 0).getClass(), Color.ORANGE);
		s.setCor(c.getObjectAt(170,199).getClass(), Color.BLUE);
		s.setCor(c.getObjectAt(100,100).getClass(), Color.BLUE);
		assertEquals(s.getCores().get(ove1.getClass()), Color.BLUE);
		assertEquals(s.getCores().get(ove.getClass()), Color.BLUE);
		    			
	}
	
	
	

	
	
	
	
	
	//----------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testMostraStatus() {
		SimuladorTela s = new SimuladorTela(100, 100);
	     Campo c = new Campo(100, 100);
	     s.mostraStatus(0, c);
	     System.out.println(s.getRotuloEtapa().getText());
	}
	
	@Test
	public void testMostraStatus1() {
		SimuladorTela s = new SimuladorTela(100, 100);
	     Campo c = new Campo(100, 100);
	     s.mostraStatus(999999999, c);
	     System.out.println(s.getRotuloEtapa().getText());
	}
	
	@Test
	public void testMostraStatus2() {
		SimuladorTela s = new SimuladorTela(100, 100);
	     Campo c = new Campo(100, 100);
	     s.mostraStatus(10, c);
	     System.out.println(s.getRotuloEtapa().getText());
	}
	
	
	/*
	 * Erro: Passar um numero negativo não acusa erro, mas deveria ser um IllegalArgumentExeption
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testMostraStatus3() {
		SimuladorTela s = new SimuladorTela(100, 100);
	     Campo c = new Campo(100, 100);
	     s.mostraStatus(-10, c);
	     System.out.println(s.getRotuloEtapa().getText());
	}
	
	
	@Test 
	public void testMostraStatus4() {
		SimuladorTela s = new SimuladorTela(100, 100);
	     Campo c = new Campo(100, 100);
	     s.mostraStatus(1000, c);
	     assertEquals(s.getPapulaco().getText(), "Populacao: ");
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
