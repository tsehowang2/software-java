package comp3111.covid;
<<<<<<< HEAD
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class UnitTest {
  int age;
  @Before
  public void setUp() throws Exception {
    age = 30;
  }
  @Test
  public void getIsoCodeWithValidInput() {
    assertEquals("CHN", Case.getIsoCode());
  }
  @Test
  public void getMedianAgeWithValidInput() {
    assertEquals(age, Country.getMedianAge());
  }
}
=======

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UnitTest {
	
//	int age;
//	Case c1;
//	
//	@Before
//	public void setUp() throws Exception {
//		age = 30;
//	}
//
//	@Test
//	public void getIsoCodeWithValidInput() {
//		assertEquals("AFG", c1.getIso_code("AFG"));
//	}
//	@Test
//	public void getMedianAgeWithValidInput() {
//		assertEquals(age, Country.getMedianAge());
//	}

}
>>>>>>> branch 'master' of https://github.com/chleungba/GroupProject.git
