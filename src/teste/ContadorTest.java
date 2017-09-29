package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ol.Contador;

public class ContadorTest {

	//Como testa construtor de classe?
	//---------------------------------------------------------------------------------------------------------------------------------
	//ok
	@Test
	public void testContador() {
		
		Contador cont = new Contador("");
		assertNotEquals(null, cont);	
		
	}
	
	
	

	//-----------------------------------------------------------------------------------------------------------------------------------
	//Acaita qualquer coisa, esse é mesmo o esperdo destes metodos? Ou o conjunto de string é limitado?
	//ok
	@Test
	public void testGetName() {
		
		Contador cont = new Contador("lobo");
		assertEquals("lobo", cont.getName());
	}
	//ok
	@Test
	public void testGetName1() {
		
		Contador cont = new Contador("");
		assertNotEquals("lobo", cont.getName());
	}
	//ok
	@Test
	public void testGetName2() {
		
		Contador cont = new Contador("Ovelha");
		assertEquals("Ovelha", cont.getName());
	}
	//ok
	@Test
	public void testGetName3() {
		
		Contador cont = new Contador("1.%£ + lobo");
		assertEquals("1.%£ + lobo", cont.getName());
	}
	//ok
	@Test
	public void testGetName4() {
		
		Contador cont = new Contador(" ");
		assertNotEquals("  ", cont.getName());
	}
	
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	//ok
	@Test
	public void testGetCount() {
		
		Contador cont = new Contador("Ovelha");
		assertEquals(0, cont.getCount());
		
		
	}
	//ok
	@Test
	public void testGetCount2() {
		
		Contador cont = new Contador("");
		assertEquals(0, cont.getCount());		
		
	}
	


	//----------------------------------------------------------------------------------------------------------------------------------
	//ok
	@Test
	public void testIncrement() {
		
		Contador cont = new Contador("Ovelha");
		cont.increment();
		assertEquals(1, cont.getCount());
		
		
	}
	//ok
	@Test
	public void testIncrement1() {
		
		Contador cont = new Contador("Ovelha");
	for(int i=0; i<1000; i++) {
		cont.increment();
	  }
		
		assertEquals(1000, cont.getCount());
		
		
	}
	//ok
	@Test
	public void testIncrement3() {
		
		Contador cont = new Contador("Ovelha");
		assertNotEquals(1, cont.getCount());
		
		
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------
	//ok
	@Test
	public void testReset() {
		Contador cont = new Contador("Ovelha");
		for(int i=0; i<1000; i++) {
			cont.increment();
		  }
			cont.reset();			
			assertEquals(0, cont.getCount());
	}

	//ok
	@Test
	public void testReset1() {
		Contador cont = new Contador("Ovelha");
		cont.reset();
		assertEquals(0, cont.getCount());
	}
	
	
	
	
	
	
}
