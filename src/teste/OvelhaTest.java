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
		Ovelha abe = new Ovelha(false, new Campo(50, 50), new Localizacao(20, 19));
		abe.corre(teste);
		assertTrue(abe.estaViva());
		// Foi visto que a partir do momento que é chamado o método corre, a ovelha
		// morria.
	}

	@Test
	public void testCorre2() {
		ArrayList<Ovelha> teste = new ArrayList<Ovelha>();
		Ovelha abe = new Ovelha(false, new Campo(100, 100), new Localizacao(3,3));
		int i = 1;
		while (i < 42) {
			abe.corre(teste);
			i++;
		}
		assertFalse(abe.estaViva());
		// Foi visto que a ovelha não morre ao chegar na idade máxima
	}

	@Test
	public void testEstaViva() {
		Ovelha o = new Ovelha(false, new Campo(20, 20), new Localizacao(2, 2));
		assertTrue(o.estaViva());
	}

	@Test
	public void testEstaVivaEstandoMorta() {
		Ovelha o = new Ovelha(false, new Campo(20, 20), new Localizacao(2, 2));
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
		Ovelha o = new Ovelha(false, new Campo(50, 50), new Localizacao(49, 49));
		Localizacao loc = new Localizacao(49, 49);
		assertTrue(o.getLocalizacao().getLinha() == loc.getLinha() && o.getLocalizacao().getColuna() == loc.getColuna());
	}

	@Test
	public void testProcria() {
		ArrayList<Ovelha> ov = new ArrayList<Ovelha>();

		Campo c = new Campo(4, 4);
		Localizacao l = new Localizacao(0, 0);
		Ovelha ovelha = new Ovelha(false, c, l);
		ov.add(ovelha);
		int ite = 0;
		while (ite < 7) {
			ovelha.corre(ov);
			ite++;
		}
		int contr = 0;
		for (int i = 0; i < c.getLargura(); i++) {
			for (int j = 0; j < c.getProfundidade(); j++) {
				if (c.getObjectAt(i, j) != null) {
					contr++;
				}

			}
		}

		assertTrue(contr>1);

	}

}