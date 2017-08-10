package teste;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ol.Campo;
import ol.LoboGuara;
import ol.Localizacao;

public class LoboGuaraTest {

	@Test
	public void testLoboGuara() {
		
		Localizacao localizacao = new Localizacao(1, 1);
		Campo campo = new Campo(50,50);
		LoboGuara x = new LoboGuara(true, campo, localizacao);
		
		
		fail("Not yet implemented");
	}

	@Test
	public void testCaca(){
		Localizacao localizacao1 = new Localizacao(1, 1);
		Localizacao localizacao2 = new Localizacao(1, 2);
		Localizacao localizacao3 = new Localizacao(1, 3);
		Campo campo = new Campo(50,50);
		LoboGuara l1 = new LoboGuara(false, campo, localizacao1);
		LoboGuara l2 = new LoboGuara(false, campo, localizacao2);
		LoboGuara l3 = new LoboGuara(false, campo, localizacao3);
		List<LoboGuara> x = new ArrayList();
		x.add(l1);
		x.add(l2);
		x.add(l3);
		int y=0;
		while(y < 300) {
			l1.caca(x);
		}
		assertFalse(l1.estaVivo());
		 
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
