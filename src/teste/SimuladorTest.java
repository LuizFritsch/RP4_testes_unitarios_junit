package teste;

import org.junit.Test;
import ol.Simulador;
import static org.junit.Assert.*;
public class SimuladorTest {

	
   /*
	*Ao criar um simulador, as dimensoes nao podem ser 0
	*/
	@Test
	public void testSimulador() {
		Simulador simulador = new Simulador(1,1);
	}	
	
	
	
	@Test
	/*
	 * Ao criar um simulador, as dimensoes nao podem ser <= 0,
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
