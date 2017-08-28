package teste;

import static org.junit.Assert.*;
import java.lang.reflect.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayoutInfo;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.GrayFilter;
import javax.swing.JLabel;
import javax.xml.transform.SourceLocator;

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
	 * Tamanho da janela: Nï¿½o diz onde a janela deve iniciar: Como eu testo isso?
	 * Por q 50, tem alguma especificaï¿½ï¿½o sobre isso?
	 */
	@Test
	public void testSimuladorTela3() {
		SimuladorTela s = new SimuladorTela(100, 100);
		assertEquals(s.getY(), 50);

	}

	/*
	 * Testar as dimeï¿½ï¿½es da tela
	 */
	
	@Ignore
	@Test
	public void testSimuladorTela4() {
		SimuladorTela s = new SimuladorTela(1, 1);
		assertEquals(s.getRootPane().getHeight(), 1);

	}

	/*
	 * Testar as dimeï¿½ï¿½es da tela
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

	@Test(expected = NullPointerException.class)
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
		assertEquals(cor.get(ove.getClass()), Color.ORANGE);

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
		assertEquals(cor.get(ove.getClass()), Color.ORANGE);
		assertEquals(cor.get(lobo.getClass()), Color.BLUE);
		

	}

	/*
	 * Erro: Passar uma cor diferente da cor salva para este animal, o metodo nï¿½o
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
		assertEquals(cor.get(ove.getClass()), Color.BLUE);
		assertEquals(cor.get(lobo.getClass()), Color.BLUE);
		
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
	 * O map estï¿½ vazio, entï¿½o deve retornar a cor Gray ou R = 128, G = 128, B=128;
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
	public void testMostraStatus1() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		SimuladorTela s = new SimuladorTela(100, 100);
		Campo c = new Campo(100, 100);
		s.mostraStatus(999999999, c);
		Field f = SimuladorTela.class.getDeclaredField("rotuloEtapa");
		f.setAccessible(true);
		
		JLabel jl = (JLabel) f.get(s);
		assertEquals("Etapa: 999999999", jl.getText());
	}

	/*
	 * Erro: Passar um numero negativo nï¿½o acusa erro, mas deveria ser um
	 * IllegalArgumentExeption
	 */
	@Test
	public void testMostraStatus3() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		SimuladorTela s = new SimuladorTela(100, 100);
		Campo c = new Campo(100, 100);
		s.mostraStatus(-10, c);
		
		Field f = SimuladorTela.class.getDeclaredField("rotuloEtapa");
		f.setAccessible(true);
		
		JLabel jl = (JLabel) f.get(s);
		assertEquals("Etapa: -10", jl.getText());
	}

	@Test
	public void testMostraStatus4() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		SimuladorTela s = new SimuladorTela(100, 100);
		Campo c = new Campo(100, 100);
		s.mostraStatus(1000, c);
		Field f = SimuladorTela.class.getDeclaredField("populacao");
		f.setAccessible(true);
		
		JLabel jl = (JLabel) f.get(s);
		assertEquals(jl.getText(), "Populacao: ");
	}

	// ----------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testEhViavel() {
		SimuladorTela s = new SimuladorTela(1, 1);
		Campo c = new Campo(100, 100);
		assertFalse(s.ehViavel(c));

	}

	/*
	 * Erro: A classe SimuladorTela, tem obrigaï¿½ï¿½o de testar o tamnho do campo, se ï¿½
	 * maior ou menor q o tamnho da simulaï¿½ï¿½o da janela?
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
	
	
	//---------------------------------------------------------------------------------------------------------------------------------
	
	
	@Test
	public void testVisaoCampo() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		/*
		 * Inicio
		 */
		SimuladorTela s = new SimuladorTela(1000, 1000);
		Class<?> visaoCampo = Class.forName("ol.SimuladorTela$VisaoCampo");
	
		Constructor<?> cons = visaoCampo.getConstructor(SimuladorTela.class, int.class, int.class);
		cons.setAccessible(true);
		
		
		Class<?> vCampo = cons.newInstance(s, 1000,1000).getClass();
		/*
		 * Parte padrï¿½o do teste:  Agora muda apenas field e metodos:
		 * 
		 */
		Field largura = vCampo.getDeclaredField("gridWidth");
		largura.setAccessible(true);
		
		assertEquals(1000, largura.get(cons.newInstance(s, 900,1000)));
	}
	
	

	@Test
	public void testVisaoCampo1() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		SimuladorTela s = new SimuladorTela(1000, 1000);
		Class<?> visaoCampo = Class.forName("ol.SimuladorTela$VisaoCampo");
	
		Constructor<?> cons = visaoCampo.getConstructor(SimuladorTela.class, int.class, int.class);
		cons.setAccessible(true);
		
		
		Class<?> vCampo = cons.newInstance(s, 1000,1000).getClass();
		Field altura = vCampo.getDeclaredField("gridHeight");
		altura.setAccessible(true);
		
		assertEquals(1000, altura.get(cons.newInstance(s, 1000,900)));
	}
	
	
	@Test
	public void testVisaoCampo2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		SimuladorTela s = new SimuladorTela(1000, 1000);
		Class<?> visaoCampo = Class.forName("ol.SimuladorTela$VisaoCampo");
	
		Constructor<?> cons = visaoCampo.getConstructor(SimuladorTela.class, int.class, int.class);
		cons.setAccessible(true);
		
		
		Class<?> vCampo = cons.newInstance(s, 0,0).getClass();
		Field altura = vCampo.getDeclaredField("gridHeight");
		altura.setAccessible(true);
		
		Field largura = vCampo.getDeclaredField("gridWidth");
		largura.setAccessible(true);
		
		assertEquals(0, largura.get(cons.newInstance(s, 900,0)));		
		assertEquals(0, altura.get(cons.newInstance(s, 0,900)));
	}
	
	
	
	/*
	 * Erro:? O cosntrutor aceita valores negativos... Embora campo, e alguns outros nï¿½o devam aceitar... verificar os documentos.
	 */

	@Test
	public void testVisaoCampo3() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		SimuladorTela s = new SimuladorTela(1000, 1000);
		Class<?> visaoCampo = Class.forName("ol.SimuladorTela$VisaoCampo");
	
		Constructor<?> cons = visaoCampo.getConstructor(SimuladorTela.class, int.class, int.class);
		cons.setAccessible(true);
		
		
		Class<?> vCampo = cons.newInstance(s, -100,-100).getClass();
		Field altura = vCampo.getDeclaredField("gridHeight");
		altura.setAccessible(true);
		
		Field largura = vCampo.getDeclaredField("gridWidth");
		largura.setAccessible(true);
		
		assertEquals(-100, largura.get(cons.newInstance(s, -100,-100)));		
		assertEquals(-100, altura.get(cons.newInstance(s, -100,-100)));
	}
	
	
	@Test
	public void testVisaoCampo4() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		SimuladorTela s = new SimuladorTela(1000, 1000);
		Class<?> visaoCampo = Class.forName("ol.SimuladorTela$VisaoCampo");
	
		Constructor<?> cons = visaoCampo.getConstructor(SimuladorTela.class, int.class, int.class);
		cons.setAccessible(true);
		
		
		Class<?> vCampo = cons.newInstance(s, 0,0).getClass();
		Field altura = vCampo.getDeclaredField("gridHeight");
		altura.setAccessible(true);
		
		Field largura = vCampo.getDeclaredField("gridWidth");
		largura.setAccessible(true);
		
		assertEquals(0, largura.get(cons.newInstance(s, 900,0)));		
		assertEquals(0, altura.get(cons.newInstance(s, 0,900)));
	}
	
	
	
	
	/*
	 * Olha o tributo GRID_VIEW_SCALING_FACTOR se retorna seu valor = 6, quando cria o objeto.
	 */
	
	@Test
	public void testVisaoCampo5() throws ClassNotFoundException, NoSuchMethodException, 
	SecurityException, InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		SimuladorTela s = new SimuladorTela(100, 100);
		Class<?> visaoCampo = Class.forName("ol.SimuladorTela$VisaoCampo");
	
		Constructor<?> cons = visaoCampo.getConstructor(SimuladorTela.class, int.class, int.class);
		cons.setAccessible(true);		
		
		Class<?> vCampo = cons.newInstance(s,100,100).getClass();
		Method m = vCampo.getDeclaredMethod("preparePaint");
		m.setAccessible(true);
		m.invoke(cons.newInstance(s,100,100));
		
		Field f = vCampo.getDeclaredField("GRID_VIEW_SCALING_FACTOR");
		f.setAccessible(true);
		
		int xsc = (Integer) f.get(cons.newInstance(s,100,100));
		assertEquals(xsc, 6);
		
	}
	
	@Ignore
	@Test
	public void testVisaoCampo6() throws ClassNotFoundException, NoSuchMethodException, 
	SecurityException, InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		SimuladorTela simuladorObject = new SimuladorTela(10, 310);
		
		Class<SimuladorTela> simuladorClass = SimuladorTela.class;
		
		/*
		 * Pega pelo atributo da classe interna. Passa um type pelo tipo do atributo.
		 */
		Field attributeCampo = simuladorClass.getDeclaredField("visaoCampo");
		attributeCampo.setAccessible(true);
		
		Class<?> visaoCampoClass = Class.forName("ol.SimuladorTela$VisaoCampo");
		visaoCampoClass = attributeCampo.getType();
		
		Method method = visaoCampoClass.getDeclaredMethod("preparePaint");
		method.setAccessible(true);
		method.invoke(attributeCampo.get(simuladorObject));
			
		Field attributeXScale = visaoCampoClass.getDeclaredField("xScale");
		attributeXScale.setAccessible(true);
		
		assertEquals(6, attributeXScale.get(attributeCampo.get(simuladorObject)));
		
		
		
	}	
	
	
	
	@Test
	public void testVisaoCampo7() throws ClassNotFoundException, NoSuchMethodException, 
	SecurityException, InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		SimuladorTela simuladorObject = new SimuladorTela(10, 100);
		
		Class<SimuladorTela> simuladorClass = SimuladorTela.class;
		
		/*
		 * Pega pelo atributo da classe interna. Passa um type pelo tipo do atributo.
		 */
		Field attributeCampo = simuladorClass.getDeclaredField("visaoCampo");
		attributeCampo.setAccessible(true);
	
		Class<?> visaoCampoClass = Class.forName("ol.SimuladorTela$VisaoCampo");
		visaoCampoClass = attributeCampo.getType();
		
		Method method = visaoCampoClass.getDeclaredMethod("preparePaint");
		method.setAccessible(true);
		method.invoke(attributeCampo.get(simuladorObject));
			
		Field attributeXScale = visaoCampoClass.getDeclaredField("xScale");
		attributeXScale.setAccessible(true);
		
		assertEquals(6, attributeXScale.get(attributeCampo.get(simuladorObject)));
		
	}	
	
	
	@Test
	public void testVisaoCampo8() throws ClassNotFoundException, NoSuchMethodException, 
	SecurityException, InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		SimuladorTela simuladorObject = new SimuladorTela(100, 10);
		
		Class<SimuladorTela> simuladorClass = SimuladorTela.class;
		
		/*
		 * Pega pelo atributo da classe interna. Passa um type pelo tipo do atributo.
		 */
		Field attributeCampo = simuladorClass.getDeclaredField("visaoCampo");
		attributeCampo.setAccessible(true);
		
		Class<?> visaoCampoClass = Class.forName("ol.SimuladorTela$VisaoCampo");
		visaoCampoClass = attributeCampo.getType();
		
		Method method = visaoCampoClass.getDeclaredMethod("getPreferredSize");
		method.setAccessible(true);
		Object o = method.invoke(attributeCampo.get(simuladorObject));
			
		Dimension dimensionO = (Dimension) o;
		
	   /*
	    * Dimension(Wigth, Height).... O campo (Height, Wigth)... então tem que inverter 
	    */
		
		assertTrue(600== dimensionO.getHeight());
		assertTrue(60==dimensionO.getWidth());
		
	}	
	
	
	
	@Test
	public void testVisaoCampo9() throws ClassNotFoundException, NoSuchMethodException, 
	SecurityException, InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		SimuladorTela simuladorObject = new SimuladorTela(100, 100);
		
		Class<SimuladorTela> simuladorClass = SimuladorTela.class;
		
		/*
		 * Pega pelo atributo da classe interna. Passa um type pelo tipo do atributo.
		 */
		Field attributeCampo = simuladorClass.getDeclaredField("visaoCampo");
		attributeCampo.setAccessible(true);
		
		Class<?> visaoCampoClass = Class.forName("ol.SimuladorTela$VisaoCampo");
		visaoCampoClass = attributeCampo.getType();
		
		
		Method method = visaoCampoClass.getDeclaredMethod("preparePaint");
		method.setAccessible(true);
		method.invoke(attributeCampo.get(simuladorObject));
		
		
		Method methodD = visaoCampoClass.getDeclaredMethod("drawMark", int.class,int.class, Color.class);
		methodD.setAccessible(true);
		methodD.invoke(attributeCampo.get(simuladorObject), 1, 1, Color.BLUE);
	
		Class attributeG = visaoCampoClass.forName("g");
		
		System.out.println(attributeG.getName());
		//Graphics grafico = (Graphics) attributeG.get(simuladorObject);
		assertEquals(Color.BLUE,attributeG);
	}	
	
	
	
	
	
	
}
