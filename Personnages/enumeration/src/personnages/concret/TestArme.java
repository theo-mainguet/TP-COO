package personnages.concret;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;

@RunWith(JUnit4.class)
public class TestArme {

	public void testArme(String nom, int position) {
		Arme a = Arme.valueOf(nom);
		assertNotNull(a);
		assertTrue(a.ordinal() == position);
	}

	@Test
	public void testArc() {
		testArme("ARC", 0);
	}

	@Test
	public void testPuissanceArc() {
		assertEquals(1, Arme.ARC.puissance());
	}

	@Test
	public void testEpee() {
		testArme("EPEE", 1);
	}

	@Test
	public void testPuissanceEpee() {
		assertEquals(2, Arme.EPEE.puissance());
	}

	@Test
	public void testHache() {
		testArme("HACHE", 2);
	}

	@Test
	public void testPuissanceHache() {
		assertEquals(3, Arme.HACHE.puissance());
	}

}
