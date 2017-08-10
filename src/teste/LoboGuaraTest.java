package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ol.*;

public class LoboGuaraTest {

	@Test
	public void testLoboGuara() {
		
		Localizacao localizacao = new Localizacao(1, 1);
		Campo campo = new Campo(50,50);
		LoboGuara x = new LoboGuara(true, campo, localizacao);
		
		
		fail("Not yet implemented");
	}

	@Test
	public void testCaca() {
		Localizacao localizacao = new Localizacao(1, 1);
		Campo campo = new Campo(50,50);
		LoboGuara x = new LoboGuara(true, campo, localizacao);
		
	}

	@Test
	public void testEstaVivo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLocalizacao() {
		fail("Not yet implemented");
	}

}
