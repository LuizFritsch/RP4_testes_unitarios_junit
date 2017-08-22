package teste;

import static org.junit.Assert.*;
import java.lang.reflect.*;

import java.awt.Color;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JLabel;

import org.junit.Ignore;
import org.junit.Test;

import ol.Campo;
import ol.LoboGuara;
import ol.Localizacao;
import ol.Ovelha;
import ol.Simulador;
import ol.SimuladorTela;

public class SimuladorTelaTest {

	@Test
	public void testSimuladorTela() {
		SimuladorTela s = new SimuladorTela(100, 100);
		assertEquals(s.getTitle(), "Simulacao Ovelhas and Lobos Guara");

	}

	@Test
	public void testSimuladorTela1() {
		SimuladorTela s = new SimuladorTela(100, 100);
		assertNotEquals(null, s);

	}

	/*
	 * Tamanho da janela;
	 */
	@Test
	public void testSimuladorTela2() {
		SimuladorTela s = new SimuladorTela(100, 100);
		assertEquals(s.getX(), 100);

	}

	/*
	 * Tamanho da janela: Não diz onde a janela deve iniciar: Como eu testo isso?
	 * Por q 50, tem alguma especificação sobre isso?
	 */
	@Test
	public void testSimuladorTela3() {
		SimuladorTela s = new SimuladorTela(100, 100);
		assertEquals(s.getY(), 50);

	}

	/*
	 * Testar as dimeções da tela
	 */

	@Test
	public void testSimuladorTela4() {
		SimuladorTela s = new SimuladorTela(1, 1);
		assertEquals(s.getRootPane().getHeight(), 1);

	}

	/*
	 * Testar as dimeções da tela
	 */

	@Test
	public void testSimuladorTela5() {
		SimuladorTela s = new SimuladorTela(780, 1200);
		assertEquals(s.getHeight(), 780);

	}

	@Test
	public void testSimuladorTela6() {
		SimuladorTela s = new SimuladorTela(100, 1953);
		assertTrue(s.isVisible());

	}

	@Test
	public void testSimuladorTela7() {
		SimuladorTela s = new SimuladorTela(999999999, 999999999);

	}

	// ----------------------------------------------------------------------------------------------------------------------------------

	// Erro: Passando null ele adiciona objeto null a lista com a cor Laranja.

	@Test(expected = IllegalArgumentException.class)
	public void testSetCor() {
		SimuladorTela s = new SimuladorTela(1000, 1000);
		s.setCor(null, Color.ORANGE);

	}

	@Test
	public void testSetCor1() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		SimuladorTela s = new SimuladorTela(1000, 1000);
		Ovelha ove = new Ovelha(true, new Campo(1, 1), new Localizacao(0, 0));
		s.setCor(ove.getClass(), Color.ORANGE);
		Field f = SimuladorTela.class.getDeclaredField("cores");
		f.setAccessible(true);
		Map<Class, Color> cor = (Map<Class, Color>) f.get(s);
		assertEquals(f.get(ove.getClass()), Color.ORANGE);

	}

	@Test
	public void testSetCor2() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		SimuladorTela s = new SimuladorTela(10, 10);
		Campo c = new Campo(1000, 1000);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0, 0));
		LoboGuara lobo = new LoboGuara(true, c, new Localizacao(100, 100));

		s.setCor(c.getObjectAt(0, 0).getClass(), Color.ORANGE);
		s.setCor(c.getObjectAt(100, 100).getClass(), Color.BLUE);
		Field f = SimuladorTela.class.getDeclaredField("cores");
		f.setAccessible(true);
		Map<Class, Color> cor = (Map<Class, Color>) f.get(s);
		assertEquals(f.get(ove.getClass()), Color.ORANGE);
		assertEquals(f.get(lobo.getClass()), Color.BLUE);
		

	}

	/*
	 * Erro: Passar uma cor diferente da cor salva para este animal, o metodo não
	 * valida a cor salva, ele atualiza todos para a ultima cor passada pelo
	 * setCor().
	 */
	@Test
	public void testSetCor3() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		SimuladorTela s = new SimuladorTela(10, 10);
		Campo c = new Campo(1000, 1000);
		Ovelha ove = new Ovelha(true, c, new Localizacao(0, 0));
		Ovelha ove1 = new Ovelha(true, c, new Localizacao(170, 199));
		LoboGuara lobo = new LoboGuara(true, c, new Localizacao(100, 100));

		s.setCor(c.getObjectAt(0, 0).getClass(), Color.ORANGE);
		s.setCor(c.getObjectAt(170, 199).getClass(), Color.BLUE);
		s.setCor(c.getObjectAt(100, 100).getClass(), Color.BLUE);


		Field f = SimuladorTela.class.getDeclaredField("cores");
		f.setAccessible(true);
		Map<Class, Color> cor = (Map<Class, Color>) f.get(s);
		assertEquals(f.get(ove.getClass()), Color.BLUE);
		assertEquals(f.get(lobo.getClass()), Color.BLUE);
		
	}

	// ----------------------------------------------------------------------------------------------------------------------------------
	@Test
	public void getCor() throws NoSuchMethodException, SecurityException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		SimuladorTela s = new SimuladorTela(100, 100); 
		Class<?>[] par = {Class.class};
		Method m = SimuladorTela.class.getDeclaredMethod("getCor",par);
		m.setAccessible(true);
		Ovelha ove = new Ovelha(true, new Campo(1, 1), new Localizacao(0, 0));
		s.setCor(ove.getClass(), Color.ORANGE);
		Object ret = m.invoke(s,ove.getClass());		
		assertEquals(ret, Color.ORANGE);		
	}
	
	
	/*
	 * getMethod deve ser alterado para getDeclaredMethod.... e add Nomemehtd.setAccessible(true)
	 */
	
	/*
	 * O map está vazio, então deve retornar a cor Gray ou R = 128, G = 128, B=128;
	 */
	@Test
	public void getCor1() throws NoSuchMethodException, SecurityException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		SimuladorTela s = new SimuladorTela(100, 100); 
		Class<?>[] par = {Class.class};
		Method m = SimuladorTela.class.getDeclaredMethod("getCor",par);
		m.setAccessible(true);
		LoboGuara l = new LoboGuara(true, new Campo(1, 1), new Localizacao(0, 0));
		
		Object ret = m.invoke(s,l.getClass());		
		assertEquals(ret, Color.GRAY);		
	}
	
	
	@Test
	public void getCor2() throws NoSuchMethodException, SecurityException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		SimuladorTela s = new SimuladorTela(100, 100); 
		Class<?>[] par = {Class.class};
		Method m = SimuladorTela.class.getDeclaredMethod("getCor",par);
		m.setAccessible(true);
		LoboGuara l = new LoboGuara(true, new Campo(1, 1), new Localizacao(0, 0));
		s.setCor(l.getClass(), Color.BLUE);
		Object ret = m.invoke(s,l.getClass());		
		assertEquals(ret, Color.BLUE);		
	}
	
	
	

	// ----------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testMostraStatus() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		SimuladorTela s = new SimuladorTela(100, 100);
		Campo c = new Campo(100, 100);
		s.mostraStatus(0, c);
		Field f = SimuladorTela.class.getDeclaredField("rotuloEtapa");
		f.setAccessible(true);
		
		JLabel jl = (JLabel) f.get(s);
		
		assertEquals("Etapa: 0", jl.getText());

	}

	@Test
	public void testMostraStatus1() {
		SimuladorTela s = new SimuladorTela(100, 100);
		Campo c = new Campo(100, 100);
		s.mostraStatus(999999999, c);
		assertEquals("Etapa: 999999999", s.getRotuloEtapa().getText());
	}

	/*
	 * Erro: Passar um numero negativo não acusa erro, mas deveria ser um
	 * IllegalArgumentExeption
	 */
	@Test
	public void testMostraStatus3() {
		SimuladorTela s = new SimuladorTela(100, 100);
		Campo c = new Campo(100, 100);
		s.mostraStatus(-10, c);
		assertEquals("Etapa: -10", s.getRotuloEtapa().getText());
	}

	@Test
	public void testMostraStatus4() {
		SimuladorTela s = new SimuladorTela(100, 100);
		Campo c = new Campo(100, 100);
		s.mostraStatus(1000, c);
		assertEquals(s.getPapulaco().getText(), "Populacao: ");
	}

	// ----------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testEhViavel() {
		SimuladorTela s = new SimuladorTela(1, 1);
		Campo c = new Campo(100, 100);
		assertFalse(s.ehViavel(c));

	}

	/*
	 * Erro: A classe SimuladorTela, tem obrigação de testar o tamnho do campo, se é
	 * maior ou menor q o tamnho da simulação da janela?
	 */
	@Test
	public void testEhViavel1() {
		SimuladorTela s = new SimuladorTela(1, 1);
		Campo c = new Campo(100, 100);
		Localizacao l = new Localizacao(0, 0);
		Localizacao l1 = new Localizacao(0, 1);
		c.lugar(new LoboGuara(true, c, l), l);
		c.lugar(new Ovelha(true, c, l1), l1);
		assertTrue(s.ehViavel(c));

	}

}
