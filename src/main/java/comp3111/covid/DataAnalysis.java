package comp3111.covid;

import org.apache.commons.csv.*;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
	 
	 public static boolean isValidDate(String input) {
		 //String input = "31/02/2000";
		 DateTimeFormatter f = DateTimeFormatter.ofPattern ( "M/d/uuuu" );
		 try {
		     LocalDate ld = LocalDate.parse ( input , f );
		     //System.out.println ( "ld: " + ld );
		     if (input.charAt(0) == '2') {
		    	 if (input.charAt(2) == '2' &&  input.charAt(3) == '9') {
		    		 int year = Integer.parseInt(input.substring(input.length() - 4));
		    		 System.out.println(year);
		    	     if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		    	    	 return true;
		    	     else
		    	    	 return false;
		    	 }
		    	 if (input.charAt(2) == '3' &&  input.charAt(3) == '0') {
	    	    	  return false;
		    	 }
		    	 if (input.charAt(2) == '3' &&  input.charAt(3) == '1') {
		    		 return false;
		    	 }
		     }
		     if (input.charAt(0) == '4' || input.charAt(0) == '6' || input.charAt(0) == '9' || (input.charAt(0) == '1' && input.charAt(0) == '1')) {
		    	 if (input.charAt(2) == '3' &&  input.charAt(3) == '1') {
		    		 return false;
		    	 }
		     }
		     
		     return true;
		     
		 } catch ( DateTimeParseException e ) {
			 return false;
		     //System.out.println ( "ERROR1234: " + e );
		 }
	 }
	 
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
	 
	 public static List<String> getUniqueLocations() {
		 ArrayList<String> location = new ArrayList<String>();
		 for(Country row : countries) {
			 location.add(row.getLocation());
		 }
		 List<String> uniqueLocation = location.stream().distinct().collect(Collectors.toList());
		 return uniqueLocation;
	 }
	 
	 public static int retrieveTotalCases(String country, String date) {
		 int total_cases = 0;
		 //System.out.print(country +  " " + date +  " ");
		 for(Country row : countries) {
			 if(row.getLocation().equals(country)) {
				 if(row.getDate().equals(date)) {
					 	total_cases = row.getTotal_cases();
					 }
				 }
		 }
		 //System.out.println(total_cases);
		 return total_cases;
	 }
	 
	 public static int retrieveWorldTotalCasesWorld(String date) {
		 int total_cases = 0;
		 for(Country row : countries) {
			 if(row.getDate().equals(date)) {
				 total_cases += (row.getTotal_cases()==-1?0:row.getTotal_cases());
				 }
			 }
		 return total_cases;
	 }
	 
	 public static float retrieveTotalCasesPer1M(String country, String date) {
		 float total_cases_per_million = 0;
		 for(Country row : countries) {
			 if(row.getLocation().equals(country)) {
				 if(row.getDate().equals(date)) {
					 total_cases_per_million = row.getTotal_cases_per_million();
					 }
				 }
		 }
		return total_cases_per_million;
	 }
	 
	 public static float retrieveWorldTotalCasesPer1M(String date) {
		 float total_cases_per_million = 0;
		 for(Country row : countries) {
			 if(row.getDate().equals(date)) {
				 total_cases_per_million += (row.getTotal_cases_per_million()==-1?0:row.getTotal_cases_per_million());
				 }
			 }
		 return total_cases_per_million;
	 }
	 
	 public static int retrieveTotal_deaths(String country, String date) {
		 int total_deaths = 0;
		 for(Country row : countries) {
			 if(row.getLocation().equals(country)) {
				 if(row.getDate().equals(date)) {
					 total_deaths = row.getTotal_deaths();
					 }
				 }
		 }
		return total_deaths;
	 }
	 
	 public static int retrieveWorldTotal_deaths(String date) {
		 int total_deaths = 0;
		 for(Country row : countries) {
			 if(row.getDate().equals(date)) {
				 total_deaths += (row.getTotal_deaths()==-1?0:row.getTotal_deaths());
				 }
			 }
		return total_deaths;
	 }
	 
	 public static float retrieveTotalDeathsPer1M(String country, String date) {
		 float total_deaths_per_million = 0;
		 for(Country row : countries) {
			 if(row.getLocation().equals(country)) {
				 if(row.getDate().equals(date)) {
					 total_deaths_per_million = row.getTotal_deaths_per_million();
					 }
				 }
		 }
		return total_deaths_per_million;
	 }
	 
	 public static float retrieveWorldTotalDeathsPer1M(String date) {
		 float total_deaths_per_million = 0;
		 for(Country row : countries) {
			 if(row.getDate().equals(date)) {
				 total_deaths_per_million += (row.getTotal_deaths_per_million()==-1?0:row.getTotal_deaths_per_million());
				 }
			 }
		return total_deaths_per_million;
	 }
	 
	 public static int retrieveFullyVaccinated(String country, String date) {
		 int people_fully_vaccinated = 0;
		 boolean haveData = false;
		 for(Country row : countries) {
			 if(row.getLocation().equals(country)) {
				 if(row.getDate().equals(date)) {
					 people_fully_vaccinated = row.getPeople_fully_vaccinated();
					 haveData = true;
					 }
				 }
		 }
		return haveData?people_fully_vaccinated:-1;
	 }
	 
	 public static int retrieveWorldFullyVaccinated(String date) {
		 int people_fully_vaccinated = 0;
		 for(Country row : countries) {
			 if(row.getDate().equals(date)) {
				 people_fully_vaccinated += (row.getPeople_fully_vaccinated()==-1?0:row.getPeople_fully_vaccinated());
				 }
			 }
		return people_fully_vaccinated;
	 }
	 
	 public static float retrieveRateOfVaccination(String country, String date) {
		 float rate = 0;
		 float population = 0;
		 boolean haveData = false;
		 int people_fully_vaccinated = retrieveFullyVaccinated(country, date);
		 for(Country row : countries) {
			 if(row.getLocation().equals(country)) {
				 if(row.getDate().equals(date)) {
					 population = row.getPopulation();
					 haveData = true;
					 }
				 }
		 }
		 
		 if (haveData && people_fully_vaccinated != -1) {
			 rate = people_fully_vaccinated / population * 100;
		 }
		 else {
			 rate = -1;
		 }
		return rate;
	 }
	 
	 public static float retrieveWorldRateOfVaccination(String date) {
		 float rate = 0;
		 float population = 0;
		 int people_fully_vaccinated = 0;
		 for(Country row : countries) {
			 if(row.getDate().equals(date) && !(row.getContinent().equals(""))) {
				 people_fully_vaccinated += retrieveFullyVaccinated(row.getLocation(), date);
				 population += row.getPopulation();
				 }
			 }
		 rate = people_fully_vaccinated / population * 100;
		return rate;
	 }
	 

	 public static ArrayList<Float> retrieveTotalCasesList(String country, String startDate, String endDate) {
		 ArrayList<Float> totalCases = new ArrayList<Float>();
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/uuuu");
		 LocalDate _startDate = LocalDate.parse(startDate, formatter);
		 LocalDate _endDate = LocalDate.parse(endDate, formatter);
		  
		for(Country row : countries) {
			if(row.getLocation().equals(country)) {
				 LocalDate rowDate = LocalDate.parse(row.getDate(), formatter);
				 if(rowDate.isAfter(_startDate) && rowDate.isBefore(_endDate) || rowDate.isEqual(_endDate) || rowDate.isEqual(_startDate)) {
					 totalCases.add(row.getTotal_cases_per_million());
				 }
			 }
	      }
		 return totalCases;
	 }
	 
	 public static ArrayList<Float> retrieveTotalDeathList(String country, String startDate, String endDate) {
		 ArrayList<Float> totalDeaths = new ArrayList<Float>();
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/uuuu");
		 LocalDate _startDate = LocalDate.parse(startDate, formatter);
		 LocalDate _endDate = LocalDate.parse(endDate, formatter);
		  
		for(Country row : countries) {
			if(row.getLocation().equals(country)) {
				 LocalDate rowDate = LocalDate.parse(row.getDate(), formatter);
				 if(rowDate.isAfter(_startDate) && rowDate.isBefore(_endDate) || rowDate.isEqual(_endDate) || rowDate.isEqual(_startDate)) {
					 totalDeaths.add(row.getTotal_deaths_per_million());
				 }
			 }
	      }
		 return totalDeaths;
	 }
	 
	 public static ArrayList<Float> retrieveRateOfVaccinationList(String country, String startDate, String endDate) {
		 ArrayList<Float> rate = new ArrayList<Float>();
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/uuuu");
		 LocalDate _startDate = LocalDate.parse(startDate, formatter);
		 LocalDate _endDate = LocalDate.parse(endDate, formatter);
		 
		 float population = -1;
		 int people_fully_vaccinated = -1;
		 for(Country row : countries) {
			 if(row.getLocation().equals(country)) {
				 LocalDate rowDate = LocalDate.parse(row.getDate(), formatter);
				 if(rowDate.isAfter(_startDate) && rowDate.isBefore(_endDate) || rowDate.isEqual(_endDate) || rowDate.isEqual(_startDate)) {
					 people_fully_vaccinated = row.getPeople_fully_vaccinated();
					 }
				 population = row.getPopulation();
				 }
			 if(population != -1 && people_fully_vaccinated != -1) {
				 rate.add(people_fully_vaccinated / population * 100);
			 }
			 else {
				 if(rate.isEmpty()) {
					 rate.add((float)0);
				 }
				 rate.add(rate.get(rate.size() - 1));
			 }
		 }
		return rate;
	 }
	 	 
	 public static void setClass(String dataset) {
		 
		 for (CSVRecord rec : getFileParser(dataset)) {
			 Case _case = new Case(
					 rec.get("iso_code"),
					 rec.get("date"),
					 Integer.parseInt(rec.get("new_cases").equals("")?"-1":rec.get("new_cases")),
					 Float.parseFloat(rec.get("new_cases_per_million").equals("")?"-1":rec.get("new_cases_per_million")),
					 Float.parseFloat(rec.get("new_cases_smoothed").equals("")?"-1":rec.get("new_cases_smoothed")),
					 Float.parseFloat(rec.get("new_cases_smoothed_per_million").equals("")?"-1":rec.get("new_cases_smoothed_per_million")),
					 Integer.parseInt(rec.get("new_deaths").equals("")?"-1":rec.get("new_deaths")),
					 Float.parseFloat(rec.get("new_deaths_per_million").equals("")?"-1":rec.get("new_deaths_per_million")),
					 Float.parseFloat(rec.get("new_deaths_smoothed").equals("")?"-1":rec.get("new_deaths_smoothed")),
					 Float.parseFloat(rec.get("new_deaths_smoothed_per_million").equals("")?"-1":rec.get("new_deaths_smoothed_per_million")),
					 Float.parseFloat(rec.get("tests_per_case").equals("")?"-1":rec.get("tests_per_case")),
					 Integer.parseInt(rec.get("new_tests").equals("")?"-1":rec.get("new_tests")),
					 Float.parseFloat(rec.get("new_tests_per_thousand").equals("")?"-1":rec.get("new_tests_per_thousand")),
					 Float.parseFloat(rec.get("new_tests_smoothed").equals("")?"-1":rec.get("new_tests_smoothed")),
					 Float.parseFloat(rec.get("new_tests_smoothed_per_thousand").equals("")?"-1":rec.get("new_tests_smoothed_per_thousand")),
					 Integer.parseInt(rec.get("new_vaccinations").equals("")?"-1":rec.get("new_vaccinations")),
					 Float.parseFloat(rec.get("new_vaccinations_smoothed").equals("")?"-1":rec.get("new_vaccinations_smoothed")),
					 Float.parseFloat(rec.get("new_vaccinations_smoothed_per_million").equals("")?"-1":rec.get("new_vaccinations_smoothed_per_million")),
					 Integer.parseInt(rec.get("icu_patients").equals("")?"-1":rec.get("icu_patients")),
					 Float.parseFloat(rec.get("icu_patients_per_million").equals("")?"-1":rec.get("icu_patients_per_million")),
					 Float.parseFloat(rec.get("weekly_icu_admissions").equals("")?"-1":rec.get("weekly_icu_admissions")),
					 Float.parseFloat(rec.get("weekly_icu_admissions_per_million").equals("")?"-1":rec.get("weekly_icu_admissions_per_million")),
					 Integer.parseInt(rec.get("hosp_patients").equals("")?"-1":rec.get("hosp_patients")),
					 Float.parseFloat(rec.get("hosp_patients_per_million").equals("")?"-1":rec.get("hosp_patients_per_million")),
					 Float.parseFloat(rec.get("weekly_hosp_admissions").equals("")?"-1":rec.get("weekly_hosp_admissions")),
					 Float.parseFloat(rec.get("weekly_hosp_admissions_per_million").equals("")?"-1":rec.get("weekly_hosp_admissions_per_million")),
					 Float.parseFloat(rec.get("hospital_beds_per_thousand").equals("")?"-1":rec.get("hospital_beds_per_thousand")));
			 
			 Country _country = new Country(
					 rec.get("iso_code"),
					 rec.get("date"),
					 rec.get("continent").equals("")?"":rec.get("continent"),
					 rec.get("location"),
					 Float.parseFloat(rec.get("reproduction_rate").equals("")?"-1":rec.get("reproduction_rate")),
					 rec.get("tests_units"),
					 Float.parseFloat(rec.get("population_density").equals("")?"-1":rec.get("population_density")),
					 Float.parseFloat(rec.get("median_age").equals("")?"-1":rec.get("median_age")),
					 Float.parseFloat(rec.get("aged_65_older").equals("")?"-1":rec.get("aged_65_older")),
					 Float.parseFloat(rec.get("aged_70_older").equals("")?"-1":rec.get("aged_70_older")),
					 Float.parseFloat(rec.get("gdp_per_capita").equals("")?"-1":rec.get("gdp_per_capita")),
					 Float.parseFloat(rec.get("extreme_poverty").equals("")?"-1":rec.get("extreme_poverty")),
					 Float.parseFloat(rec.get("cardiovasc_death_rate").equals("")?"-1":rec.get("cardiovasc_death_rate")),
					 Float.parseFloat(rec.get("diabetes_prevalence").equals("")?"-1":rec.get("diabetes_prevalence")),
					 Float.parseFloat(rec.get("female_smokers").equals("")?"-1":rec.get("female_smokers")),
					 Float.parseFloat(rec.get("male_smokers").equals("")?"-1":rec.get("male_smokers")),
					 Float.parseFloat(rec.get("life_expectancy").equals("")?"-1":rec.get("life_expectancy")),
					 Float.parseFloat(rec.get("handwashing_facilities").equals("")?"-1":rec.get("handwashing_facilities")),
					 Float.parseFloat(rec.get("human_development_index").equals("")?"-1":rec.get("human_development_index")),
					 Float.parseFloat(rec.get("excess_mortality").equals("")?"-1":rec.get("excess_mortality")),
					 Long.parseLong(rec.get("population").equals("")?"-1":rec.get("population")),
					 Float.parseFloat(rec.get("positive_rate").equals("")?"-1":rec.get("positive_rate")),
					 Float.parseFloat(rec.get("stringency_index").equals("")?"-1":rec.get("stringency_index")),
					 Integer.parseInt(rec.get("people_fully_vaccinated").equals("")?"-1":rec.get("people_fully_vaccinated")),
					 Float.parseFloat(rec.get("people_fully_vaccinated_per_hundred").equals("")?"-1":rec.get("people_fully_vaccinated_per_hundred")),
					 Integer.parseInt(rec.get("people_vaccinated").equals("")?"-1":rec.get("people_vaccinated")),
					 Float.parseFloat(rec.get("people_vaccinated_per_hundred").equals("")?"-1":rec.get("people_vaccinated_per_hundred")),
					 Long.parseLong(rec.get("total_vaccinations").equals("")?"-1":rec.get("total_vaccinations")),
					 Float.parseFloat(rec.get("total_vaccinations_per_hundred").equals("")?"-1":rec.get("total_vaccinations_per_hundred")),
					 Integer.parseInt(rec.get("total_tests").equals("")?"-1":rec.get("total_tests")),
					 Float.parseFloat(rec.get("total_tests_per_thousand").equals("")?"-1":rec.get("total_tests_per_thousand")),
					 Integer.parseInt(rec.get("total_cases").equals("")?"-1":rec.get("total_cases")),
					 Float.parseFloat(rec.get("total_cases_per_million").equals("")?"-1":rec.get("total_cases_per_million")),
					 Integer.parseInt(rec.get("total_deaths").equals("")?"-1":rec.get("total_deaths")),
					 Float.parseFloat(rec.get("total_deaths_per_million").equals("")?"-1":rec.get("total_deaths_per_million")));
			 
			 cases.add(_case);
			 countries.add(_country);
		 }
	 }
}