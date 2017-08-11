package teste;

import static org.junit.Assert.*;

import java.util.List;
import java.util.LinkedList;

import org.junit.Ignore;
import org.junit.Test;

import ol.Campo;
import ol.LoboGuara;
import ol.Localizacao;
import ol.Ovelha;
import ol.Simulador;



public class CampoTest {

	@Test
	public void testCampo() {
		
		Campo c = new Campo(100,100);
		assertNotEquals(c, null);
		
		
	}
	
	
	@Test
	public void testCampo1() {
		
		Campo c = new Campo(100,100);
		assertEquals(100, c.getLargura());
		assertEquals(100, c.getProfundidade());
				
	}
	
	
	@Test
	public void testCampo2() {
		
		Campo c = new Campo(100,100);
		assertNotEquals(101, c.getLargura());
		assertNotEquals(101, c.getProfundidade());
				
	}
	
	
	
	
	@Test
	public void testCampo3() {
		
		Campo c = new Campo(100,100);
		assertSame(null, c.getObjectAt(61, 21));
	}
	
	
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testCampo4() {
		
		Campo c = new Campo(100,100);
		assertSame(null, c.getObjectAt(100, 2100));
	}
	
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testCampo5() {
		
		Campo c = new Campo(100,100);
		assertSame(null, c.getObjectAt(-100, -2100));
	}
	
	
	//-------------------------------------------------------------------------------------------

	
	
	//Esperar exceptions se campo for pequeno.
	@Test
	public void testLimpa() {	
		
		
		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(50, 50);
		LoboGuara lobo = new LoboGuara(true, c, l);
		c.lugar(lobo, new Localizacao(50,50));
        c.limpa();	    		
		assertNull(c.getObjectAt(l));		

		
			
		
	}
	
	@Test
	public void testLimpa1() {	
		
		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(50, 50);
		LoboGuara lobo = new LoboGuara(true, c, l);
		c.lugar(lobo, new Localizacao(50,50));
        c.limpa();			
		assertNotSame(lobo, c.getObjectAt(l));		

			
		
	}
	
	@Test
	public void testLimpa3() {	
		
		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(50, 50);
		Ovelha ove = new Ovelha(true, c, l);
        c.limpa();	
	   	    		
		assertNotSame(ove,c.getObjectAt(l));		
			
		
	}
	
	
	@Test
	public void testLimpa4() {	
		
		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(50, 50);
		Ovelha ove = new Ovelha(true, c, l);
        c.limpa();              		
		assertSame(null, c.getObjectAt(l));		

		
			
		
	}
	
	
	
	@Test
	public void testLimpa2() {	
		
		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(50, 50);
		c.limpa();	
	    assertNull(c.getObjectAt(l));
		

		
			
		
	}
	//--------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testLimpaLocalizacao() {		

		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(50, 50);
		LoboGuara lobo = new LoboGuara(true, c, l);
		c.lugar(lobo, new Localizacao(50,50));
        c.limpa(l);		
	    assertNull(c.getObjectAt(l));
		
	    
	}
	
	
	@Test
	public void testLimpaLocalizacao2() {		

		Simulador s = new Simulador(5,5); 
	    Localizacao l = s.getListLobo().get(0).getLocalizacao();
		s.getCampo().limpa(l);		
	    assertNull(s.getCampo().getObjectAt(l));
		
	    
	}
	
	
	@Test (expected = IndexOutOfBoundsException.class )
	public void testLimpaLocalizacao3() {		

		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(-1, -50);
		LoboGuara lobo = new LoboGuara(true, c, l);
		c.lugar(lobo, new Localizacao(50,50));
        c.limpa(l);
		
	    
	}

	@Test (expected = IndexOutOfBoundsException.class )
	public void testLimpaLocalizacao4() {		


		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(1001, 10050);
		LoboGuara lobo = new LoboGuara(true, c, l);
		c.lugar(lobo, new Localizacao(50,50));
        c.limpa(l);	
	   
		
	    
	}
	

	@Test (expected = IndexOutOfBoundsException.class )
	public void testLimpaLocalizacao5() {		

		Campo c = new Campo(590, 500); 
	    Localizacao l = new Localizacao(590,501);
		c.limpa(l);		
	   
		
	    
	}
		
	
//-------------------------------------------------------------------------------------------------------------------------------------	

	@Test (expected = IllegalArgumentException.class)
	public void testLugarObject() {
		
	
	Campo c = new Campo(10,10);
	Simulador s = new Simulador(100,100);		
	Localizacao l = new Localizacao(50, 50);
	LoboGuara lobo = new LoboGuara(true, s.getCampo(), l);
	s.getCampo().lugar(c, l);
			
			
			
	}
		

	
	//-------------------------------------------------------------------------------------------

	@Test
	public void testLugarObjectLocalizacao() {
		
		Campo c = new Campo(100, 70);
		Localizacao l = new Localizacao(50, 50);
		LoboGuara lobo = new LoboGuara(true, c, l);
		c.lugar(lobo, l);
		
		assertSame(lobo, c.getObjectAt(l));
		
	}
	
	
	@Test
	public void testLugarObjectLocalizacao2() {
		
		Campo c = new Campo(100, 300);		
		Localizacao l = new Localizacao(50, 50);
		LoboGuara lobo = new LoboGuara(true, c, l);
		c.lugar(null, l);
		
		assertNotSame(lobo, c.getObjectAt(l));
		
	}
	
	@Test (expected = Exception.class)
	public void testLugarObjectLocalizacao3() {
		
		Campo c = new Campo(10,10);
		Localizacao l = new Localizacao(50, 50);
		LoboGuara lobo = new LoboGuara(true, c, l);
		c.lugar(c, l);
		
		
		
	}
	
	
   //--------------------------------------------------------------------------------------------
	@Test
	public void testGetObjectAtLocalizacao() {
		Campo c = new Campo(100,100);
		Localizacao l = new Localizacao(50, 50);
		LoboGuara lobo = new LoboGuara(true, c, l);	   
	    assertTrue(c.getObjectAt(l) instanceof LoboGuara);			
	
					
	}
	
	
	
	@Test
	public void testGetObjectAtLocalizacao2() {
		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(50, 50);
		Ovelha ove = new Ovelha(true, c, l);
	    assertTrue(c.getObjectAt(l) instanceof Ovelha);
	   		
		
	}
	
	
	@Test
	public void testGetObjectAtLocalizacao3() {
		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(50, 50);
		Ovelha ove = new Ovelha(true, c, l);
	    c.limpa();
		    
	    
	    assertNull(c.getObjectAt(l));			
						
	}
	
	
	@Test
	public void testGetObjectAtLocalizaca4() {
		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(50, 50);
		Ovelha ove = new Ovelha(true, c, l);
		c.limpa(l);
		    
	    
	    assertNull(c.getObjectAt(l));			
						
	}
	
	
	
	
	

	//---------------------------------------------------------------------------------------------------------------------------------
	@Test
	public void testGetObjectAt() {
		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(50, 50);
		Ovelha ove = new Ovelha(true, c, l);
	    assertEquals(ove,c.getObjectAt(l.getLinha(), l.getColuna()));			
	
	}
	
	
	
	@Test
	public void testGetObjectAt1() {
		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(50, 50);	    
		
	    assertEquals(null, c.getObjectAt(l.getLinha(), l.getColuna()));			
	
	}
	
	
	@Test
	public void testGetObjectAt2() {
		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(50, 50);
	    
	    c.limpa(l);
	    
	    assertEquals(null,c.getObjectAt(l.getLinha(), l.getColuna()));			
	
	}
	
	
		
	
	//----------------------------------------------------------------------------------------------------------------------------------
	@Ignore
	@Test
	public void testLocalizacaoAdjacenteRandomica() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test 
	public void testLocalizacoesAdjacentesLivres() {
		
	}

	@Ignore
	@Test
	public void testLocalizacaoAdjacenteLivre() {
		fail("Not yet implemented");
	}

	@Test
	public void testLocalizacoesAdjacentes() {
		
		Campo c = new Campo(2,1);
		Localizacao l = new Localizacao(0,0);
		
		List<Localizacao> lo = new LinkedList<Localizacao>();
		lo = c.localizacoesAdjacentes(l);
		
		assertEquals(1, lo.size());	
		
		
		
	}
	
	@Test
	public void testLocalizacoesAdjacentes2() {
		
		Campo c = new Campo(2,2);
		Localizacao l = new Localizacao(0,0);
		
		List<Localizacao> lo = new LinkedList<Localizacao>();
		lo = c.localizacoesAdjacentes(l);
		
		assertEquals(3, lo.size());	
		
		
		
	}
	
	@Test
	public void testLocalizacoesAdjacentes3() {
		
		Campo c = new Campo(4,4);
		Localizacao l = new Localizacao(1,1);
		
		List<Localizacao> lo = new LinkedList<Localizacao>();
		lo = c.localizacoesAdjacentes(l);
		
		assertEquals(8, lo.size());		
		
		
	}
	
	
	@Test
	public void testLocalizacoesAdjacentes4() {
		
		Campo c = new Campo(4,4);
		Localizacao l = new Localizacao(0,3);
		
		List<Localizacao> lo = new LinkedList<Localizacao>();
		lo = c.localizacoesAdjacentes(l);
		
		assertEquals(3, lo.size());		
		
		
	}
	
	
	
	@Test
	public void testLocalizacoesAdjacentes5() {
		
		Campo c = new Campo(4,4);
		Localizacao l = new Localizacao(3,3);
		
		List<Localizacao> lo = new LinkedList<Localizacao>();
		lo = c.localizacoesAdjacentes(l);
		
		assertEquals(3, lo.size());		
		
		
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testLocalizacoesAdjacentes6() {
		
		Campo c = new Campo(4,4);
		Localizacao l = new Localizacao(-1,0);
		
		List<Localizacao> lo = new LinkedList<Localizacao>();
		lo = c.localizacoesAdjacentes(l);
		
				
		
		
	}
	
	
	
	

	
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	@Test
	public void testGetProfundidade() {
		int n = 500;
		Campo c = new Campo(500, 100); 
		assertEquals(n ,c.getProfundidade());
		
	}
	
	@Test 
	public void testGetProfundidade1() {
		int n = 10000;
		Campo c = new Campo(10000, 00000); 
		assertEquals(n ,c.getProfundidade());
			
	}
	
	
	
	@Test 
	public void testGetProfundidade2() {
		int n = 0;
		Campo c = new Campo(0, 0);; 
		assertEquals(n ,c.getProfundidade());
		
	}
	
	@Test
	public void testGetProfundidade3() {
		int n = 510;
		Campo c = new Campo(510,1000); 
		assertEquals(n ,c.getProfundidade());
		
	}
	@Test
	public void testGetProfundidade4() {
		Campo c = new Campo(10000, 10000);
		
		assertEquals(c.getLargura(), c.getProfundidade());
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testGetLargura() {
		int n = 31;
		Campo c = new Campo(5,31); 
		assertEquals(n ,c.getLargura());
	}
	
	@Test 
	public void testGetLargura1() {
		int n = 0;
		Campo c = new Campo(5,0); 
		assertEquals(n ,c.getLargura());
	}
	@Test 
	public void testGetLargura3() {
		int n = 0;
		Campo c = new Campo(0,5); 
		assertNotEquals(n ,c.getLargura());
	}
	
	@Test  (expected = IllegalArgumentException.class)
	public void testGetLargura4() {
		int n = -10;
		Campo c = new Campo(-10,-10); 
		assertEquals(n ,c.getLargura());
		//Erro, se informa entradas erradas, deveria retornar excption
		
	}
	
	@Test
	public void testGetLargura5() {
		int n = 2^100000;
		Campo c = new Campo(510,2^100000); 
		assertEquals(n ,c.getLargura());
	}
	
	

}
