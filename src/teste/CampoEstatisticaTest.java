package teste;

import static org.junit.Assert.*;

import javax.xml.transform.SourceLocator;

import org.junit.Ignore;
import org.junit.Test;

import ol.Campo;
import ol.CampoEstatistica;
import ol.LoboGuara;
import ol.Localizacao;
import ol.Ovelha;

public class CampoEstatisticaTest {
	
	
	
	
	@Test
	public void testCampoEstatistica() {
		CampoEstatistica campoe = new CampoEstatistica();
		assertNotEquals(campoe, null);
	}

	
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	/*
	 * Erro: O object é criado como a variavél contadoresValidos = true: No método getPopulationDetalis o if testa !contadoresValidos. 
	 * com isso o método não faz a sua função. 
	 */
	@Test
	public void testGetPopulationDetails() {
		Campo c = new Campo(3,3);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(0,1));
		Ovelha ove2 = new Ovelha(true, c, new Localizacao(0,2));		
		CampoEstatistica campoe = new CampoEstatistica();
		assertNotEquals(null, campoe.getPopulationDetails(c));
		
		
		
	}
	
	
	@Test
	public void testGetPopulationDetails2() {
		Campo c = new Campo(3,3);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(0,1));
		Ovelha ove2 = new Ovelha(true, c, new Localizacao(0,2));		
		CampoEstatistica campoe = new CampoEstatistica();
		assertTrue( campoe.getPopulationDetails(c) instanceof String);	
		
		
	}
	
	
	
	/*
	 * Erro: a String sempre contera informações dos pacotes nos quais eles estão localizados: Exemplo, ol.Ovelha, ol.NomeCLasse,...
	 */
	@Test
	public void testGetPopulationDetails3() {
		Campo c = new Campo(100,100);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(0,1));
		Ovelha ove2 = new Ovelha(true, c, new Localizacao(0,2));
		CampoEstatistica campoe = new CampoEstatistica();
		assertEquals( campoe.getPopulationDetails(c) , "ol.Ovelha: 3 ");	
		
		
	}
	
	
	
	/*
	 * Erro, o campo (ja reportado antes, aceita qualquer Object,  detecta e gera a string com esses objectos )
	 * Nota: de Tempos em tempo, o retorno do metodo permuta a ordem da saida: Por que?  R: ?
	 */
	@Test
	public void testGetPopulationDetails4() {
		Campo c = new Campo(3,3);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(0,1));
		Ovelha ove2 = new Ovelha(true, c, new Localizacao(0,2));
		LoboGuara lobo = new LoboGuara(true, c, new Localizacao(1, 0));
		LoboGuara lobo1 = new LoboGuara(true, c, new Localizacao(2, 0));
		LoboGuara lobo2 = new LoboGuara(true, c, new Localizacao(1, 1));
		Campo  teste = new Campo(1, 1);
		c.lugar(teste, 1, 2);
		c.lugar(teste, 2, 2);
		c.lugar(teste, 2, 1);
		CampoEstatistica campoe = new CampoEstatistica();
		assertEquals( campoe.getPopulationDetails(c) ,"ol.LoboGuara: 3 ol.Ovelha: 3 ol.Campo: 3 ");	
		
		
	}
	
	@Test
	public void testGetPopulationDetails5() {
		Campo c = new Campo(300,10);
		CampoEstatistica campoe = new CampoEstatistica();
		assertEquals("", campoe.getPopulationDetails(c));
		}
	
	
	@Test
	public void testGetPopulationDetails6() {
		Campo c = new Campo(10000,2);
		
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		for(int i =0; i<10000;i++) {
			
			c.lugar(ove, i, 0);			
			
		}
		LoboGuara lobo = new LoboGuara(true, c, new Localizacao(0, 1));
        for(int i =0; i<10000;i++) {
			
			c.lugar(lobo, i, 1);			
			
		}
		
		
		CampoEstatistica campoe = new CampoEstatistica();
		assertEquals( campoe.getPopulationDetails(c) , "ol.Ovelha: 10000 ol.LoboGuara: 10000");	
		
		
	}
    //-----------------------------------------------------------------------------------------------------------------------------------
	
	@Test
	public void testRedefine() {
		
		Campo c = new Campo(3,3);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(0,1));
		Ovelha ove2 = new Ovelha(true, c, new Localizacao(0,2));
		CampoEstatistica campoe = new CampoEstatistica();
	   	campoe.incrementaContador(ove.getClass());
	   	campoe.incrementaContador(ove.getClass());
	   
	   	campoe.redefine();
	   	campoe.contadorFinalizado();
		
	   	
		assertEquals(campoe.getPopulationDetails(c),"ol.Ovelha: 0 ");
		
	}
	
	


	//-----------------------------------------------------------------------------------------------------------------------------------
	/*
	 * Existem 3 ovelhas no campo. Inicia compoEst, incrementa em 1 : (Como não leu o campo acusa apenas 1.)
	 */
	@Test
	public void testIncrementaContador() {
		Campo c = new Campo(3,3);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(0,1));
		Ovelha ove2 = new Ovelha(true, c, new Localizacao(0,2));
		CampoEstatistica campoe = new CampoEstatistica();
	   	campoe.incrementaContador(ove.getClass());
	   
		campoe.contadorFinalizado();
	   	
		assertEquals(campoe.getPopulationDetails(c),"ol.Ovelha: 1 ");
		
	}
	
	
	/*
	 * Chama getPolu, depois incrementa 1:
	 */
	@Test
	public void testIncrementaContador2() {
		Campo c = new Campo(3,3);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(0,1));
		Ovelha ove2 = new Ovelha(true, c, new Localizacao(0,2));
		CampoEstatistica campoe = new CampoEstatistica();
		campoe.getPopulationDetails(c);
		
	   	campoe.incrementaContador(ove.getClass());
	   
		campoe.contadorFinalizado();
	   	
		assertEquals(campoe.getPopulationDetails(c),"ol.Ovelha: 4 ");
		
	}
	/*
	 * Incrementa, depois conta as 3 q estão no campo..  o contador tem 4 ovelhas ou 3? R: apenas 3 como esperado.
	 */
	
	@Test
	public void testIncrementaContado3() {
		Campo c = new Campo(3,3);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(0,1));
		Ovelha ove2 = new Ovelha(true, c, new Localizacao(0,2));
		CampoEstatistica campoe = new CampoEstatistica();
		
		
	   	campoe.incrementaContador(ove.getClass());
	   	campoe.getPopulationDetails(c);
	   
		campoe.contadorFinalizado();
	   	
		assertNotEquals(campoe.getPopulationDetails(c),"ol.Ovelha: 4 ");
		
	}
	
	
    //---------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testContadorFinalizado() {
	
		Campo c = new Campo(100,100);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(0,1));
		Ovelha ove2 = new Ovelha(true, c, new Localizacao(0,2));
		CampoEstatistica campoe = new CampoEstatistica();
		campoe.contadorFinalizado();
		assertEquals( campoe.getPopulationDetails(c) ,"");
		
	
	}

	//----------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testEhViavel() {
		Campo c = new Campo(100,100);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(0,1));
		Ovelha ove2 = new Ovelha(true, c, new Localizacao(0,2));
		CampoEstatistica campoe = new CampoEstatistica();
		assertFalse(campoe.ehViavel(c));
		
		
	}

	
	@Test
	public void testEhViavel2() {
		Campo c = new Campo(100,100);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(0,1));
		Ovelha ove2 = new Ovelha(true, c, new Localizacao(0,2));
		LoboGuara lobo = new LoboGuara(true, c, new Localizacao(1, 0));
		CampoEstatistica campoe = new CampoEstatistica();
		assertTrue(campoe.ehViavel(c));		
		
	}
	
	
	@Test
	public void testEhViavel3() {
		Campo c = new Campo(100,100);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		LoboGuara lobo = new LoboGuara(true, c, new Localizacao(1, 0));
		CampoEstatistica campoe = new CampoEstatistica();
		assertTrue(campoe.ehViavel(c));		
		
	}
	
	

	/*
	 * Erro: Se tiver Object que não seja ovelha ou lobo, o metodo retorna true, e uma nova etapa de simulação pode ocorrer:
	 */
	@Test
	public void testEhViavel4() {
		Campo c = new Campo(100,100);
		Campo teste = new Campo(1,1);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0,0));
		LoboGuara lobo = new LoboGuara(true, c, new Localizacao(1, 0));
		c.lugar(teste, 0, 1);
		CampoEstatistica campoe = new CampoEstatistica();
		assertFalse(campoe.ehViavel(c));		    
		
		
	}
	
}
