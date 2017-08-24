package ol;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AnimalTest {
	
	@Test
	public void estaVivoTest01() {
		Campo x = new Campo(50,50);
		Localizacao l = new Localizacao(25,25);
		Animal animalTest = new Ovelha(false, x, l);
		assertTrue(animalTest.estaVivo());
	}
	
	@Test
	public void estaVivoTest02() {
		Campo x = new Campo(50,50);
		Localizacao l = new Localizacao(25,25);
		Animal animalTest = new Ovelha(true, x, l);
		assertTrue(animalTest.estaVivo());
	}
	
	@Test
	public void getLocalizacaoTeste01() {
		Campo x = new Campo(50,50);
		Localizacao l = new Localizacao(25,25);
		Animal animalTest = new Ovelha(true, x, l);
		assertEquals(animalTest.getLocalizacao(), l);
	}
	
	@Test
	public void getLocalizacaoTeste02() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(25,25);
		Localizacao l2 = new Localizacao(26,26);
		Animal animalTest = new Ovelha(true, x, l1);
		assertNotEquals(animalTest.getLocalizacao(), l2);
	}
	
	@Test
	public void setLocalizacaoTeste01() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(25,25);
		Localizacao l2 = new Localizacao(26,26);
		Animal animalTest = new Ovelha(true, x, l1);
		animalTest.setLocalizacao(l2);
		assertEquals(animalTest.getLocalizacao(), l2);
	}
	@Test
	public void setLocalizacaoTeste02() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(25,25);
		Localizacao l2 = new Localizacao(26,26);
		Animal animalTest1 = new Ovelha(true, x, l1);
		Animal animalTest2 = new Ovelha(true, x, l1);
		animalTest1.setLocalizacao(l2);
		assertNotEquals(animalTest1.getLocalizacao(), l1);
		assertEquals(animalTest2.getLocalizacao(), l1);
	}
	
	@Test
	public void setLocalizacaoTeste03() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(25,25);
		Localizacao l2 = new Localizacao(26,26);
		Animal animalTest1 = new Ovelha(true, x, l1);
		Animal animalTest2 = new Ovelha(true, x, l1);
		animalTest1.setLocalizacao(l2);
		assertNotEquals(x.getObjectAt(25, 25), animalTest2);
	}
	
	
	@Test (expected= IllegalArgumentException.class)
	public void animalConstruct01() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(51,51);
		Animal animalTest = new Ovelha(true, x, l1);

	}
	
	@Test (expected= IllegalArgumentException.class)
	public void animalConstruct02() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(0,-1);
		Animal animalTest = new Ovelha(true, x, l1);

	}

	@Test (expected= IllegalArgumentException.class)
	public void animalConstruct03() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(50,50);
		Animal animalTest = new Ovelha(true, x, l1);

	}
	
	@Test 
	public void setMorteTest01() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(49,49);
		Animal animalTest = new Ovelha(true, x, l1);
		animalTest.setMorte();
		assertFalse(animalTest.estaVivo());

	}
	
	@Test 
	public void setMorteTest02() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(49,49);
		Animal animalTest = new Ovelha(true, x, l1);
		animalTest.setMorte();
		assertNull(x.getObjectAt(l1));

	}
}
