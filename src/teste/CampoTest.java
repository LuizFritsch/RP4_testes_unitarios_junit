package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ol.Campo;
import ol.Localizacao;
import ol.Simulador;



public class CampoTest {

	@Test
	public void testCampo() {
		fail("Not yet implemented");
	}

	
	
	//Esperar exceptions se campo for pequeno.
	@Test
	public void testLimpa() {	
		
		Simulador s = new Simulador(5,5); 
	    Localizacao l =  s.getListLobo().get(0).getLocalizacao();
	    s.getCampo().limpa();		
		assertNull(s.getCampo().getObjectAt(l));
	  
		

		
			
		
	}
	
	@Test
	public void testLimpa2() {	
		
		Simulador s = new Simulador(5,5); 
	    Localizacao l2 = s.getListLobo().get(s.getListLobo().size()-1).getLocalizacao();
		s.getCampo().limpa();		
	    assertNull(s.getCampo().getObjectAt(l2));
		

		
			
		
	}

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
	


	
	
	
	

	@Test
	public void testLugarObjectIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testLugarObjectLocalizacao() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetObjectAtLocalizacao() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetObjectAtIntInt() {
		fail("Not yet implemented");
	}

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
		fail("Not yet implemented");
	}

	@Test
	public void testGetProfundidade() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLargura() {
		fail("Not yet implemented");
	}

}
