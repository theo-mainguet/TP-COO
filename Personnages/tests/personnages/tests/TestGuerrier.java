package personnages.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import personnages.concret.Arme;
import personnages.concret.Guerrier;

@RunWith(JUnit4.class)
public class TestGuerrier {

	final String NOM = "beta";
	Guerrier g;

	@Before
	public void testCreerGuerrier() {
		g = new Guerrier(NOM, Arme.ARC);
		assertEquals("beta", g.getNom());
		assertEquals(10, g.getForce());
		assertEquals(100, g.getVie());
		assertTrue(g.estVivant());
		assertEquals(Arme.ARC, g.getArme());
	}

	@Test
	public void testPerte() {
		int vie = g.getVie();
		g.perte(5);
		assertEquals(vie - 5, g.getVie());
	}

	@Test
	public void testMassacre() {
		g.perte(100);
		assertFalse(g.estVivant());
	}

	@Test
	public void testSurvie() {
		g.perte(9);
		assertTrue(g.estVivant());
	}

	@Test
	public void testCoherenceEstVivantGetVie() {
		if (g.estVivant()) {
			assertTrue(g.getVie() > 0);
		} else {
			assertTrue(g.getVie() <= 0);
		}
	}

	@Test
	public void testSubitAttaque() {

		int v = g.getVie();
		Guerrier adv = new Guerrier("adv", Arme.ARC);
		g.subitAttaque(adv);
		assertEquals(v - adv.getForce(),g.getVie());

		v = g.getVie();
		adv = new Guerrier("adv", Arme.HACHE);
		g.subitAttaque(adv);
		assertEquals(v - adv.getForce() * adv.getArme().puissance(),g.getVie());
	}

}
