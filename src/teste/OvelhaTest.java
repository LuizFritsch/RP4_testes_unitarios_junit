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
		// Foi visto que a partir do momento que � chamado o m�todo corre, a ovelha
		// morria.
	}

	@Test
	public void testCorre2() {
		ArrayList<Ovelha> teste = new ArrayList<Ovelha>();
		Localizacao oasss = new Localizacao(20, 19);
		Campo camp = new Campo(50, 50);
		Ovelha abe = new Ovelha(false, camp, oasss);
		int i = 0;
		while (i < 42) {
			abe.corre(teste);
			i++;
		}
		assertFalse(abe.estaViva());
		// Foi visto que a ovelha n�o morre ao chegar na idade m�xima
	}

	@Test
	public void testEstaViva() {
		Campo camp = new Campo(20, 20);
		Localizacao local = new Localizacao(2, 2);
		Ovelha o = new Ovelha(false, camp, local);
		assertTrue(o.estaViva());
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

	/*
	 * Neste teste, crio um campo 4x4 e crio uma ovelha, fa�o com que a ovelha 
	 * tenha 5 anos que � a idade minima para uma ovelha procriar, e chamo o metodo corre, que chama o metodo procria.
	 * Necessariamente dever� haver mais de um objeto no campo. Importante notar que alterei a probabilidade de uma 
	 * ovelha procriar para 1, para o teste ser mais objetivo.
	 */
	@Test
	public void testProcria() {
		ArrayList<Ovelha> ov = new ArrayList<Ovelha>();

		Campo c = new Campo(4, 4);
		Localizacao l = new Localizacao(0, 0);
		Ovelha ovelha = new Ovelha(false, c, l);
		ov.add(ovelha);
		int ite = 0;
		while (ite < 6) {
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
	
	}

}