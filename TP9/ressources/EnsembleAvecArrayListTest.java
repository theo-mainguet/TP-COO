package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnsembleAvecArrayListTest {


		@Test
		public void testIsEmpty() {
			EnsembleAvecArrayList ens = new EnsembleAvecArrayList(100);
			assertTrue(ens.isEmpty());
			ens.add(20);
			assertFalse(ens.isEmpty());
		}

		@Test
		public void testClear() {
			EnsembleAvecArrayList ens = new EnsembleAvecArrayList(100);
			ens.add(33);
			ens.add(45);
			assertFalse(ens.isEmpty());
			ens.clear();
			assertTrue(ens.isEmpty());
		}
		

		@Test
		public void testAdd() {
			EnsembleAvecArrayList ens = new EnsembleAvecArrayList(100);
			assertTrue(ens.add(33));
			assertFalse(ens.add(334));
			ens.add(45);	
			ens.add(7);
			assertEquals(ens.size(),3);
		}

		@Test
		public void testToString() {
			EnsembleAvecArrayList ens = new EnsembleAvecArrayList(100);
			assertEquals(ens.toString(), "{}");
			ens.add(33);
			ens.add(45);
			ens.add(7);
			assertEquals(ens.toString(), "{7,33,45}");
		}

		@Test
		public void testSize() {
			EnsembleAvecArrayList ens = new EnsembleAvecArrayList(100);
			assertEquals(0, ens.size());
			ens.add(33);
			ens.add(45);
			ens.add(7);
			assertEquals(3, ens.size());
			ens.remove(45);
			assertEquals(2, ens.size());
			ens.remove(7);
			assertEquals(1, ens.size());
			ens.remove(33);
			assertEquals(0, ens.size());
			ens.add(17);
			assertEquals(1, ens.size());
		}


		@Test
		public void testContains() {
			EnsembleAvecArrayList ens = new EnsembleAvecArrayList(100);
			ens.add(33);
			ens.add(45);
			ens.add(7);
			assertTrue(ens.contains(33));
			assertFalse(ens.contains(8));
		}

		@Test
		public void testRemove() {
			EnsembleAvecArrayList ens = new EnsembleAvecArrayList(100);
			ens.add(5);
			ens.add(4);
			ens.add(33);
			assertTrue( ens.remove(4));
			assertFalse(ens.remove(200));
			assertFalse(ens.remove(0));
		}
		
		

	}

