package personnages.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import personnages.concret.Element;

@RunWith(JUnit4.class)
public class TestElement {

	@Test
	public void testElements() {
		String[] noms = new String[] { "EAU", "FEU", "TERRE", "AIR" };
		for (int idx = 0; idx < noms.length; idx++) {
			Element e = Element.values()[idx];
			assertNotNull(e);
			assertEquals(noms[idx], e.toString());
			assertEquals(idx, e.ordinal());
		}
	}

	@Test
	public void testEstOpposeEAU() {
		assertTrue(Element.EAU.estOppose(Element.FEU));
		assertFalse(Element.EAU.estOppose(Element.EAU));
		assertFalse(Element.EAU.estOppose(Element.AIR));
		assertFalse(Element.EAU.estOppose(Element.TERRE));
	}

	@Test
	public void testEstOpposeFEU() {
		assertTrue(Element.FEU.estOppose(Element.EAU));
		assertFalse(Element.FEU.estOppose(Element.FEU));
		assertFalse(Element.FEU.estOppose(Element.AIR));
		assertFalse(Element.FEU.estOppose(Element.TERRE));
	}

	@Test
	public void testEstOpposeAIR() {
		assertTrue(Element.AIR.estOppose(Element.TERRE));
		assertFalse(Element.AIR.estOppose(Element.AIR));
		assertFalse(Element.AIR.estOppose(Element.EAU));
		assertFalse(Element.AIR.estOppose(Element.FEU));
	}

	@Test
	public void testEstOpposeTERRE() {
		assertTrue(Element.TERRE.estOppose(Element.AIR));
		assertFalse(Element.TERRE.estOppose(Element.TERRE));
		assertFalse(Element.TERRE.estOppose(Element.EAU));
		assertFalse(Element.TERRE.estOppose(Element.FEU));
	}

	@Test
	public void testGetOpposeEAU() {
		assertTrue(Element.EAU.getOppose() == Element.FEU);
	}

	@Test
	public void testGetOpposeFEU() {
		assertTrue(Element.FEU.getOppose() == Element.EAU);
	}

	@Test
	public void testGetOpposeAIR() {
		assertTrue(Element.AIR.getOppose() == Element.TERRE);
	}

	@Test
	public void testGetOpposeTERRE() {
		assertTrue(Element.TERRE.getOppose() == Element.AIR);
	}

}
