package comp3111.covid;

public class Case {

	private String iso_code;
	private int new_cases;
	private float new_cases_per_million;
	private float new_cases_smoothed;
	private float new_cases_smoothed_per_million;
	private int new_deaths;
	private float new_deaths_per_million;
	private float new_deaths_smoothed;
	private float new_deaths_smoothed_per_million;
	private float tests_per_case;
	private int new_tests;
	private float new_tests_per_thousand;
	private float new_tests_smoothed;
	private float new_tests_smoothed_per_thousand;
	private int new_vaccinations;
	private float new_vaccinations_smoothed;
	private float new_vaccinations_smoothed_per_million;
	private int icu_patients;
	private float icu_patients_per_million;
	private float weekly_icu_admissions;
	private float weekly_icu_admissions_per_million;
	private int hosp_patients;
	private float hosp_patients_per_million;
	private float weekly_hosp_admissions;
	private float weekly_hosp_admissions_per_million;
	private float hospital_beds_per_thousand;
	
	public Case(String iso_code, int new_cases, float new_cases_per_million, float new_cases_smoothed, float new_cases_smoothed_per_million, int new_deaths, float new_deaths_per_million,
			float new_deaths_smoothed, float new_deaths_smoothed_per_million, float tests_per_case, int new_tests, float new_tests_per_thousand, float new_tests_smoothed, float new_tests_smoothed_per_thousand,
			int new_vaccinations, float new_vaccinations_smoothed, float new_vaccinations_smoothed_per_million, int icu_patients, float icu_patients_per_million, float weekly_icu_admissions, float weekly_icu_admissions_per_million,
			int hosp_patients, float hosp_patients_per_million, float weekly_hosp_admissions, float weekly_hosp_admissions_per_million, float hospital_beds_per_thousand)
	{
		this.setIso_code(iso_code);
		this.setNew_cases(new_cases);
		this.setNew_cases_per_million(new_cases_per_million);
		this.setNew_cases_smoothed(new_cases_smoothed);
		this.setNew_cases_smoothed_per_million(new_cases_smoothed_per_million);
		this.setNew_deaths(new_deaths);
		this.setNew_deaths_per_million(new_deaths_per_million);
		this.setNew_deaths_smoothed(new_deaths_smoothed);
		this.setNew_deaths_smoothed_per_million(new_deaths_smoothed_per_million);
		this.setTests_per_case(tests_per_case);
		this.setNew_tests(new_tests);
		this.setNew_tests_per_thousand(new_tests_per_thousand);
		this.setNew_tests_smoothed(new_tests_smoothed);
		this.setNew_tests_smoothed_per_thousand(new_tests_smoothed_per_thousand);
		this.setNew_vaccinations(new_vaccinations);
		this.setNew_vaccinations_smoothed(new_vaccinations_smoothed);
		this.setNew_vaccinations_smoothed_per_million(new_vaccinations_smoothed_per_million);
		this.setIcu_patients(icu_patients);
		this.setIcu_patients_per_million(icu_patients_per_million);
		this.setWeekly_icu_admissions(weekly_icu_admissions);
		this.setWeekly_icu_admissions_per_million(weekly_icu_admissions_per_million);
		this.setHosp_patients(hosp_patients);
		this.setHosp_patients_per_million(hosp_patients_per_million);
		this.setWeekly_hosp_admissions(weekly_hosp_admissions);
		this.setWeekly_hosp_admissions_per_million(weekly_hosp_admissions_per_million);
		this.setHospital_beds_per_thousand(hospital_beds_per_thousand);
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

	public float getNew_cases_per_million() {
		return new_cases_per_million;
	}

	public void setNew_cases_per_million(float new_cases_per_million) {
		this.new_cases_per_million = new_cases_per_million;
	}

	public float getNew_cases_smoothed() {
		return new_cases_smoothed;
	}

	public void setNew_cases_smoothed(float new_cases_smoothed) {
		this.new_cases_smoothed = new_cases_smoothed;
	}

	public float getNew_cases_smoothed_per_million() {
		return new_cases_smoothed_per_million;
	}

	public void setNew_cases_smoothed_per_million(float new_cases_smoothed_per_million) {
		this.new_cases_smoothed_per_million = new_cases_smoothed_per_million;
	}

	public int getNew_deaths() {
		return new_deaths;
	}

	public void setNew_deaths(int new_deaths) {
		this.new_deaths = new_deaths;
	}

	public float getNew_deaths_per_million() {
		return new_deaths_per_million;
	}

	public void setNew_deaths_per_million(float new_deaths_per_million) {
		this.new_deaths_per_million = new_deaths_per_million;
	}

	public float getNew_deaths_smoothed() {
		return new_deaths_smoothed;
	}

	public void setNew_deaths_smoothed(float new_deaths_smoothed) {
		this.new_deaths_smoothed = new_deaths_smoothed;
	}

	public float getNew_deaths_smoothed_per_million() {
		return new_deaths_smoothed_per_million;
	}

	public void setNew_deaths_smoothed_per_million(float new_deaths_smoothed_per_million) {
		this.new_deaths_smoothed_per_million = new_deaths_smoothed_per_million;
	}

	public float getTests_per_case() {
		return tests_per_case;
	}

	public void setTests_per_case(float tests_per_case) {
		this.tests_per_case = tests_per_case;
	}

	public int getNew_tests() {
		return new_tests;
	}

	public void setNew_tests(int new_tests) {
		this.new_tests = new_tests;
	}

	public float getNew_tests_per_thousand() {
		return new_tests_per_thousand;
	}

	public void setNew_tests_per_thousand(float new_tests_per_thousand) {
		this.new_tests_per_thousand = new_tests_per_thousand;
	}

	public float getNew_tests_smoothed() {
		return new_tests_smoothed;
	}

	public void setNew_tests_smoothed(float new_tests_smoothed) {
		this.new_tests_smoothed = new_tests_smoothed;
	}

	public float getNew_tests_smoothed_per_thousand() {
		return new_tests_smoothed_per_thousand;
	}

	public void setNew_tests_smoothed_per_thousand(float new_tests_smoothed_per_thousand) {
		this.new_tests_smoothed_per_thousand = new_tests_smoothed_per_thousand;
	}

	public int getNew_vaccinations() {
		return new_vaccinations;
	}

	public void setNew_vaccinations(int new_vaccinations) {
		this.new_vaccinations = new_vaccinations;
	}

	public float getNew_vaccinations_smoothed() {
		return new_vaccinations_smoothed;
	}

	public void setNew_vaccinations_smoothed(float new_vaccinations_smoothed) {
		this.new_vaccinations_smoothed = new_vaccinations_smoothed;
	}

	public float getNew_vaccinations_smoothed_per_million() {
		return new_vaccinations_smoothed_per_million;
	}

	public void setNew_vaccinations_smoothed_per_million(float new_vaccinations_smoothed_per_million) {
		this.new_vaccinations_smoothed_per_million = new_vaccinations_smoothed_per_million;
	}

	public int getIcu_patients() {
		return icu_patients;
	}

	public void setIcu_patients(int icu_patients) {
		this.icu_patients = icu_patients;
	}

	public float getIcu_patients_per_million() {
		return icu_patients_per_million;
	}

	public void setIcu_patients_per_million(float icu_patients_per_million) {
		this.icu_patients_per_million = icu_patients_per_million;
	}

	public float getWeekly_icu_admissions() {
		return weekly_icu_admissions;
	}

	public void setWeekly_icu_admissions(float weekly_icu_admissions) {
		this.weekly_icu_admissions = weekly_icu_admissions;
	}

	public float getWeekly_icu_admissions_per_million() {
		return weekly_icu_admissions_per_million;
	}

	public void setWeekly_icu_admissions_per_million(float weekly_icu_admissions_per_million) {
		this.weekly_icu_admissions_per_million = weekly_icu_admissions_per_million;
	}

	public int getHosp_patients() {
		return hosp_patients;
	}

	public void setHosp_patients(int hosp_patients) {
		this.hosp_patients = hosp_patients;
	}

	public float getHosp_patients_per_million() {
		return hosp_patients_per_million;
	}

	public void setHosp_patients_per_million(float hosp_patients_per_million) {
		this.hosp_patients_per_million = hosp_patients_per_million;
	}

	public float getWeekly_hosp_admissions() {
		return weekly_hosp_admissions;
	}

	public void setWeekly_hosp_admissions(float weekly_hosp_admissions) {
		this.weekly_hosp_admissions = weekly_hosp_admissions;
	}

	public float getWeekly_hosp_admissions_per_million() {
		return weekly_hosp_admissions_per_million;
	}

	public void setWeekly_hosp_admissions_per_million(float weekly_hosp_admissions_per_million) {
		this.weekly_hosp_admissions_per_million = weekly_hosp_admissions_per_million;
	}

	public float getHospital_beds_per_thousand() {
		return hospital_beds_per_thousand;
	}

	public void setHospital_beds_per_thousand(float hospital_beds_per_thousand) {
		this.hospital_beds_per_thousand = hospital_beds_per_thousand;
	}
	
}
