package comp3111.covid;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * the unit testing
 * @author tsehowang2
 *
 */
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
	public void getIso_code2WithValidInput() {
		assertEquals("AFG",DataAnalysis.countries.get(0).getIso_code());
	}
	
	@Test
	public void getDate2WithValidInput() {
		assertEquals("2/24/2020",DataAnalysis.countries.get(0).getDate());
	}
	
	@Test
	public void getContinentWithValidInput() {
		assertEquals("Asia",DataAnalysis.countries.get(0).getContinent());
	}

	@Test
	public void getLocationWithValidInput() {
		assertEquals("Afghanistan",DataAnalysis.countries.get(0).getLocation());
	}
	
	@Test
	public void getReproduction_rateWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getReproduction_rate(), 0.001);
	}
	
	@Test
	public void getTests_unitsWithValidInput() {
		assertEquals("",DataAnalysis.countries.get(0).getTests_units());
	}
	
	@Test
	public void getPopulation_densityWithValidInput() {
		assertEquals(54.422,DataAnalysis.countries.get(0).getPopulation_density(), 0.001);
	}
	
	@Test
	public void getMedian_ageWithValidInput() {
		assertEquals(18.6,DataAnalysis.countries.get(0).getMedian_age(), 0.001);
	}
	
	@Test
	public void getAged_65_olderWithValidInput() {
		assertEquals(2.581,DataAnalysis.countries.get(0).getAged_65_older(), 0.001);
	}
	
	@Test
	public void getAged_70_olderWithValidInput() {
		assertEquals(1.337,DataAnalysis.countries.get(0).getAged_70_older(), 0.001);
	}
	
	@Test
	public void getGdp_per_capitaWithValidInput() {
		assertEquals(1803.987,DataAnalysis.countries.get(0).getGdp_per_capita(), 0.001);
	}
	
	@Test
	public void getExtreme_povertyWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getExtreme_poverty(), 0.001);
	}
	
	@Test
	public void getCardiovasc_death_rateWithValidInput() {
		assertEquals(597.029,DataAnalysis.countries.get(0).getCardiovasc_death_rate(), 0.001);
	}
	
	@Test
	public void getDiabetes_prevalenceWithValidInput() {
		assertEquals(9.59,DataAnalysis.countries.get(0).getDiabetes_prevalence(), 0.001);
	}
	
	@Test
	public void getFemale_smokersWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getFemale_smokers(), 0.001);
	}
	
	@Test
	public void getMale_smokersWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getMale_smokers(), 0.001);
	}
	
	@Test
	public void getLife_expectancyWithValidInput() {
		assertEquals(64.83,DataAnalysis.countries.get(0).getLife_expectancy(), 0.001);
	}
	
	@Test
	public void getHandwashing_facilitiesWithValidInput() {
		assertEquals(37.746,DataAnalysis.countries.get(0).getHandwashing_facilities(), 0.001);
	}
	
	@Test
	public void getHuman_development_indexWithValidInput() {
		assertEquals(0.511,DataAnalysis.countries.get(0).getHuman_development_index(), 0.001);
	}
	
	@Test
	public void getExcess_mortalityWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getExcess_mortality(), 0.001);
	}
	
	@Test
	public void getPopulationWithValidInput() {
		assertEquals(38928341,DataAnalysis.countries.get(0).getPopulation());
	}
	
	@Test
	public void getStringency_indexWithValidInput() {
		assertEquals(8.33,DataAnalysis.countries.get(0).getStringency_index(), 0.001);
	}
	
	@Test
	public void getPositive_rateWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getPositive_rate(), 0.001);
	}
	
	@Test
	public void getPeople_fully_vaccinatedWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getPeople_fully_vaccinated());
	}
	
	@Test
	public void getPeople_fully_vaccinated_per_hundredWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getPeople_fully_vaccinated_per_hundred(), 0.001);
	}
	
	@Test
	public void getPeople_vaccinatedWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getPeople_vaccinated());
	}
	
	@Test
	public void getPeople_vaccinated_per_hundredWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getPeople_vaccinated_per_hundred(), 0.001);
	}
	
	@Test
	public void getTotal_vaccinationsWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getTotal_vaccinations());
	}
	
	@Test
	public void getTotal_vaccinations_per_hundredWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getTotal_vaccinations_per_hundred(), 0.001);
	}
	
	@Test
	public void getTotal_testsWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getTotal_tests());
	}
	
	@Test
	public void getTotal_tests_per_thousandWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getTotal_tests_per_thousand(), 0.001);
	}
	
	@Test
	public void getTotal_casesWithValidInput() {
		assertEquals(1,DataAnalysis.countries.get(0).getTotal_cases());
	}
	
	@Test
	public void getTotal_cases_per_millionWithValidInput() {
		assertEquals(0.026,DataAnalysis.countries.get(0).getTotal_cases_per_million(), 0.001);
	}
	
	@Test
	public void getTotal_deathsWithValidInput() {
		assertEquals(-1,DataAnalysis.countries.get(0).getTotal_deaths());
	}
	
	@Test
	public void retrieveTotalCasesWithValidInput() {
		assertEquals(1,DataAnalysis.retrieveTotalCases("Afghanistan","2/24/2020"));
	}
	
	@Test
	public void retrieveTotalCasesPer1MWithValidInput() {
		assertEquals(0.026,DataAnalysis.retrieveTotalCasesPer1M("Afghanistan","2/24/2020"), 0.001);
	}
	
	@Test
	public void retrieveTotal_deathsWithValidInput() {
		assertEquals(-1,DataAnalysis.retrieveTotal_deaths("Afghanistan","2/24/2020"), 0.001);
	}
	
	@Test
	public void retrieveTotalDeathsPer1MWithValidInput() {
		assertEquals(-1,DataAnalysis.retrieveTotalDeathsPer1M("Afghanistan","2/24/2020"), 0.001);
	}
	
	@Test
	public void retrieveFullyVaccinatedWithValidInput() {
		assertEquals(-1,DataAnalysis.retrieveFullyVaccinated("Afghanistan","2/24/2020"), 0.001);
	}
	
	@Test
	public void retrieveRateOfVaccinationWithValidInput() {
		assertEquals(-1,DataAnalysis.retrieveRateOfVaccination("Afghanistan","2/24/2020"), 0.001);
	}
	
	@Test
	public void retrieveTotalCasesListWithValidInput() {
		ArrayList<Float> totalCases = new ArrayList<Float>();
		totalCases.add((float) 0.026);
		totalCases.add((float) 0.026);
		assertArrayEquals(totalCases.toArray(),DataAnalysis.retrieveTotalCasesList("Afghanistan","2/24/2020","2/25/2020").toArray());
	}
	
	@Test
	public void retrieveTotalDeathListWithValidInput() {
		ArrayList<Float> totalDeaths = new ArrayList<Float>();
		totalDeaths.add((float) -1);
		totalDeaths.add((float) -1);
		assertArrayEquals(totalDeaths.toArray(),DataAnalysis.retrieveTotalDeathList("Afghanistan","2/24/2020","2/25/2020").toArray());
	}
	
	@Test
	public void retrieveRateOfVaccinationListWithValidInput() {
		ArrayList<Float> rate = new ArrayList<Float>();
		rate.add((float) -1);
		rate.add((float) -1);
		assertArrayEquals(rate.toArray(),DataAnalysis.retrieveRateOfVaccinationList("Afghanistan","2/24/2020","2/25/2020").toArray());
	}
}
