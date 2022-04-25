package comp3111.covid;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UnitTest {
	
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void getIsoCodeCaseWithValidInput() {
		assertEquals("AFG", Case.getIsoCode());
	}
	
	@Test
	public void getIsoCodeCountryWithValidInput() {
		assertEquals("AFG",Country.getIsoCode());
	}
	
}


