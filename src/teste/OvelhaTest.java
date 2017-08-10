package teste;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import org.junit.*;
import ol.*;

public class OvelhaTest {

	@Test
	public void testCorre() {
		ArrayList<Ovelha> teste = new ArrayList<Ovelha>();
		Localizacao oasss = new Localizacao(20, 19);
		Campo camp = new Campo(50, 50);
		Ovelha abe = new Ovelha(false, camp, oasss);
		abe.corre(teste);
		assertTrue(abe.estaViva());
		//Foi visto que a partir do momento que é chamado o método corre, a ovelha morria.
	}
	

	@Test
	public void testCorre2() {
		ArrayList<Ovelha> teste = new ArrayList<Ovelha>();
		Localizacao oasss = new Localizacao(20, 19);
		Campo camp = new Campo(50, 50);
		Ovelha abe = new Ovelha(false, camp, oasss);
		int i = 0;
		while (i<42) {
			abe.corre(teste);
			i++;
		}
		assertFalse(abe.estaViva());
		//Foi visto que a ovelha não morre ao chegar na idade máxima
	}
	
	

	@Test
	public void testEstaViva() {
		Campo camp = new Campo(20, 20);
		Localizacao local = new Localizacao(2, 2);
		Ovelha o = new Ovelha(false, camp, local);
		assertTrue(o.estaViva());
	}
	
	@Test
	public void testIdade() {
		int i = 0;
		
	}

	@Test
	public void testEstaVivaa() {
		// assertTrue(dolly.estaViva());
	}

	@Test
	public void testEstaVivaEstandoMorta() {
		Campo camp = new Campo(20, 20);
		Localizacao local = new Localizacao(2, 2);
		Ovelha o = new Ovelha(false, camp, local);
		o.setMorte();
		assertFalse(o.estaViva());
	}

	@Test
	public void testSetMorte() {
		Campo camp = new Campo(20, 20);
		Localizacao local = new Localizacao(2, 2);
		Ovelha o = new Ovelha(false, camp, local);
		o.setMorte();
		assertFalse(o.estaViva());
	}

	@Test
	public void testGetLocalizacao() {
		Campo camp = new Campo(50, 50);
		Localizacao local = new Localizacao(49, 49);
		Ovelha o = new Ovelha(false, camp, local);
		Localizacao loc = new Localizacao(49, 49);
		if (o.getLocalizacao().getLinha() == loc.getLinha() && o.getLocalizacao().getColuna() == loc.getColuna()) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}

	}
}