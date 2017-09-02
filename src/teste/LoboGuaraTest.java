package teste;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import ol.Campo;
import ol.LoboGuara;
import ol.Localizacao;
import ol.Ovelha;
import ol.Simulador;

public class LoboGuaraTest {

	@Ignore
	@Test
	public void testLoboGuara() {

		Localizacao localizacao = new Localizacao(1, 1);
		Campo campo = new Campo(50, 50);
		LoboGuara x = new LoboGuara(true, campo, localizacao);

		fail("Not yet implemented");
	}

	@Test
	public void testPodeProcriar() throws Exception {
		LoboGuara lb = new LoboGuara(false, new Campo(50, 50), new Localizacao(1, 1));
		Method podeProcriar = lb.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		boolean b = (Boolean) podeProcriar.invoke(lb);
		assertFalse(b);
	}
	
	@Test
	public void testPodeProcriar2() throws Exception {
		LoboGuara lb = new LoboGuara(false, new Campo(50, 50), new Localizacao(1, 1));
		Method podeProcriar = lb.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		Method incrementaIdade = lb.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for(int i=0;i<10; i++) {
			incrementaIdade.invoke(lb);
		}
		boolean b = (Boolean) podeProcriar.invoke(lb);
		assertTrue(b);
	}
	

	@Ignore
	@Test
	public void testCaca() {

		Campo campo = new Campo(2, 2);
		Localizacao localizacao1 = new Localizacao(0, 0);
		Localizacao localizacao2 = new Localizacao(0, 1);
		Localizacao localizacao3 = new Localizacao(1, 1);
		Localizacao localizacao4 = new Localizacao(1, 0);
		LoboGuara l1 = new LoboGuara(false, campo, localizacao1);
		List<LoboGuara> x = new ArrayList();
		List<Localizacao> z = new ArrayList();
		z.add(localizacao1);
		z.add(localizacao2);
		z.add(localizacao3);
		z.add(localizacao4);
		x.add(l1);
		int y = 0;
		while (y < 300) {
			for (int i = 0; i < 3; i++) {
				if (z.get(i).equals(l1.getLocalizacao()) && campo.getObjectAt(z.get(i)) == null) {

				} else {
					Ovelha o = new Ovelha(true, campo, z.get(i));
				}
			}
			l1.caca(x);
		}
		assertFalse(l1.estaVivo());

	}

	@Test
	public void testEstaVivo() {
		LoboGuara loboGuara = new LoboGuara(false, new Campo(3, 3), new Localizacao(0, 0));
		assertTrue(loboGuara.estaVivo());
	}

	@Test
	public void testEstaVivoEstandoMorto() {
		LoboGuara loboGuara = new LoboGuara(false, new Campo(3, 3), new Localizacao(0, 0));
		loboGuara.setMorte();
		assertFalse(loboGuara.estaVivo());
	}

	@Test
	public void incrementaIdade() throws Exception{
		LoboGuara lobo = new LoboGuara(false, new Campo(3, 3), new Localizacao(0, 0));
		Method incrementaIdade = lobo.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for(int i=0; i<150; i++) {
			incrementaIdade.invoke(lobo);
		}
		assertFalse(lobo.estaVivo());
	}
	
	@Test
	public void incrementaIdade2() throws Exception{
		LoboGuara lobo = new LoboGuara(false, new Campo(3, 3), new Localizacao(0, 0));
		Method incrementaIdade = lobo.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for(int i=0; i<149; i++) {
			incrementaIdade.invoke(lobo);
		}
		assertTrue(lobo.estaVivo());
	}
	
	@Test
	public void decrementaFome() throws Exception{
		LoboGuara lobo = new LoboGuara(false, new Campo(3, 3), new Localizacao(0, 0));
		Method decrementaFome = lobo.getClass().getDeclaredMethod("decrementaFome");
		decrementaFome.setAccessible(true);
		for(int i=0; i<7; i++) {
			decrementaFome.invoke(lobo);
		}
		assertFalse(lobo.estaVivo());
	}
	
	@Test
	public void decrementaFome2() throws Exception{
		LoboGuara lobo = new LoboGuara(false, new Campo(3, 3), new Localizacao(0, 0));
		Method decrementaFome = lobo.getClass().getDeclaredMethod("decrementaFome");
		decrementaFome.setAccessible(true);
		for(int i=0; i<6; i++) {
			decrementaFome.invoke(lobo);
		}
		assertTrue(lobo.estaVivo());
	}
	
}
