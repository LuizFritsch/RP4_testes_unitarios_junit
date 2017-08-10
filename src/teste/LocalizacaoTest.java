package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ol.*;

public class LocalizacaoTest {

	@Test
	public void testHashCode() {
		Localizacao obj = new Localizacao(10, 10);
		System.err.println(obj.hashCode());
	}

	@Test
	public void testLocalizacao() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		Localizacao obj = new Localizacao(10, 10);
		Localizacao ob1 = new Localizacao(10, 10);
		assertTrue(obj.equals(ob1));
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLinha() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetColuna() {
		fail("Not yet implemented");
	}

}
