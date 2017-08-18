package teste;

import org.junit.Test;
import ol.Simulador;

public class SimuladorTest {

	
	@Test(expected= IllegalArgumentException.class)
	/*
	 * Ao criar um simulador, as dimensoes nao podem ser 0,
	 *  mas ele está aceitando e não está tratando
	 */
	public void testSimulador() {
		Simulador simulador = new Simulador(0,0);
	}	
	
	@Test(expected = Exception.class)
	/*
	 * Ao criar um simulador, as dimensoes nao podem ser < 0,
	 */
	public void testSimuladorNegativo() {
		Simulador simulador = new Simulador(-1,-1);
	}	
	
	@Test(expected = Exception.class)
	/*
	 *Ao fazer cast, nenhuma exceção é tratada
	 */
	public void testSimulacaoUmaEtapa() {
		Simulador simulador = new Simulador();
		simulador.executaLongaSimulacao();
	}

}
