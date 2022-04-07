package comp3111.covid;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UnitTester {

	//static Case a = new Case();
	
	/*@Before
	public void setUp() throws Exception {
		
	}*/

	/*@Test
	public void computeOneWithValidInput() {
		assertEquals(1, UnitTest.computeOne());
	}*/

	/*@Test
	public void getIsoCode() {
		assertEquals(a.getIsoCode(), UnitTest.getIsoCode());
	}*/
	
int[] arrAscending, arrDescending;
	
	@Before
	public void setUp() throws Exception {
		arrAscending = new int[] {1, 2, 3, 4, 5};
		arrDescending = new int[] {5, 4, 3, 2, 1};
	}

	@Test
	public void computeOneWithValidInput() {
		assertEquals(1, UnitTest.computeOne());
	}
	
	@Test
	public void isItTrueWithValidInput() {
		assertTrue(UnitTest.isItTrue());
	}
	
	@Test
	public void sortDescendingOrder() {
		assertArrayEquals(arrAscending, UnitTest.sort(arrDescending));
	}
	
	@Test
	public void sortAscendingOrder() {
		assertArrayEquals(arrAscending, UnitTest.sort(arrAscending));
	}

	@Test
	public void isEvenNumReturnTrue() {
		assertTrue(UnitTest.isEvenNumber(2));
	}	
}
