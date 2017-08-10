package teste;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;
import ol.*;

public class OvelhaTest {

	Campo c = new Campo(50, 50);
	Localizacao oo = new Localizacao(2, 2);
	Localizacao oa = new Localizacao(49, 49);
	Localizacao od = new Localizacao(50, 50);
	Ovelha o = new Ovelha(false, c, oa);
	Ovelha a = new Ovelha(false, c, oa);

	@Test
	public void testCriarOvelhaLocalizacaoInvalida() {
		Campo c = new Campo(20, 20);
		Ovelha dolly = new Ovelha(false, c, od);
	}

	ArrayList<Ovelha> teste = new ArrayList<Ovelha>();

	@Test
	public void testCorre() {
		Simulador s = new Simulador();

	}

	@Test
	public void testEstaViva() {
		assertTrue(o.estaViva());
	}

	@Test
	public void testEstaVivaa() {
		// assertTrue(dolly.estaViva());
	}

	@Test
	public void testEstaVivaEstandoMorta() {
		o.setMorte();
		assertFalse(o.estaViva());
	}

	@Test
	public void testSetMorte() {
		o.setMorte();
		assertFalse(o.estaViva());
		;
	}

	@Test
	public void testGetLocalizacao() {
		Localizacao loc = new Localizacao(49, 49);
		if (o.getLocalizacao().getLinha() == loc.getLinha() && o.getLocalizacao().getColuna() == loc.getColuna()) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}

	}
}