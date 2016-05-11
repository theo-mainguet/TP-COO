import static org.junit.Assert.*;

import org.junit.Test;

import digisim.*;

public class testXor2 {
	@Test
	public void testTrouTrou() {
		Xor2 and = new Xor2(Fixe.TRUE, Fixe.TRUE);
		assertFalse(and.valeur()) ;
	}
	@Test
	public void testTrouPlein() {
		Xor2 and = new Xor2(Fixe.TRUE, Fixe.FALSE);
		assertTrue(and.valeur()) ;
	}

	@Test
	public void testPleinTrou() {
		Xor2 and = new Xor2(Fixe.FALSE, Fixe.TRUE);
		assertTrue(and.valeur()) ;
	}

	@Test
	public void testPleinPlein() {
		Xor2 and = new Xor2(Fixe.FALSE, Fixe.FALSE);
		assertFalse(and.valeur()) ;
	}
}
