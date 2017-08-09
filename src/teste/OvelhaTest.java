package teste;


import static org.junit.Assert.*;
import org.junit.*;


import ol.*;

public class OvelhaTest {
	

	Campo c = new Campo(12, 12);
	Localizacao l = new Localizacao(2, 2);
	Ovelha o = new Ovelha(false, c, l);
	
	@Test
	public void testCorre() {
	}

	@Test
	public void testEstaViva() {
		assertTrue(o.estaViva());
	}
	
	@Test
	public void testEstaVivaEstandoMorta() {
		o.setMorte();
		assertFalse(o.estaViva());
	}

	@Test
	public void testSetMorte() {
		o.setMorte();
		assertFalse(o.estaViva());;
	}
	
	@Test
	public void testGetLocalizacao() {
	
	}
}