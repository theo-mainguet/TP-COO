package personnages.concret;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;

@RunWith(JUnit4.class)
public class TestMage {

	final String NOM = "alpha";
	Mage m;

	@Before
	public void creerMage() {
		m = new Mage(NOM, Element.EAU);
	}

	@Test
	public void testCreerMage() {
		assertEquals(NOM, m.getNom());
		assertEquals(10, m.getForce());
		assertEquals(100, m.getVie());
		assertTrue(m.estVivant());
		assertEquals(Element.EAU, m.getElement());
	}

	@Test
	public void testPerte() {
		int vie = m.getVie();
		m.perte(50);
		assertEquals(vie - 50, m.getVie());
	}

	@Test
	public void testMassacre() {
		m.perte(9999);
		assertFalse(m.estVivant());
	}

	@Test
	public void testSurvie() {
		m.perte(9);
		assertTrue(m.estVivant());
	}

	@Test
	public void testCoherenceEstVivantGetVie() {
		if (m.estVivant()) {
			assertTrue(m.getVie() > 0);
		} else {
			assertTrue(m.getVie() <= 0);
		}
	}

	@Test
	public void testSubitAttaque() {
		int v = m.getVie();
		Mage adv = new Mage("adv", Element.EAU);
		m.subitAttaque(adv);
		assertEquals(m.getVie(), v - adv.getForce());
		v = m.getVie();
		adv = new Mage("adv", Element.TERRE);
		m.subitAttaque(adv);
		assertEquals(m.getVie(), v - adv.getForce() * 2);
		v = m.getVie();
		adv = new Mage("adv", Element.FEU);
		m.subitAttaque(adv);
		assertEquals(m.getVie(), v - adv.getForce() * 4);
	}

}
