package teste;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import ol.*;

public class LocalizacaoTest {

	@Ignore
	@Test
	public void testLocalizacao() {
		
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testEqualsObject() {
		Localizacao obj = new Localizacao(10, 10);
		Localizacao ob1 = new Localizacao(10, 10);
		assertTrue(obj.equals(ob1));
	}
	
	
	@Test
	public void testEqualsObject1() {
		Localizacao obj = new Localizacao(110, 110);
		Localizacao ob1 = new Localizacao(10, 10);
		assertFalse(obj.equals(ob1));
	}
	
	
	@Test (expected= IllegalArgumentException.class)
	public void testEqualsObject2() {
		Localizacao obj = new Localizacao(-1, -1);
		Localizacao ob1 = new Localizacao(-1, -1);
	}
	
	
	
	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testGetLinha() {
		Localizacao obj = new Localizacao(10, 15);
		assertEquals(10, obj.getLinha());
	}
	
	@Test
	public void testGetLinha2() {
		Localizacao obj = new Localizacao(0, 100);
		assertNotEquals(100, obj.getLinha());
	}
	
	
	@Test (expected= IllegalArgumentException.class)
	public void testGetLinha3() {
		Localizacao obj = new Localizacao(0, -100);
		assertEquals(0, obj.getLinha());
	}
	

	
	//--------------------------------------------------------------------------------------------------------------------------------------------
	
	
	@Test
	public void testGetColuna() {
		Localizacao obj = new Localizacao(10, 15);
		assertEquals(15, obj.getColuna());
	}
	
	@Test
	public void testGetColuna2() {
		Localizacao obj = new Localizacao(10, 15);
		assertNotEquals(10, obj.getColuna());
	}
	
	@Test (expected= Exception.class)
	public void testGetColuna3() {
		Localizacao obj = new Localizacao(0, -100);
		System.out.println(obj.getColuna());
	}
	
	@Test (expected= Exception.class)
	public void testGetColuna5() {
		Localizacao obj = new Localizacao(0, -100);
		assertEquals(null, obj.getColuna());
	}
	
	
	
	
	@Test 
	public void testGetColuna4() {
		Localizacao obj = new Localizacao(0, 100);
		assertEquals(100, obj.getColuna());
	}
	
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test
	public void testHashCode1() {
		Localizacao obj1 = new Localizacao(10, 15);
		Localizacao obj2 = new Localizacao(10, 15);
		assertEquals(obj1.hashCode(), obj2.hashCode());
	}
	
	
	
	@Test
	public void testHashCode2() {
		Localizacao obj1 = new Localizacao(10, 15);
		Localizacao obj2 = new Localizacao(10, 16);
		assertNotEquals(obj1.hashCode(), obj2.hashCode());;
	}
	

	@Test
	public void testHashCode3() {
		Localizacao obj1 = new Localizacao(10, 15);
		assertNotEquals(obj1.hashCode(),null);
	}
	
	

	@Test (expected= IllegalArgumentException.class)
	public void testHashCode4() {
		Localizacao obj1 = new Localizacao(-110, 15);
		Localizacao obj2 = new Localizacao(-110, 15);
	}
	
	
	@Test (expected= IllegalArgumentException.class)
	public void testHashCode5() {
		Localizacao obj1 = new Localizacao(-1, -1);
	}
	
	
	
	
	
}
