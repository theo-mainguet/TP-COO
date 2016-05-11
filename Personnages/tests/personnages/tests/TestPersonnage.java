package personnages.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import personnages.abstrait.Personnage;

@RunWith(JUnit4.class)
public class TestPersonnage {

	final String NOM = "alpha";
	Personnage p;

	@Before
	public void creerPersonnageFantoche() {
		p = new Personnage(NOM) {
		};
	}

	@Test
	public void testCreerPersonnage() {
		assertEquals(NOM, p.getNom());
		assertEquals(10, p.getForce());
		assertEquals(100, p.getVie());
		assertTrue(p.estVivant());
	}

	@Test
	public void testPerte() {
		int vie = p.getVie();
		p.perte(5);
		assertEquals(vie - 5, p.getVie());
	}

	@Test
	public void testMassacre() {
		p.perte(100);
		assertFalse(p.estVivant());
	}

	@Test
	public void testSurvie() {
		p.perte(9);
		assertTrue(p.estVivant());
	}

	@Test
	public void testCoherenceEstVivantGetVie() {
		if (p.estVivant()) {
			assertTrue(p.getVie() > 0);
		} else {
			assertTrue(p.getVie() <= 0);
		}
	}

	@Test
	public void testForceAcquise() {
		int force = p.getForce();
		p.attaque(p);
		assertTrue(force + 1 == p.getForce());
	}

	@Test
	public void testSubitAttaque() {
		int v = p.getVie();
		Personnage adv = new Personnage(NOM) {
		};
		p.subitAttaque(adv);
		assertEquals(p.getVie(), v - adv.getForce());
	}

}
