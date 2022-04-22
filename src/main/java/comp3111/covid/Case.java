package comp3111.covid;

public class Case {
	private String iso_code;
	private int new_cases;
	private int new_cases_per_million;
	private int new_cases_smoothed;
	private int new_cases_smoothed_per_million;
	private int new_deaths;
	private int new_deaths_per_million;
	private int new_deaths_smoothed;
	private int new_deaths_smoothed_per_million;
	private int tests_per_case;
	private int new_tests;
	private int new_tests_per_thousand;
	private int new_tests_smoothed;
	private int new_tests_smoothed_per_thousand;
	private int new_vaccinations;
	private int new_vaccinations_smoothed;
	private int new_vaccinations_smoothed_per_million;
	private int icu_patients;
	private int icu_patients_per_million;
	private int weekly_icu_admissions;
	private int weekly_icu_admissions_per_million;
	private int hosp_patients;
	private int hosp_patients_per_million;
	private int weekly_hosp_admissions;
	private int weekly_hosp_admissions_per_million;
	private int hospital_beds_per_thousand;
	
	public Case(String iso_code, int new_cases, int new_cases_per_million, int new_cases_smoothed, int new_cases_smoothed_per_million, int new_deaths, int new_deaths_per_million,
			int new_deaths_smoothed, int new_deaths_smoothed_per_million, int tests_per_case, int new_tests, int new_tests_per_thousand, int new_tests_smoothed, int new_tests_smoothed_per_thousand,
			int new_vaccinations, int new_vaccinations_smoothed, int new_vaccinations_smoothed_per_million, int icu_patients, int icu_patients_per_million, int weekly_icu_admissions, int weekly_icu_admissions_per_million,
			int hosp_patients, int hosp_patients_per_million, int weekly_hosp_admissions, int weekly_hosp_admissions_per_million, int hospital_beds_per_thousand)
	{
		this.iso_code = iso_code;
		this.new_cases = new_cases;
		this.new_cases_per_million = new_cases_per_million;
		this.new_cases_smoothed = new_cases_smoothed;
		this.new_cases_smoothed_per_million = new_cases_smoothed_per_million;
		this.new_deaths = new_deaths;
		this.new_deaths_per_million = new_deaths_per_million;
		this.new_deaths_smoothed = new_deaths_smoothed;
		this.new_deaths_smoothed_per_million = new_deaths_smoothed_per_million;
		this.tests_per_case = tests_per_case;
		this.new_tests = new_tests;
		this.new_tests_per_thousand = new_tests_per_thousand;
		this.new_tests_smoothed = new_tests_smoothed;
		this.new_tests_smoothed_per_thousand = new_tests_smoothed_per_thousand;
		this.new_vaccinations = new_vaccinations;
		this.new_vaccinations_smoothed = new_vaccinations_smoothed;
		this.new_vaccinations_smoothed_per_million = new_vaccinations_smoothed_per_million;
		this.icu_patients = icu_patients;
		this.icu_patients_per_million = icu_patients_per_million;
		this.weekly_icu_admissions = weekly_icu_admissions;
		this.weekly_icu_admissions_per_million = weekly_icu_admissions_per_million;
		this.hosp_patients = hosp_patients;
		this.hosp_patients_per_million = hosp_patients_per_million;
		this.weekly_hosp_admissions = weekly_hosp_admissions;
		this.weekly_hosp_admissions_per_million = weekly_hosp_admissions_per_million;
		this.hospital_beds_per_thousand = hospital_beds_per_thousand;
	}

	public String getIso_code() {
		return iso_code;
	}

	public void setIso_code(String iso_code) {
		this.iso_code = iso_code;
	}

	public int getNew_cases() {
		return new_cases;
	}

	public void setNew_cases(int new_cases) {
		this.new_cases = new_cases;
	}

	public int getNew_cases_per_million() {
		return new_cases_per_million;
	}

	public void setNew_cases_per_million(int new_cases_per_million) {
		this.new_cases_per_million = new_cases_per_million;
	}

	public int getNew_cases_smoothed() {
		return new_cases_smoothed;
	}

	public void setNew_cases_smoothed(int new_cases_smoothed) {
		this.new_cases_smoothed = new_cases_smoothed;
	}

	public int getNew_cases_smoothed_per_million() {
		return new_cases_smoothed_per_million;
	}

	public void setNew_cases_smoothed_per_million(int new_cases_smoothed_per_million) {
		this.new_cases_smoothed_per_million = new_cases_smoothed_per_million;
	}

	public int getNew_deaths() {
		return new_deaths;
	}

	public void setNew_deaths(int new_deaths) {
		this.new_deaths = new_deaths;
	}

	public int getNew_deaths_per_million() {
		return new_deaths_per_million;
	}

	public void setNew_deaths_per_million(int new_deaths_per_million) {
		this.new_deaths_per_million = new_deaths_per_million;
	}

	public int getNew_deaths_smoothed() {
		return new_deaths_smoothed;
	}

	public void setNew_deaths_smoothed(int new_deaths_smoothed) {
		this.new_deaths_smoothed = new_deaths_smoothed;
	}

	public int getNew_deaths_smoothed_per_million() {
		return new_deaths_smoothed_per_million;
	}

	public void setNew_deaths_smoothed_per_million(int new_deaths_smoothed_per_million) {
		this.new_deaths_smoothed_per_million = new_deaths_smoothed_per_million;
	}

	public int getTests_per_case() {
		return tests_per_case;
	}

	public void setTests_per_case(int tests_per_case) {
		this.tests_per_case = tests_per_case;
	}

	public int getNew_tests() {
		return new_tests;
	}

	public void setNew_tests(int new_tests) {
		this.new_tests = new_tests;
	}

	public int getNew_tests_per_thousand() {
		return new_tests_per_thousand;
	}

	public void setNew_tests_per_thousand(int new_tests_per_thousand) {
		this.new_tests_per_thousand = new_tests_per_thousand;
	}

	public int getNew_tests_smoothed() {
		return new_tests_smoothed;
	}

	public void setNew_tests_smoothed(int new_tests_smoothed) {
		this.new_tests_smoothed = new_tests_smoothed;
	}

	public int getNew_tests_smoothed_per_thousand() {
		return new_tests_smoothed_per_thousand;
	}

	public void setNew_tests_smoothed_per_thousand(int new_tests_smoothed_per_thousand) {
		this.new_tests_smoothed_per_thousand = new_tests_smoothed_per_thousand;
	}

	public int getNew_vaccinations() {
		return new_vaccinations;
	}

	public void setNew_vaccinations(int new_vaccinations) {
		this.new_vaccinations = new_vaccinations;
	}

	public int getNew_vaccinations_smoothed() {
		return new_vaccinations_smoothed;
	}

	public void setNew_vaccinations_smoothed(int new_vaccinations_smoothed) {
		this.new_vaccinations_smoothed = new_vaccinations_smoothed;
	}

	public int getNew_vaccinations_smoothed_per_million() {
		return new_vaccinations_smoothed_per_million;
	}

	public void setNew_vaccinations_smoothed_per_million(int new_vaccinations_smoothed_per_million) {
		this.new_vaccinations_smoothed_per_million = new_vaccinations_smoothed_per_million;
	}

	public int getIcu_patients() {
		return icu_patients;
	}

	public void setIcu_patients(int icu_patients) {
		this.icu_patients = icu_patients;
	}

	public int getIcu_patients_per_million() {
		return icu_patients_per_million;
	}

	public void setIcu_patients_per_million(int icu_patients_per_million) {
		this.icu_patients_per_million = icu_patients_per_million;
	}

	public int getWeekly_icu_admissions() {
		return weekly_icu_admissions;
	}

	public void setWeekly_icu_admissions(int weekly_icu_admissions) {
		this.weekly_icu_admissions = weekly_icu_admissions;
	}

	public int getWeekly_icu_admissions_per_million() {
		return weekly_icu_admissions_per_million;
	}

	public void setWeekly_icu_admissions_per_million(int weekly_icu_admissions_per_million) {
		this.weekly_icu_admissions_per_million = weekly_icu_admissions_per_million;
	}

	public int getHosp_patients() {
		return hosp_patients;
	}

	public void setHosp_patients(int hosp_patients) {
		this.hosp_patients = hosp_patients;
	}

	public int getHosp_patients_per_million() {
		return hosp_patients_per_million;
	}

	public void setHosp_patients_per_million(int hosp_patients_per_million) {
		this.hosp_patients_per_million = hosp_patients_per_million;
	}

	public int getWeekly_hosp_admissions() {
		return weekly_hosp_admissions;
	}

	public void setWeekly_hosp_admissions(int weekly_hosp_admissions) {
		this.weekly_hosp_admissions = weekly_hosp_admissions;
	}

	public int getWeekly_hosp_admissions_per_million() {
		return weekly_hosp_admissions_per_million;
	}

	public void setWeekly_hosp_admissions_per_million(int weekly_hosp_admissions_per_million) {
		this.weekly_hosp_admissions_per_million = weekly_hosp_admissions_per_million;
	}

	public int getHospital_beds_per_thousand() {
		return hospital_beds_per_thousand;
	}

	public void setHospital_beds_per_thousand(int hospital_beds_per_thousand) {
		this.hospital_beds_per_thousand = hospital_beds_per_thousand;
	}
	
}
