package teste;

import static org.junit.Assert.*;

import java.awt.List;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.junit.*;
import ol.*;

public class OvelhaTest {

	@Test
	public void testCorre() {
		ArrayList<Ovelha> teste = new ArrayList<Ovelha>();
		Ovelha abe = new Ovelha(false, new Campo(50, 50), new Localizacao(20, 19));
		abe.corre(teste);
		assertTrue(abe.estaVivo());
		// Foi visto que a partir do momento que é chamado o método corre, a ovelha
		// morria.
	}

	@Test
	public void testCorre2() {
		ArrayList<Ovelha> teste = new ArrayList<Ovelha>();
		Ovelha abe = new Ovelha(false, new Campo(100, 100), new Localizacao(3, 3));
		int i = 1;
		while (i < 41) {
			abe.corre(teste);
			i++;
		}
		assertFalse(abe.estaVivo());
		// Foi visto que a ovelha não morre ao chegar na idade máxima
	}

	@Test
	public void testEstaViva() {
		Ovelha o = new Ovelha(false, new Campo(20, 20), new Localizacao(2, 2));
		assertTrue(o.estaVivo());
	}

	@Test
	public void testEstaVivaEstandoMorta() {
		Ovelha o = new Ovelha(false, new Campo(20, 20), new Localizacao(2, 2));
		o.setMorte();
		assertFalse(o.estaVivo());
	}

	@Test
	public void testSetMorte() {
		Campo camp = new Campo(20, 20);
		Localizacao local = new Localizacao(2, 2);
		Ovelha o = new Ovelha(false, camp, local);
		o.setMorte();
		assertFalse(o.estaVivo());
	}

	@Test
	public void testGetLocalizacao() {
		Ovelha o = new Ovelha(false, new Campo(50, 50), new Localizacao(49, 49));
		Localizacao loc = new Localizacao(49, 49);
		assertTrue(
				o.getLocalizacao().getLinha() == loc.getLinha() && o.getLocalizacao().getColuna() == loc.getColuna());
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

		assertTrue(contr > 1);

	}

	@Test (expected= Exception.class)
	public void testDaALuz() throws Exception {
		//Teste de um campo 1x1 que chama da a luz, deve lancar execcao pois nao ha espaco no campo para mais uma ovelha
		Ovelha o = new Ovelha(false, new Campo(1, 1), new Localizacao(0, 0));
		Method daALuz= o.getClass().getDeclaredMethod("daALuz");
		daALuz.setAccessible(true);
		ArrayList<Ovelha> ao = new ArrayList<Ovelha>();
		ao.add(o);
		daALuz.invoke(o, ao);
		daALuz.invoke(o, ao);
	}
	
	@Test
	public void testIncrementaIdade() throws Exception {
		Ovelha lb = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		Method incrementaIdade = lb.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		incrementaIdade.invoke(lb);
		incrementaIdade.invoke(lb);
		assertEquals(2, lb.getIdade());
	}
	
	@Test
	public void testIncrementaIdade2() throws Exception {
		Ovelha ove = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		Method incrementaIdade = ove.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for(int i=0; i<40; i++) {
			incrementaIdade.invoke(ove);
		}
		assertEquals(false, ove.estaVivo());
	}
	
	@Test
	public void testIncrementaIdade3() throws Exception {
		Ovelha ove = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		Method incrementaIdade = ove.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for(int i=0; i<39; i++) {
			incrementaIdade.invoke(ove);
		}
		assertEquals(true, ove.estaVivo());
	}
	


	@Test
	public void testProcriaReflection() throws Exception {
		Ovelha lb = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		// Tornar a idade a idade de procriacao
		Method incrementaIdade = lb.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		int j = 0;
		while (j < 6) {
			incrementaIdade.invoke(lb);
			j++;
		}
		Method procria = lb.getClass().getDeclaredMethod("procria");
		procria.setAccessible(true);
		int i = (Integer) procria.invoke(lb);
		assertTrue(i > 0);

	}
	@Test
	public void testPodeProcriar() throws Exception {
		Ovelha ove = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		Method incrementaIdade = ove.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		int j = 0;
		while (j < 6) {
			incrementaIdade.invoke(ove);
			j++;
		}
		Method podeProcriar = ove.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		assertEquals(true,podeProcriar.invoke(ove));
	}
	
	@Test
	public void testPodeProcriar2() throws Exception {
		Ovelha ove = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		Method incrementaIdade = ove.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		int j = 0;
		while (j < 2) {
			incrementaIdade.invoke(ove);
			j++;
		}
		Method podeProcriar = ove.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		assertEquals(false,podeProcriar.invoke(ove));
	}
	
	@Test
	public void testPodeProcriar3() throws Exception {
		Ovelha ove = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		Method incrementaIdade = ove.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		int j = 0;
		while (j < 3) {
			incrementaIdade.invoke(ove);
			j++;
		}
		Method podeProcriar = ove.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		assertEquals(false,podeProcriar.invoke(ove));
	}
	
	@Test
	public void testPodeProcriarMorta() throws Exception {
		Ovelha ove = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		Method incrementaIdade = ove.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		int j = 0;
		while (j < 42) {
			incrementaIdade.invoke(ove);
			j++;
		}
		Method podeProcriar = ove.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		assertEquals(false,podeProcriar.invoke(ove));
	}
	@Test
	public void testPodeProcriar5() throws Exception {
		Ovelha ove = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		Method incrementaIdade = ove.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		int j = 0;
		while (j < 6) {
			incrementaIdade.invoke(ove);
			j++;
		}
		Method podeProcriar = ove.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		assertEquals(true,podeProcriar.invoke(ove));
	}
	
	@Test
	public void testPodeProcriar10() throws Exception {
		Ovelha ove = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		Method incrementaIdade = ove.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		int j = 0;
		while (j < 10) {
			incrementaIdade.invoke(ove);
			j++;
		}
		Method podeProcriar = ove.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		assertEquals(true,podeProcriar.invoke(ove));
	}
	

	@Test
	public void testPodeProcriar40() throws Exception {
		Ovelha ove = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		Method incrementaIdade = ove.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		int j = 0;
		while (j < 40) {
			incrementaIdade.invoke(ove);
			j++;
		}
		Method podeProcriar = ove.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		assertEquals(true,podeProcriar.invoke(ove));
	}
	
	
	@Test
	public void testGetIdade() throws Exception{
		Ovelha ove = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		assertEquals(0, ove.getIdade());
	}
	
	@Test
	public void testGetIdade2() throws Exception{
		Ovelha ove = new Ovelha(false, new Campo(50, 50), new Localizacao(1, 1));
		Method incrementaIdade = ove.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		int j = 0;
		while (j < 40) {
			incrementaIdade.invoke(ove);
			j++;
		}
		assertEquals(40, ove.getIdade());
	}

}