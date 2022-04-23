package comp3111.covid;

import org.apache.commons.csv.*;
import java.util.*;
import edu.duke.*;
/**
 * 
 * Data Explorer on COVID-19
 * @author <a href=mailto:namkiu@ust.hk>Namkiu Chan</a>
 * @version	1.1
 * 
 */
public class DataAnalysis {
	
	 static List<Case> cases = new ArrayList<Case>();
	 static List<Country> countries = new ArrayList<Country>();
	 
	public static CSVParser getFileParser(String dataset) {
	     FileResource fr = new FileResource("dataset/" + dataset);
	     return fr.getCSVParser(true);
	     }
	

	public static String getConfirmedCases(String dataset, String iso_code) {
		String oReport = "";	
		long confirmedCases = 0;
		long numRecord = 0;
		long totalNumRecord = 0;
		
		for (CSVRecord rec : getFileParser(dataset)) {
			
			if (rec.get("iso_code").equals(iso_code)) {
				String s = rec.get("new_cases");
				if (!s.equals("")) {
					confirmedCases += Long.parseLong(s);
					numRecord++;
				}
			}		
			totalNumRecord++;
		}
		
		oReport = String.format("Dataset (%s): %,d Records\n\n", dataset, totalNumRecord);
		oReport += String.format("[Summary (%s)]\n", iso_code);
		oReport += String.format("Number of Confirmed Cases: %,d\n", confirmedCases);
		oReport += String.format("Number of Days Reported: %,d\n", numRecord);
		
		return oReport;
	}
	
	 public static String getConfirmedDeaths(String dataset, String iso_code) {
			String oReport = "";	
			long confirmedDeaths = 0;
			long numRecord = 0;
			long totalNumRecord = 0;
			
			for (CSVRecord rec : getFileParser(dataset)) {
				
				if (rec.get("iso_code").equals(iso_code)) {
					String s = rec.get("new_deaths");
					if (!s.equals("")) {
						confirmedDeaths += Long.parseLong(s);
						numRecord++;
					}
				}		
				totalNumRecord++;
			}
			
			oReport = String.format("Dataset (%s): %,d Records\n\n", dataset, totalNumRecord);
			oReport += String.format("[Summary (%s)]\n", iso_code);
			oReport += String.format("Number of Deaths: %,d\n", confirmedDeaths);
			oReport += String.format("Number of Days Reported: %,d\n", numRecord);
			
			return oReport;
	 }
	 
	 public static String getRateOfVaccination(String dataset, String iso_code) {
			String oReport = "";	
			long fullyVaccinated = 0;
			long numRecord = 0;
			long totalNumRecord = 0;
			long population = 0;
			float rate = 0.0f;
						
			for (CSVRecord rec : getFileParser(dataset)) {
				
				if (rec.get("iso_code").equals(iso_code)) {
					
					String s1 = rec.get("people_fully_vaccinated");
					String s2 = rec.get("population");		
					if (!s1.equals("") && !s2.equals("")) {
						fullyVaccinated = Long.parseLong(s1);
						population = Long.parseLong(s2);						
						numRecord++;
					}
				}		
				totalNumRecord++;
			}
			
			if (population !=0)
				rate = (float) fullyVaccinated / population * 100;
			
			oReport = String.format("Dataset (%s): %,d Records\n\n", dataset, totalNumRecord);
			oReport += String.format("[Summary (%s)]\n", iso_code);
			oReport += String.format("Number of People Fully Vaccinated: %,d\n", fullyVaccinated);
			oReport += String.format("Population: %,d\n", population);
			oReport += String.format("Rate of Vaccination: %.2f%%\n", rate);
			oReport += String.format("Number of Days Reported: %,d\n", numRecord);
			
			return oReport;
	 }
	 
	 
	 public static void setClass(String dataset) {

		 for (CSVRecord rec : getFileParser(dataset)) {
			 Case _case = new Case(
					 rec.get("iso_code"),
					 Integer.parseInt(rec.get("new_cases").isEmpty()?"0":rec.get("new_cases")),
					 Float.parseFloat(rec.get("new_cases_per_million").isEmpty()?"0":rec.get("new_cases_per_million")),
					 Float.parseFloat(rec.get("new_cases_smoothed").isEmpty()?"0":rec.get("new_cases_smoothed")),
					 Float.parseFloat(rec.get("new_cases_smoothed_per_million").isEmpty()?"0":rec.get("new_cases_smoothed_per_million")),
					 Integer.parseInt(rec.get("new_deaths").isEmpty()?"0":rec.get("new_deaths")),
					 Float.parseFloat(rec.get("new_deaths_per_million").isEmpty()?"0":rec.get("new_deaths_per_million")),
					 Float.parseFloat(rec.get("new_deaths_smoothed").isEmpty()?"0":rec.get("new_deaths_smoothed")),
					 Float.parseFloat(rec.get("new_deaths_smoothed_per_million").isEmpty()?"0":rec.get("new_deaths_smoothed_per_million")),
					 Float.parseFloat(rec.get("tests_per_case").isEmpty()?"0":rec.get("tests_per_case")),
					 Integer.parseInt(rec.get("new_tests").isEmpty()?"0":rec.get("new_tests")),
					 Float.parseFloat(rec.get("new_tests_per_thousand").isEmpty()?"0":rec.get("new_tests_per_thousand")),
					 Float.parseFloat(rec.get("new_tests_smoothed").isEmpty()?"0":rec.get("new_tests_smoothed")),
					 Float.parseFloat(rec.get("new_tests_smoothed_per_thousand").isEmpty()?"0":rec.get("new_tests_smoothed_per_thousand")),
					 Integer.parseInt(rec.get("new_vaccinations").isEmpty()?"0":rec.get("new_vaccinations")),
					 Float.parseFloat(rec.get("new_vaccinations_smoothed").isEmpty()?"0":rec.get("new_vaccinations_smoothed")),
					 Float.parseFloat(rec.get("new_vaccinations_smoothed_per_million").isEmpty()?"0":rec.get("new_vaccinations_smoothed_per_million")),
					 Integer.parseInt(rec.get("icu_patients").isEmpty()?"0":rec.get("icu_patients")),
					 Float.parseFloat(rec.get("icu_patients_per_million").isEmpty()?"0":rec.get("icu_patients_per_million")),
					 Float.parseFloat(rec.get("weekly_icu_admissions").isEmpty()?"0":rec.get("weekly_icu_admissions")),
					 Float.parseFloat(rec.get("weekly_icu_admissions_per_million").isEmpty()?"0":rec.get("weekly_icu_admissions_per_million")),
					 Integer.parseInt(rec.get("hosp_patients").isEmpty()?"0":rec.get("hosp_patients")),
					 Float.parseFloat(rec.get("hosp_patients_per_million").isEmpty()?"0":rec.get("hosp_patients_per_million")),
					 Float.parseFloat(rec.get("weekly_hosp_admissions").isEmpty()?"0":rec.get("weekly_hosp_admissions")),
					 Float.parseFloat(rec.get("weekly_hosp_admissions_per_million").isEmpty()?"0":rec.get("weekly_hosp_admissions_per_million")),
					 Float.parseFloat(rec.get("hospital_beds_per_thousand").isEmpty()?"0":rec.get("hospital_beds_per_thousand")));
			 
			 Country _country = new Country(
					 rec.get("iso_code"),
					 rec.get("continent"),
					 rec.get("location"),
					 Float.parseFloat(rec.get("reproduction_rate").isEmpty()?"0":rec.get("reproduction_rate")),
					 rec.get("tests_units").isEmpty()?"":rec.get("tests_units"),
					 Float.parseFloat(rec.get("population_density").isEmpty()?"0":rec.get("population_density")),
					 Float.parseFloat(rec.get("median_age").isEmpty()?"0":rec.get("median_age")),
					 Float.parseFloat(rec.get("aged_65_older").isEmpty()?"0":rec.get("aged_65_older")),
					 Float.parseFloat(rec.get("aged_70_older").isEmpty()?"0":rec.get("aged_70_older")),
					 Float.parseFloat(rec.get("gdp_per_capita").isEmpty()?"0":rec.get("gdp_per_capita")),
					 Float.parseFloat(rec.get("extreme_poverty").isEmpty()?"0":rec.get("extreme_poverty")),
					 Float.parseFloat(rec.get("cardiovasc_death_rate").isEmpty()?"0":rec.get("cardiovasc_death_rate")),
					 Float.parseFloat(rec.get("diabetes_prevalence").isEmpty()?"0":rec.get("diabetes_prevalence")),
					 Float.parseFloat(rec.get("female_smokers").isEmpty()?"0":rec.get("female_smokers")),
					 Float.parseFloat(rec.get("male_smokers").isEmpty()?"0":rec.get("male_smokers")),
					 Float.parseFloat(rec.get("life_expectancy").isEmpty()?"0":rec.get("life_expectancy")),
					 Float.parseFloat(rec.get("handwashing_facilities").isEmpty()?"0":rec.get("handwashing_facilities")),
					 Float.parseFloat(rec.get("human_development_index").isEmpty()?"0":rec.get("human_development_index")),
					 Float.parseFloat(rec.get("excess_mortality").isEmpty()?"0":rec.get("excess_mortality")),
					 Long.parseLong(rec.get("population").isEmpty()?"0":rec.get("population")),
					 Float.parseFloat(rec.get("positive_rate").isEmpty()?"0":rec.get("positive_rate")),
					 Float.parseFloat(rec.get("stringency_index").isEmpty()?"0":rec.get("stringency_index")),
					 Integer.parseInt(rec.get("people_fully_vaccinated").isEmpty()?"0":rec.get("people_fully_vaccinated")),
					 Float.parseFloat(rec.get("people_fully_vaccinated_per_hundred").isEmpty()?"0":rec.get("people_fully_vaccinated_per_hundred")),
					 Integer.parseInt(rec.get("people_vaccinated").isEmpty()?"0":rec.get("people_vaccinated")),
					 Float.parseFloat(rec.get("people_vaccinated_per_hundred").isEmpty()?"0":rec.get("people_vaccinated_per_hundred")),
					 Long.parseLong(rec.get("total_vaccinations").isEmpty()?"0":rec.get("total_vaccinations")),
					 Float.parseFloat(rec.get("total_vaccinations_per_hundred").isEmpty()?"0":rec.get("total_vaccinations_per_hundred")),
					 Integer.parseInt(rec.get("total_tests").isEmpty()?"0":rec.get("total_tests")),
					 Float.parseFloat(rec.get("total_tests_per_thousand").isEmpty()?"0":rec.get("total_tests_per_thousand")),
					 Integer.parseInt(rec.get("total_cases").isEmpty()?"0":rec.get("total_cases")),
					 Float.parseFloat(rec.get("total_cases_per_million").isEmpty()?"0":rec.get("total_cases_per_million")),
					 Integer.parseInt(rec.get("total_deaths").isEmpty()?"0":rec.get("total_deaths")),
					 Float.parseFloat(rec.get("total_deaths_per_million").isEmpty()?"0":rec.get("total_deaths_per_million")));
			 
			 cases.add(_case);
			 countries.add(_country);
		 }
		 
		 for (Case _case : cases) {
			 System.out.println(_case.getNew_deaths());
		 }
		 for (Country _country : countries) {
			 System.out.println(_country.getMedian_age());
		 }
	 }
 
}