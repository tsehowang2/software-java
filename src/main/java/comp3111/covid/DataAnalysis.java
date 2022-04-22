package comp3111.covid;

import org.apache.commons.csv.*;
import edu.duke.*;
/**
 * 
 * Data Explorer on COVID-19
 * @author <a href=mailto:namkiu@ust.hk>Namkiu Chan</a>
 * @version	1.1
 * 
 */
public class DataAnalysis {
 
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
			 Case cases = new Case(rec.get("iso_code"), Integer.parseInt(rec.get("new_cases")), Integer.parseInt(rec.get("new_cases_per_million")), Float.parseFloat(rec.get("new_cases_smoothed")), Float.parseFloat(rec.get("new_cases_smoothed_per_million")),
					 Integer.parseInt(rec.get("new_deaths")), Integer.parseInt(rec.get("new_deaths_per_million")),Float.parseFloat(rec.get("new_deaths_smoothed")), Float.parseFloat(rec.get("new_deaths_smoothed_per_million")), Integer.parseInt(rec.get("tests_per_case")),
							 Integer.parseInt(rec.get("new_tests")), Integer.parseInt(rec.get("new_tests_per_thousand")), Integer.parseInt(rec.get("new_tests_smoothed")), Integer.parseInt(rec.get("new_tests_smoothed_per_thousand")),Integer.parseInt(rec.get("new_vaccinations")), Integer.parseInt(rec.get("new_vaccinations_smoothed")),
									 Integer.parseInt(rec.get("new_vaccinations_smoothed_per_million")), Integer.parseInt(rec.get("icu_patients")), Integer.parseInt(rec.get("icu_patients_per_million")), Integer.parseInt(rec.get("weekly_icu_admissions")), Integer.parseInt(rec.get("weekly_icu_admissions_per_million")),
											 Integer.parseInt(rec.get("hosp_patients")) , Integer.parseInt(rec.get("hosp_patients_per_million")), Integer.parseInt(rec.get("weekly_hosp_admissions")) , Integer.parseInt(rec.get("weekly_hosp_admissions_per_million")) , Integer.parseInt(rec.get("hospital_beds_per_thousand")));
			 System.out.print(cases);
		 }

	 }
 
}