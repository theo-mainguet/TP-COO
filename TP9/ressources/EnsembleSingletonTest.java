package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnsembleSingletonTest {


		@Test
		public void testIsEmpty() {
			EnsembleSingleton ens = new EnsembleSingleton(100);
			
			assertFalse(ens.isEmpty());
		}

		@Test
		public void testToString() {
			EnsembleSingleton ens = new EnsembleSingleton(100);
			
			assertEquals(ens.toString(), "{100}");
		}

		@Test
		public void testSize() {
			EnsembleSingleton ens = new EnsembleSingleton(100);
			assertEquals(1, ens.size());
		}


		@Test
		public void testContains() {
			EnsembleSingleton ens = new EnsembleSingleton(100);
			assertTrue(ens.contains(100));
			assertFalse(ens.contains(8));
		}
	

}
