package y6jrju_softtest.softtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class KorKeruleteTest {
	
	KorKerulete kerulet = null; 
	
	@Before
	public void init() {
		kerulet = new KorKerulete(); 
		
	}
	
	@Test
	public void testkerulet() {
		
		int expected = 44; 
		int result = kerulet.korker(7);
		
		assertEquals(expected, result);
	}
	
	public void testkeruleterror () {
		int expected =44; 
		int result = kerulet.korker(9);
		
		assertEquals(expected, result);
	}

}
