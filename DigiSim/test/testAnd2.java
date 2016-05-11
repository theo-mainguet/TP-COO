import static org.junit.Assert.*;

import org.junit.Test;

import digisim.*;

public class testAnd2 {
	@Test
	public void testTrouTrou() {
	And2 and = new And2(Fixe.TRUE, Fixe.TRUE);
	assertTrue(and.valeur()) ;
	}
	
	@Test
	public void testTrouPlein() {
	And2 and = new And2(Fixe.TRUE, Fixe.FALSE);
	assertFalse(and.valeur()) ;
	}
	
	@Test
	public void testPleinTrou() {
	And2 and = new And2(Fixe.FALSE, Fixe.TRUE);
	assertFalse(and.valeur()) ;
	}
	
	@Test
	public void testPleinPlein() {
	And2 and = new And2(Fixe.FALSE, Fixe.FALSE);
	assertFalse(and.valeur()) ;
	}
}
