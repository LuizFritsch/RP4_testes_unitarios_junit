package teste;

import static org.junit.Assert.*;

import java.util.List;
import java.util.LinkedList;

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
		assertEquals(c, null);
		
		
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
		
		Simulador s = new Simulador(5,5); 
	    Localizacao l =  s.getListLobo().get(0).getLocalizacao();
	    s.getCampo().limpa();		
		assertNull(s.getCampo().getObjectAt(l));		

		
			
		
	}
	
	@Test
	public void testLimpa1() {	
		
		Simulador s = new Simulador(100,100); 
	    Localizacao l =  s.getListLobo().get(0).getLocalizacao();
	    Campo c = new Campo(50,50);
	    LoboGuara lobo = new LoboGuara(true, c, l);
	    s.getCampo().limpa();		
		assertNotSame(lobo, s.getCampo().getObjectAt(l));		

			
		
	}
	
	@Test
	public void testLimpa3() {	
		
		Simulador s = new Simulador(100,100); 
	    Localizacao l =  s.getListLobo().get(0).getLocalizacao();
	    Campo c = new Campo(50,50);
	    Ovelha ove = new Ovelha(true, c, l);
	    s.getCampo().limpa();		
		assertNotSame(ove,s.getCampo().getObjectAt(l));		
			
		
	}
	
	
	@Test
	public void testLimpa4() {	
		
		Simulador s = new Simulador(100,100); 
	    Localizacao l =  s.getListLobo().get(0).getLocalizacao();
	    
	    s.getCampo().limpa();		
		assertSame(null, s.getCampo().getObjectAt(l));		

		
			
		
	}
	
	
	
	@Test
	public void testLimpa2() {	
		
		Simulador s = new Simulador(5,5); 
	    Localizacao l2 = s.getListLobo().get(s.getListLobo().size()-1).getLocalizacao();
		s.getCampo().limpa();		
	    assertNull(s.getCampo().getObjectAt(l2));
		

		
			
		
	}
	//--------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testLimpaLocalizacao() {		

		Simulador s = new Simulador(5,5); 
	    Localizacao l2 = s.getListLobo().get(s.getListLobo().size()-1).getLocalizacao();
		s.getCampo().limpa(l2);		
	    assertNull(s.getCampo().getObjectAt(l2));
		
	    
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

		Simulador s = new Simulador(5,5); 
	    Localizacao l = new Localizacao(-1, 0);
		s.getCampo().limpa(l);		
	   
		
	    
	}

	@Test (expected = IndexOutOfBoundsException.class )
	public void testLimpaLocalizacao4() {		

		Simulador s = new Simulador(3,3); 
	    Localizacao l = new Localizacao(3, 0);
		s.getCampo().limpa(l);		
	   
		
	    
	}
	

	@Test (expected = IndexOutOfBoundsException.class )
	public void testLimpaLocalizacao5() {		

		Simulador s = new Simulador(3,3); 
	    Localizacao l = new Localizacao(3,2);
		s.getCampo().limpa(l);		
	   
		
	    
	}
		

	@Test (expected = IndexOutOfBoundsException.class )
	public void testLimpaLocalizacao6() {		

		Simulador s = new Simulador(3,3); 
	    Localizacao l = new Localizacao(0,3);
		s.getCampo().limpa(l);		
	   
		
	    
	}
	
	@Test (expected = IndexOutOfBoundsException.class )
	public void testLimpaLocalizacao7() {		

		Simulador s = new Simulador(5,5); 
	    Localizacao l = new Localizacao(3,-1);
		s.getCampo().limpa(l);		
	   
		
	    
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
		Simulador s = new Simulador(100,100);
		
		Localizacao l = new Localizacao(50, 50);
		LoboGuara lobo = new LoboGuara(true, s.getCampo(), l);
		s.getCampo().lugar(lobo, l);
		
		assertSame(lobo, s.getCampo().getObjectAt(l));
		
	}
	
	
	@Test
	public void testLugarObjectLocalizacao2() {
		
		Simulador s = new Simulador(100,100);		
		Localizacao l = new Localizacao(50, 50);
		LoboGuara lobo = new LoboGuara(true, s.getCampo(), l);
		s.getCampo().lugar(null, l);
		
		assertNotSame(lobo, s.getCampo().getObjectAt(l));
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testLugarObjectLocalizacao3() {
		
		Campo c = new Campo(10,10);
		Simulador s = new Simulador(100,100);		
		Localizacao l = new Localizacao(50, 50);
		LoboGuara lobo = new LoboGuara(true, s.getCampo(), l);
		s.getCampo().lugar(c, l);
		
		
		
	}
	
	
   //--------------------------------------------------------------------------------------------
	@Test
	public void testGetObjectAtLocalizacao() {
		Simulador s = new Simulador(100,100); 
	    Localizacao l = s.getListLobo().get(0).getLocalizacao();    
		    
	    LoboGuara lobo = new LoboGuara(true, new Campo(100,100), l);
	    assertTrue(s.getCampo().getObjectAt(l) instanceof LoboGuara);			
	
					
	}
	
	
	
	@Test
	public void testGetObjectAtLocalizacao2() {
		Simulador s = new Simulador(100,100); 
	    Localizacao l = s.getListOvelha().get(0).getLocalizacao();    
		    
	    Ovelha ove = new Ovelha(true, new Campo(100,100), l);
	    assertTrue(s.getCampo().getObjectAt(l) instanceof Ovelha);
	   		
		
	}
	
	
	@Test
	public void testGetObjectAtLocalizacao3() {
		Simulador s = new Simulador(100,100); 
	    Localizacao l = s.getListLobo().get(0).getLocalizacao(); 
	    
	    s.getCampo().limpa();
		    
	    
	    assertNull(s.getCampo().getObjectAt(l));			
						
	}
	
	
	@Test
	public void testGetObjectAtLocalizaca4() {
		Simulador s = new Simulador(100,100); 
	    Localizacao l = s.getListLobo().get(0).getLocalizacao(); 
	    
	    s.getCampo().limpa(l);
		    
	    
	    assertNull(s.getCampo().getObjectAt(l));			
						
	}
	
	
	
	
	

	//---------------------------------------------------------------------------------------------------------------------------------
	@Test
	public void testGetObjectAt() {
		Simulador s = new Simulador(100,100); 
	    Localizacao l = s.getListLobo().get(0).getLocalizacao();    
		    
	    LoboGuara lobo = new LoboGuara(true, s.getCampo(), l);
	    assertEquals(lobo,s.getCampo().getObjectAt(l.getLinha(), l.getColuna()));			
	
	}
	
	
	
	@Test
	public void testGetObjectAt1() {
		Simulador s = new Simulador(100,100); 
	    Localizacao l = s.getListLobo().get(0).getLocalizacao(); 
	    
	    
		s.getCampo().limpa();
	    
	    assertEquals(null, s.getCampo().getObjectAt(l.getLinha(), l.getColuna()));			
	
	}
	
	
	@Test
	public void testGetObjectAt2() {
		Simulador s = new Simulador(100,100); 
	    Localizacao l = s.getListOvelha().get(0).getLocalizacao(); 
	    
	    
	    s.getCampo().limpa(l);
	    
	    assertEquals(null,s.getCampo().getObjectAt(l.getLinha(), l.getColuna()));			
	
	}
	
	
		
	
	//----------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testLocalizacaoAdjacenteRandomica() {
		fail("Not yet implemented");
	}

	@Test
	public void testLocalizacoesAdjacentesLivres() {
		fail("Not yet implemented");
	}

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
		int n = 5;
		Simulador s = new Simulador(5,5); 
		assertEquals(n ,s.getCampo().getProfundidade());
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testGetProfundidade1() {
		int n = 5;
		Simulador s = new Simulador(5,0); 
		assertEquals(n ,s.getCampo().getProfundidade());
			
	}
	
	@Test 
	public void testGetProfundidade2A() {
		int n = 0;
		Simulador s = new Simulador(0,0); 
		assertNotEquals(n ,s.getCampo().getProfundidade());
		
	}
	
	
	@Test (expected = IllegalArgumentException.class)
	public void testGetProfundidade2() {
		int n = 0;
		Simulador s = new Simulador(0,0); 
		assertEquals(n ,s.getCampo().getProfundidade());
		
	}
	
	@Test
	public void testGetProfundidade3() {
		int n = 510;
		Simulador s = new Simulador(510,1000); 
		assertEquals(n ,s.getCampo().getProfundidade());
		
	}
	@Test
	public void testGetProfundidade4() {
		int n = 5;
		Simulador s = new Simulador(50,50); 
		assertNotEquals(n ,s.getCampo().getProfundidade());
		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testGetLargura() {
		int n = 31;
		Simulador s = new Simulador(5,31); 
		assertEquals(n ,s.getCampo().getLargura());
	}
	
	@Test (expected = ArithmeticException.class)
	public void testGetLargura1() {
		int n = 0;
		Simulador s = new Simulador(5,0); 
		assertEquals(n ,s.getCampo().getLargura());
	}
	@Test
	public void testGetLargura3() {
		int n = 5;
		Simulador s = new Simulador(5,5101); 
		assertNotEquals(n ,s.getCampo().getLargura());
	}
	
	@Test 
	public void testGetLargura4() {
		int n = 50;
		Simulador s = new Simulador(-10,-10); 
		assertEquals(n ,s.getCampo().getLargura());
		//Erro, se informa entradas erradas, deveria retornar excption
		
	}
	
	@Test
	public void testGetLargura5() {
		int n = 2^65;
		Simulador s = new Simulador(5,2^65); 
		assertEquals(n ,s.getCampo().getLargura());
	}
	
	

}
