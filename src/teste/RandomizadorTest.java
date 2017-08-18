package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;

import ol.Randomizador;

public class RandomizadorTest {

	
	@Test
	public void testGetRandom() {
		Random rand = Randomizador.getRandom();
		int random = rand.nextInt(1);
		assertTrue(random == 0);
	}
	/*
	 * Verificando se gera nmrs iguais
	 */
	@Test
	public void testGetRandomIguais() {
		Random rand = Randomizador.getRandom();
		ArrayList<Integer> primeiro = new ArrayList<Integer>();
		ArrayList<Integer> segundo= new ArrayList<Integer>();
		int i = 0;
		while (i < 11) {
			primeiro.add(rand.nextInt(100));
			i++;
		}
		int j = 0;
		while (j < 11) {
			segundo.add(rand.nextInt(100));
			j++;
		}
		int eIgual = 0;
		for (int k = 0; k < 11; k++) {
			System.out.println("em "+ k + " da primeira lista" + primeiro.get(k));
			System.out.println("em "+ k + " da segunda lista" + segundo.get(k));
			if (primeiro.get(k) == segundo.get(k)) {
				eIgual++;
			}
		}
		System.out.println(eIgual);
		assertNotEquals(10, eIgual);
	}

	@Ignore
	@Test
	public void testReset() {
		//assertTrue(true);
	}

}
