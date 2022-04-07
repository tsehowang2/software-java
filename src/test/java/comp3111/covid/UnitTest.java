package comp3111.covid;
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