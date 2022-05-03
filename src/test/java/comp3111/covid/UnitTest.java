package comp3111.covid;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import org.junit.BeforeClass;
import org.junit.Test;

import javafx.event.ActionEvent;

public class UnitTest {

	@BeforeClass
	public static void setUp() throws Exception {
		DataAnalysis.setClass("COVID_Dataset_v1.0.csv");
	}

	@Test
	public void startWithValidInput() {
		String[] test = {"test"};
		MyApplication.main(test);
	}
	

	@Test
	public void getIso_codeWithValidInput() {
		assertEquals("AFG",DataAnalysis.cases.get(0).getIso_code());
	}
	
	@Test
	public void getDateWithValidInput() {
		assertEquals("2/24/2020",DataAnalysis.cases.get(0).getDate());
	}
	
	@Test
	public void getNew_casesWithValidInput() {
		assertEquals(1,DataAnalysis.cases.get(0).getNew_cases());
	}
	
	@Test
	public void getNew_cases_per_millionWithValidInput() {
		assertEquals(0.026,DataAnalysis.cases.get(0).getNew_cases_per_million(),0.001);
	}
	
	@Test
	public void getNew_cases_smoothedWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_cases_smoothed(), 0.001);
	}
	
	@Test
	public void getNew_cases_smoothed_per_millionWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_cases_smoothed_per_million(), 0.001);
	}
	
	@Test
	public void getNew_deathsWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_deaths());
	}
	
	@Test
	public void getNew_deaths_smoothedWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_deaths_smoothed(), 0.001);
	}
	
	@Test
	public void getNew_deaths_per_millionWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_deaths_per_million(), 0.001);
	}
	
	@Test
	public void getNew_deaths_smoothed_per_millionWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_deaths_smoothed_per_million(), 0.001);
	}
	
	@Test
	public void getTests_per_caseWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getTests_per_case(), 0.001);
	}
	@Test
	public void getNew_testsWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_tests());
	}
	
	@Test
	public void getNew_tests_per_thousandWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_tests_per_thousand(), 0.001);
	}
	
	@Test
	public void getNew_tests_smoothedWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_tests_smoothed(), 0.001);
	}
	
	@Test
	public void getNew_tests_smoothed_per_thousandWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_tests_smoothed_per_thousand(), 0.001);
	}
	
	@Test
	public void getNew_vaccinationsWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_vaccinations());
	}
	
	@Test
	public void getNew_vaccinations_smoothedWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_vaccinations_smoothed(), 0.001);
	}
	
	@Test
	public void getNew_vaccinations_smoothed_per_millionWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getNew_vaccinations_smoothed_per_million(), 0.001);
	}
	
	@Test
	public void getIcu_patientsWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getIcu_patients());
	}

	@Test
	public void getIcu_patients_per_millionWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getIcu_patients_per_million(), 0.001);
	}
	
	@Test
	public void getWeekly_icu_admissionsWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getWeekly_icu_admissions(), 0.001);
	}
	
	@Test
	public void getWeekly_icu_admissions_per_millionWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getWeekly_icu_admissions_per_million(), 0.001);
	}
	
	@Test
	public void getHosp_patientsWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getHosp_patients());
	}
	
	@Test
	public void getHosp_patients_per_millionWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getHosp_patients_per_million(), 0.001);
	}
	
	@Test
	public void getWeekly_hosp_admissionsWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getWeekly_hosp_admissions(), 0.001);
	}
	
	@Test
	public void getWeekly_hosp_admissions_per_millionWithValidInput() {
		assertEquals(-1,DataAnalysis.cases.get(0).getWeekly_hosp_admissions_per_million(), 0.001);
	}
	
	@Test
	public void getHospital_beds_per_thousandWithValidInput() {
		assertEquals(0.5,DataAnalysis.cases.get(0).getHospital_beds_per_thousand(), 0.001);
	}
	
	@Test
	public void testA1() {
		ActionEvent event = null;     
		Controller controller = new Controller();
		controller.generateTableA1(event);
	}

}