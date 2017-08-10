package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ol.*;

public class LocalizacaoTest {


	@Test
	public void testLocalizacao() {
		
	}

	@Test
	public void testEqualsObject() {
		Localizacao obj = new Localizacao(10, 10);
		Localizacao ob1 = new Localizacao(10, 10);
		assertTrue(obj.equals(ob1));
	}

	@Test
	public void testGetLinha() {
		Localizacao obj = new Localizacao(10, 15);
		assertEquals(10, obj.getLinha());
	}

	@Test
	public void testGetColuna() {
		Localizacao obj = new Localizacao(10, 15);
		assertEquals(15, obj.getColuna());
	}
	
	@Test
	public void testHashCode1() {
		Localizacao obj1 = new Localizacao(10, 15);
		Localizacao obj2 = new Localizacao(10, 15);
		assertEquals(obj1, obj2);
	}
	
	@Test
	public void testHashCode2() {
		Localizacao obj1 = new Localizacao(10, 15);
		Localizacao obj2 = new Localizacao(10, 16);
		assertNotEquals(obj1, obj2);;
	}
	
	
	
}
