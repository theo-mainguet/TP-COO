import static org.junit.Assert.*;

import org.junit.Test;

import digisim.*;

public class testOr2 {
	@Test
	public void testTrouTrou() {
		Or2 and = new Or2(Fixe.TRUE, Fixe.TRUE);
		assertTrue(and.valeur()) ;
	}
	@Test
	public void testTrouPlein() {
		Or2 and = new Or2(Fixe.TRUE, Fixe.FALSE);
		assertTrue(and.valeur()) ;
	}

	@Test
	public void testPleinTrou() {
		Or2 and = new Or2(Fixe.FALSE, Fixe.TRUE);
		assertTrue(and.valeur()) ;
	}

	@Test
	public void testPleinPlein() {
		Or2 and = new Or2(Fixe.FALSE, Fixe.FALSE);
		assertFalse(and.valeur()) ;
	}
}
