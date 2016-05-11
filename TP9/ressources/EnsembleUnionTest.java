package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnsembleUnionTest {


			@Test
			public void testIsEmpty() {
				Ensemble e1=new EnsembleAvecArrayList(45);
				Ensemble e2=new EnsembleAvecBooleen(37);
				EnsembleUnion ens1 = new EnsembleUnion(e1,e2);
				assertTrue(ens1.isEmpty());
				((EnsembleModifiable)e1).add(18);
				assertFalse(ens1.isEmpty());
				Ensemble e3=new EnsembleSingleton(150);
				EnsembleUnion ens2 = new EnsembleUnion(ens1,e3);
				assertFalse(ens2.isEmpty());
			}

			@Test
			public void testToString() {
				Ensemble e1=new EnsembleAvecArrayList(45);
				Ensemble e2=new EnsembleAvecBooleen(37);
				EnsembleUnion ens1 = new EnsembleUnion(e1,e2);
				assertEquals(ens1.toString(), "{}");
				((EnsembleModifiable)e1).add(18);
				((EnsembleModifiable)e1).add(7);
				((EnsembleModifiable)e2).add(25);
				assertEquals(ens1.toString(), "{7,18,25}");
				Ensemble e3=new EnsembleSingleton(150);
				EnsembleUnion ens2 = new EnsembleUnion(ens1,e3);
				assertEquals(ens2.toString(), "{7,18,25,150}");
				
			}

			@Test
			public void testSize() {
				Ensemble e1=new EnsembleAvecArrayList(45);
				Ensemble e2=new EnsembleAvecBooleen(37);
				EnsembleUnion ens1 = new EnsembleUnion(e1,e2);
				assertEquals(ens1.size(), 0);
				((EnsembleModifiable)e1).add(18);
				((EnsembleModifiable)e1).add(7);
				((EnsembleModifiable)e2).add(25);
				((EnsembleModifiable)e2).add(7);
				assertEquals(ens1.size(), 3);
				Ensemble e3=new EnsembleSingleton(150);
				EnsembleUnion ens2 = new EnsembleUnion(ens1,e3);
				assertEquals(ens2.toString(), "{7,18,25,150}");
				assertEquals(4, ens2.size());
				((EnsembleModifiable)e1).remove(18);
				assertEquals(3, ens2.size());
				assertEquals(2, ens1.size());
			}


			@Test
			public void testContains() {
				Ensemble e1=new EnsembleAvecArrayList(45);
				Ensemble e2=new EnsembleAvecBooleen(37);
				EnsembleUnion ens1 = new EnsembleUnion(e1,e2);
				assertFalse(ens1.contains(67));
				assertFalse(ens1.contains(17));
				((EnsembleModifiable)e1).add(18);
				((EnsembleModifiable)e1).add(7);
				((EnsembleModifiable)e2).add(25);
				((EnsembleModifiable)e2).add(7);
				assertTrue(ens1.contains(7));
				assertTrue(ens1.contains(18));
				Ensemble e3=new EnsembleSingleton(150);
				EnsembleUnion ens2 = new EnsembleUnion(ens1,e3);
				assertTrue(ens2.contains(7));
				assertTrue(ens2.contains(150));
				((EnsembleModifiable)e1).remove(18);
				((EnsembleModifiable)e1).remove(7);
				assertFalse(ens1.contains(18));
				assertTrue(ens2.contains(7));
				
			}
		

	}



