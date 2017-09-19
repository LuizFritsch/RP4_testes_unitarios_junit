package teste;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;

import ol.Randomizador;

public class RandomizadorTest {
	
	/*
	 * Testar se ele está gerando Double na faixa de valor pretendida
	 */
	
	@Test
	public void testGetDouble() {
		Random rand = Randomizador.getRandom();
		double random = rand.nextDouble();
		assertTrue(random>0 && random<1);
	}
	
	/*
	 * Testar se ele está gerando inteiros na faixa de valor pretendida
	 */
	@Test
	public void testGetInt() {
		Random rand = Randomizador.getRandom();
		double random = rand.nextInt(100);
		assertTrue(random>=0 && random<100);
	}
	
	/*
	 * Teste de gerar inteiro de 1 nmr só, que deve gerar obrigatoriamente 0
	 */
	@Test
	public void testGetRandom() {
		Random rand = Randomizador.getRandom();
		int random = rand.nextInt(1);
		assertTrue(random == 0);
	}
	
	@Test
	public void testGetName() {
		Random rand = Randomizador.getRandom();
		long i = rand.nextLong();
		assertNotNull(i);
	}
	
	@Ignore
	@Test
	public void testConstrutor2() throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalArgumentException {
		Class<?> p = Class.forName("ol.Randomizador");
		Constructor<?> ransd = p.getConstructor();
		Class i = ransd.newInstance().getClass();
		assertNotNull(i);
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
			primeiro.add(rand.nextInt(2147483647));
			i++;
		}
		int j = 0;
		Random rando = Randomizador.getRandom();
		while (j < 11) {
			segundo.add(rando.nextInt(2147483647));
			j++;
		}
		int eIgual = 0;
		for (int k = 0; k < 11; k++) {
			if (primeiro.get(k) == segundo.get(k)) {
				eIgual++;
			}
		}
		assertNotEquals(10, eIgual);
	}	
	
	@Test
	public void testConstrutor() {
		Random rand = Randomizador.getRandom();
		assertNotNull(rand);
	}

	@Test
	public void testReset() {
		Random rand = Randomizador.getRandom();
		int i = rand.nextInt();
		Randomizador.reset();
		int j = rand.nextInt();
		assertNotEquals(i, j);
	}
	@Test
	public void testResetVarios() {
		Random rand = Randomizador.getRandom();
		ArrayList<Integer> primeiro = new ArrayList<Integer>();
		ArrayList<Integer> segundo= new ArrayList<Integer>();
		int i = 0;
		while (i < 100) {
			primeiro.add(rand.nextInt(2147483647));
			i++;
		}
		int j = 0;
		
		Randomizador.reset();
		
		while (j < 100) {
			segundo.add(rand.nextInt(2147483647));
			j++;
		}
		int eIgual = 0;
		for (int k = 0; k < 100; k++) {
			if (primeiro.get(k) == segundo.get(k)) {
				eIgual++;
			}
		}
		
		assertNotEquals(100, eIgual);
	}
	
	@Test
	public void testResetVarios2() {
		Random rand = Randomizador.getRandom();
		ArrayList<Integer> primeiro = new ArrayList<Integer>();
		ArrayList<Integer> segundo= new ArrayList<Integer>();
		int i = 0;
		while (i < 1000) {
			primeiro.add(rand.nextInt(2147483647));
			i++;
		}
		int j = 0;
		
		Randomizador.reset();
		
		while (j < 1000) {
			segundo.add(rand.nextInt(2147483647));
			j++;
		}
		int eIgual = 0;
		for (int k = 0; k < 1000; k++) {
			if (primeiro.get(k) == segundo.get(k)) {
				eIgual++;
			}
		}
		
		assertNotEquals(1000, eIgual);
	}
	
	

}
