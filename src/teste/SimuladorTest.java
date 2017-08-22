package teste;
import java.lang.reflect.*;
import org.junit.Test;
import ol.Simulador;
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
	
	@Test
	public void testPovoa() {
		Class c = Class.forName("src/ol/Simulador");
		Simulador s = (Simulador) c.newInstance();
		
		Method m = c.getDeclaredMethod("povoa", null);
		m.setAccessible(true);
		m.invoke(s, null);
		
	}
	
	

}
