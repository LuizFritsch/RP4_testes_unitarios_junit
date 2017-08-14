package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;

import ol.Randomizador;

public class RandomizadorTest {
	@Ignore
	@Test
	public void testGetRandom() {
		Random r1 = Randomizador.getRandom();
		Random r2 = Randomizador.getRandom();
		ArrayList<Double> x1 = new ArrayList();
		ArrayList<Double> x2 = new ArrayList();
		for(int x = 0; x<100; x++) {
			x1.add(r1.nextDouble());
		}
		for(int x = 0; x<100; x++) {
			x2.add(r2.nextDouble());
		}
		for(int x = 0; x<100; x++) {
			System.out.println(x1.get(x));
			System.out.println(x2.get(x));
		}
		
		assertArrayEquals(x1.toArray(), x2.toArray());
	}

	@Ignore
	@Test
	public void testReset() {
		fail("Not yet implemented");
	}

}
