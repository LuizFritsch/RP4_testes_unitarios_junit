package ol;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AnimalTest {
	//ok
	@Test
	public void estaVivoTest01() {
		Campo x = new Campo(50,50);
		Localizacao l = new Localizacao(25,25);
		Animal animalTest = new Ovelha(false, x, l);
		assertTrue(animalTest.estaVivo());
	}
	//ok
	@Test
	public void estaVivoTest02() {
		Campo x = new Campo(50,50);
		Localizacao l = new Localizacao(25,25);
		Animal animalTest = new Ovelha(true, x, l);
		assertTrue(animalTest.estaVivo());
	}
	//ok
	@Test
	public void getLocalizacaoTeste01() {
		Campo x = new Campo(50,50);
		Localizacao l = new Localizacao(25,25);
		Animal animalTest = new Ovelha(true, x, l);
		assertEquals(animalTest.getLocalizacao(), l);
	}
	//ok
	@Test
	public void getLocalizacaoTeste02() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(25,25);
		Localizacao l2 = new Localizacao(26,26);
		Animal animalTest = new Ovelha(true, x, l1);
		assertNotEquals(animalTest.getLocalizacao(), l2);
	}
	//ok
	@Test
	public void setLocalizacaoTeste01() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(25,25);
		Localizacao l2 = new Localizacao(26,26);
		Animal animalTest = new Ovelha(true, x, l1);
		animalTest.setLocalizacao(l2);
		assertEquals(animalTest.getLocalizacao(), l2);
	}
	//ok
	@Test (expected=IllegalArgumentException.class)
	public void setLocalizacaoTeste02() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(25,25);
		Localizacao l2 = new Localizacao(26,26);
		Animal animalTest1 = new Ovelha(true, x, l1);
		Animal animalTest2 = new Ovelha(true, x, l1);
		
	}
	//ok
	@Test (expected=IllegalArgumentException.class)
	public void setLocalizacaoTeste03() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(25,25);
		Localizacao l2 = new Localizacao(26,26);
		Animal animalTest1 = new Ovelha(true, x, l1);
		Animal animalTest2 = new Ovelha(true, x, l1);
		
	}
	
	//ok
	@Test (expected= IllegalArgumentException.class)
	public void animalConstruct01() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(51,51);
		Animal animalTest = new Ovelha(true, x, l1);

	}
	//ok
	@Test (expected= IllegalArgumentException.class)
	public void animalConstruct02() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(0,-1);
		Animal animalTest = new Ovelha(true, x, l1);

	}
	//ok
	@Test (expected= IllegalArgumentException.class)
	public void animalConstruct03() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(50,50);
		Animal animalTest = new Ovelha(true, x, l1);

	}
	//ok
	@Test 
	public void setMorteTest01() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(49,49);
		Animal animalTest = new Ovelha(true, x, l1);
		animalTest.setMorte();
		assertFalse(animalTest.estaVivo());

	}
	//ok
	@Test 
	public void setMorteTest02() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(49,49);
		Animal animalTest = new Ovelha(true, x, l1);
		animalTest.setMorte();
		assertNull(x.getObjectAt(l1));

	}
	//ok
	@Test (expected=IllegalArgumentException.class)
	public void setMorteTest03() {
		Campo x = new Campo(50,50);
		Localizacao l1 = new Localizacao(49,49);
		Localizacao l2 = new Localizacao(48,48);
		Animal animalTest1 = new Ovelha(true, x, l1);
		Animal animalTest2 = new Ovelha(true, x, l1);
		

	}
}
