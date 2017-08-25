package teste;

import java.awt.List;
import java.lang.reflect.*;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import ol.Ovelha;
import ol.Simulador;

public class SimuladorTest {

	/*
	 * Ao criar um simulador, as dimensoes nao podem ser 0
	 */
	@Test
	public void testSimulador() {
		Simulador simulador = new Simulador(1, 1);
	}

	@Test
	/*
	 * Ao criar um simulador, as dimensoes nao podem ser <= 0,
	 */
	public void testSimuladorNegativo() {
		Simulador simulador = new Simulador(-1, -1);
	}

	@Test(expected = Exception.class)
	/*
	 * Ao fazer cast, nenhuma exceção é tratada
	 */
	public void testSimulacaoUmaEtapa() {
		Simulador simulador = new Simulador();
		simulador.executaLongaSimulacao();
	}
	

	@Test
	public void testPovoa() throws Exception {
		Class<?> c = Class.forName("ol.Simulador");
		Simulador s = (Simulador) c.newInstance();

		Method m = c.getDeclaredMethod("povoa");
		m.setAccessible(true);
		m.invoke(s);
		Simulador sim = new Simulador(1,1);
		

	}

	@Test
	public void simula() {
		Simulador s = new Simulador(9999, 9999);
		s.executaLongaSimulacao();		
	}

}
