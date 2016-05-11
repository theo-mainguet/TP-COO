import static org.junit.Assert.*;

import org.junit.Test;

import digisim.And2;
import digisim.AndN;
import digisim.Fixe;

public class testAndN {
	@Test
	public void testTrouTrou() {
	AndN and = new AndN(5);
	for (int i = 0; i < 5; i++) {
		and.getEntree(i).connectTo(Fixe.TRUE);
	}
	assertTrue(and.valeur()) ;
	}
	@Test
	public void testTrouPlein() {
	AndN and = new AndN(3);
	and.getEntree(0).connectTo(Fixe.TRUE);
	and.getEntree(1).connectTo(Fixe.TRUE);
	and.getEntree(2).connectTo(Fixe.FALSE);
	assertFalse(and.valeur()) ;
	}
	@Test
	public void testPlein() {
	AndN and = new AndN(5);
	for (int i = 0; i < 5; i++) {
		and.getEntree(i).connectTo(Fixe.FALSE);
	}
	assertFalse(and.valeur()) ;
	}
}
