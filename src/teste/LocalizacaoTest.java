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
	//ok
	@Test
	public void testEqualsNotEquals() {
		Localizacao l = new Localizacao(1,1);
		LoboGuara lo = new LoboGuara(false, new Campo(50,50), l);
		l.equals(lo);
	}
	//ok
	@Test
	public void testEqualsObject() {
		Localizacao obj = new Localizacao(10, 10);
		Localizacao ob1 = new Localizacao(10, 10);
		assertTrue(obj.equals(ob1));
	}
	
	//ok
	@Test
	public void testEqualsObject1() {
		Localizacao obj = new Localizacao(110, 110);
		Localizacao ob1 = new Localizacao(10, 10);
		assertFalse(obj.equals(ob1));
	}
	
	//ok
	@Test (expected= IllegalArgumentException.class)
	public void testEqualsObject2() {
		Localizacao obj = new Localizacao(-1, -1);
		Localizacao ob1 = new Localizacao(-1, -1);
	}
	
	
	
	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------
	//ok
	@Test
	public void testGetLinha() {
		Localizacao obj = new Localizacao(10, 15);
		assertEquals(10, obj.getLinha());
	}
	//ok
	@Test
	public void testGetLinha2() {
		Localizacao obj = new Localizacao(0, 100);
		assertNotEquals(100, obj.getLinha());
	}
	
	//ok
	@Test (expected= IllegalArgumentException.class)
	public void testGetLinha3() {
		Localizacao obj = new Localizacao(0, -100);
		assertEquals(0, obj.getLinha());
	}
	

	
	//--------------------------------------------------------------------------------------------------------------------------------------------
	
	//ok
	@Test
	public void testGetColuna1() {
		Localizacao obj = new Localizacao(10, 15);
		assertEquals(15, obj.getColuna());
	}
	//ok
	@Test (expected= Exception.class)
	public void testGetColuna2() {
		Localizacao obj = new Localizacao(0, -100);
		System.out.println(obj.getColuna());
	}
	//ok
	@Test 
	public void testGetColuna3() {
		Localizacao obj = new Localizacao(0, 100);
		assertEquals(100, obj.getColuna());
	}
	
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
	//ok
	@Test
	public void testHashCode1() {
		Localizacao obj1 = new Localizacao(10, 15);
		Localizacao obj2 = new Localizacao(10, 15);
		assertEquals(obj1.hashCode(), obj2.hashCode());
	}
	
	
	//ok
	@Test
	public void testHashCode2() {
		Localizacao obj1 = new Localizacao(10, 15);
		Localizacao obj2 = new Localizacao(10, 16);
		assertNotEquals(obj1.hashCode(), obj2.hashCode());;
	}
	
	//ok
	@Test
	public void testHashCode3() {
		Localizacao obj1 = new Localizacao(10, 15);
		assertNotEquals(obj1.hashCode(),null);
	}
	
	
	//ok
	@Test (expected= IllegalArgumentException.class)
	public void testHashCode4() {
		Localizacao obj1 = new Localizacao(-110, 15);
		Localizacao obj2 = new Localizacao(-110, 15);
	}
	
	//ok
	@Test (expected= IllegalArgumentException.class)
	public void testHashCode5() {
		Localizacao obj1 = new Localizacao(-1, -1);
	}
	
	
	
	
	
}
