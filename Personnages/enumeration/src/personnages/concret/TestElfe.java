package personnages.concret;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;

import personnages.affichage.Parametres;

@RunWith(JUnit4.class)
public class TestElfe {

	final String NOM = "alpha";
	Elfe elfe;

	@Before
	public void testCreerElfe() {
		elfe = new Elfe(NOM, Arme.values()[0], Element.values()[0]);
		assertEquals(NOM, elfe.getNom());
		assertEquals(Parametres.FORCE, elfe.getForce());
		assertEquals(Parametres.VIE, elfe.getVie());
		assertTrue(elfe.estVivant());
		assertEquals(Arme.values()[0], elfe.getArme());
		assertEquals(Element.values()[0], elfe.getElement());
	}

	@Test
	public void testCreerElfeAlea() {
		elfe = new Elfe(NOM);
		assertEquals(NOM, elfe.getNom());
		assertEquals(Parametres.FORCE, elfe.getForce());
		assertEquals(Parametres.VIE, elfe.getVie());
		assertTrue(elfe.estVivant());
		assertNotNull(elfe.getArme());
		assertNotNull(elfe.getElement());
	}

	@Test
	public void testPerte() {
		int vieAvant = elfe.getVie();
		elfe.perte(1);
		assertEquals(vieAvant - 1, elfe.getVie());
	}

	@Test
	public void testMassacre() {
		elfe.perte(Parametres.VIE + 1);
		assertFalse(elfe.estVivant());
	}

	@Test
	public void testSurvie() {
		elfe.perte(9);
		assertTrue(elfe.estVivant());
	}

	@Test
	public void testCoherenceEstVivantGetVie() {
		if (elfe.estVivant()) {
			assertTrue(elfe.getVie() > 0);
		} else {
			assertTrue(elfe.getVie() <= 0);
		}
	}

	@Test
	public void testSubitAttaqueGuerrierMemeArme() {
		int vieAvant = elfe.getVie();
		Guerrier adv = new Guerrier(NOM, Arme.values()[0]);
		elfe.subitAttaque(adv);
		assertEquals(vieAvant - adv.getForce(), elfe.getVie());
	}

	@Test
	public void testSubitAttaqueGuerrierArmeDifferente() {
		int vieAvant = elfe.getVie();
		Guerrier adv = new Guerrier(NOM, Arme.values()[1]);
		elfe.subitAttaque(adv);
		assertEquals(vieAvant - adv.getForce() * adv.getArme().puissance(),
				elfe.getVie());
	}

	@Test
	public void testSubitAttaqueMageMemeElement() {
		int vieAvant = elfe.getVie();
		Mage adv = new Mage(NOM, Element.values()[0]);
		elfe.subitAttaque(adv);
		assertEquals(vieAvant - adv.getForce(), elfe.getVie());
	}

	@Test
	public void testSubitAttaqueMageElementOppose() {
		int vieAvant = elfe.getVie();
		Mage adv = new Mage(NOM, elfe.getElement().getOppose());
		elfe.subitAttaque(adv);
		assertEquals(vieAvant - adv.getForce() * 4, elfe.getVie());
	}

	@Test
	public void testSubitAttaqueMageElementDifferent() {
		int vieAvant = elfe.getVie();
		Mage adv = new Mage(NOM, Element.values()[3]);
		elfe.subitAttaque(adv);
		assertEquals(vieAvant - adv.getForce() * 2, elfe.getVie());
	}

}
