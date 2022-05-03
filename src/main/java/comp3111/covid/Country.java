package comp3111.covid;

/**
 * Class Country
 * @author chleungba, tsehowang2
 *
 */
public class Country {
	private String iso_code;
	private String date;
	private String continent;
	private String location;
	private float reproduction_rate;
	private String tests_units;
	private float population_density;
	private float median_age;
	private float aged_65_older;
	private float aged_70_older;
	private float gdp_per_capita;
	private float extreme_poverty;
	private float cardiovasc_death_rate;
	private float diabetes_prevalence;
	private float female_smokers;
	private float male_smokers;
	private float life_expectancy;
	private float handwashing_facilities;
	private float human_development_index;
	private float excess_mortality;
	private long population;
	private float stringency_index;
	private float positive_rate;
	private int people_fully_vaccinated;
	private float people_fully_vaccinated_per_hundred;
	private int people_vaccinated;
	private float people_vaccinated_per_hundred;
	private long total_vaccinations;
	private float total_vaccinations_per_hundred;
	private int total_tests;
	private float total_tests_per_thousand;
	private int total_cases;
	private float total_cases_per_million;
	private int total_deaths;
	private float total_deaths_per_million;
	
	public Country(String iso_code,String date,String continent,String location,float reproduction_rate,String tests_units,float population_density,float median_age,float aged_65_older,float aged_70_older,float gdp_per_capita,
			float extreme_poverty,float cardiovasc_death_rate,float diabetes_prevalence,float female_smokers,float male_smokers,float life_expectancy,float handwashing_facilities,float human_development_index,float excess_mortality,
			long population,float stringency_index,float positive_rate,int people_fully_vaccinated,float people_fully_vaccinated_per_hundred,int people_vaccinated,float people_vaccinated_per_hundred,long total_vaccinations, 
			float total_vaccinations_per_hundred,int total_tests,float total_tests_per_thousand,int total_cases,float total_cases_per_million,int total_deaths,float total_deaths_per_million)
	{
		this.setIso_code(iso_code);
		this.setDate(date);
		this.setContinent(continent);
		this.setLocation(location);
		this.setReproduction_rate(reproduction_rate);
		this.setTests_units(tests_units);
		this.setPopulation_density(population_density);
		this.setMedian_age(median_age);
		this.setAged_65_older(aged_65_older);
		this.setAged_70_older(aged_70_older);
		this.setGdp_per_capita(gdp_per_capita);
		this.setExtreme_poverty(extreme_poverty);
		this.setCardiovasc_death_rate(cardiovasc_death_rate);
		this.setDiabetes_prevalence(diabetes_prevalence);
		this.setFemale_smokers(female_smokers);
		this.setMale_smokers(male_smokers);
		this.setLife_expectancy(life_expectancy);
		this.setHandwashing_facilities(handwashing_facilities);
		this.setHuman_development_index(human_development_index);
		this.setExcess_mortality(excess_mortality);
		this.setPopulation(population);
		this.setStringency_index(stringency_index);
		this.setPositive_rate(positive_rate);
		this.setPeople_fully_vaccinated(people_fully_vaccinated);
		this.setPeople_fully_vaccinated_per_hundred(people_fully_vaccinated_per_hundred);
		this.setPeople_vaccinated(people_vaccinated);
		this.setPeople_vaccinated_per_hundred(people_vaccinated_per_hundred);
		this.setTotal_vaccinations(total_vaccinations);
		this.setTotal_vaccinations_per_hundred(total_vaccinations_per_hundred);
		this.setTotal_tests(total_tests);
		this.setTotal_tests_per_thousand(total_tests_per_thousand);
		this.setTotal_cases(total_cases);
		this.setTotal_cases_per_million(total_cases_per_million);
		this.setTotal_deaths(total_deaths);
		this.setTotal_deaths_per_million(total_deaths_per_million);
	}

	public String getIso_code() {
		return iso_code;
	}

	public void setIso_code(String iso_code) {
		this.iso_code = iso_code;
	}	
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getReproduction_rate() {
		return reproduction_rate;
	}

	public void setReproduction_rate(float reproduction_rate) {
		this.reproduction_rate = reproduction_rate;
	}

	public String getTests_units() {
		return tests_units;
	}

	public void setTests_units(String tests_units) {
		this.tests_units = tests_units;
	}

	public float getPopulation_density() {
		return population_density;
	}

	public void setPopulation_density(float population_density) {
		this.population_density = population_density;
	}

	public float getMedian_age() {
		return median_age;
	}

	public void setMedian_age(float median_age) {
		this.median_age = median_age;
	}

	public float getAged_65_older() {
		return aged_65_older;
	}

	public void setAged_65_older(float aged_65_older) {
		this.aged_65_older = aged_65_older;
	}

	public float getAged_70_older() {
		return aged_70_older;
	}

	public void setAged_70_older(float aged_70_older) {
		this.aged_70_older = aged_70_older;
	}

	public float getGdp_per_capita() {
		return gdp_per_capita;
	}

	public void setGdp_per_capita(float gdp_per_capita) {
		this.gdp_per_capita = gdp_per_capita;
	}

	public float getExtreme_poverty() {
		return extreme_poverty;
	}

	public void setExtreme_poverty(float extreme_poverty) {
		this.extreme_poverty = extreme_poverty;
	}

	public float getCardiovasc_death_rate() {
		return cardiovasc_death_rate;
	}

	public void setCardiovasc_death_rate(float cardiovasc_death_rate) {
		this.cardiovasc_death_rate = cardiovasc_death_rate;
	}

	public float getDiabetes_prevalence() {
		return diabetes_prevalence;
	}

	public void setDiabetes_prevalence(float diabetes_prevalence) {
		this.diabetes_prevalence = diabetes_prevalence;
	}

	public float getFemale_smokers() {
		return female_smokers;
	}

	public void setFemale_smokers(float female_smokers) {
		this.female_smokers = female_smokers;
	}

	public float getMale_smokers() {
		return male_smokers;
	}

	public void setMale_smokers(float male_smokers) {
		this.male_smokers = male_smokers;
	}

	public float getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(float life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public float getHandwashing_facilities() {
		return handwashing_facilities;
	}

	public void setHandwashing_facilities(float handwashing_facilities) {
		this.handwashing_facilities = handwashing_facilities;
	}

	public float getHuman_development_index() {
		return human_development_index;
	}

	public void setHuman_development_index(float human_development_index) {
		this.human_development_index = human_development_index;
	}

	public float getExcess_mortality() {
		return excess_mortality;
	}

	public void setExcess_mortality(float excess_mortality) {
		this.excess_mortality = excess_mortality;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public float getStringency_index() {
		return stringency_index;
	}

	public void setStringency_index(float stringency_index) {
		this.stringency_index = stringency_index;
	}

	public float getPositive_rate() {
		return positive_rate;
	}

	public void setPositive_rate(float positive_rate) {
		this.positive_rate = positive_rate;
	}

	public int getPeople_fully_vaccinated() {
		return people_fully_vaccinated;
	}

	public void setPeople_fully_vaccinated(int people_fully_vaccinated) {
		this.people_fully_vaccinated = people_fully_vaccinated;
	}

	public float getPeople_fully_vaccinated_per_hundred() {
		return people_fully_vaccinated_per_hundred;
	}

	public void setPeople_fully_vaccinated_per_hundred(float people_fully_vaccinated_per_hundred) {
		this.people_fully_vaccinated_per_hundred = people_fully_vaccinated_per_hundred;
	}

	public int getPeople_vaccinated() {
		return people_vaccinated;
	}

	public void setPeople_vaccinated(int people_vaccinated) {
		this.people_vaccinated = people_vaccinated;
	}

	public float getPeople_vaccinated_per_hundred() {
		return people_vaccinated_per_hundred;
	}

	public void setPeople_vaccinated_per_hundred(float people_vaccinated_per_hundred) {
		this.people_vaccinated_per_hundred = people_vaccinated_per_hundred;
	}

	public long getTotal_vaccinations() {
		return total_vaccinations;
	}

	public void setTotal_vaccinations(long total_vaccinations) {
		this.total_vaccinations = total_vaccinations;
	}

	public float getTotal_vaccinations_per_hundred() {
		return total_vaccinations_per_hundred;
	}

	public void setTotal_vaccinations_per_hundred(float total_vaccinations_per_hundred) {
		this.total_vaccinations_per_hundred = total_vaccinations_per_hundred;
	}

	public int getTotal_tests() {
		return total_tests;
	}

	public void setTotal_tests(int total_tests) {
		this.total_tests = total_tests;
	}

	public float getTotal_tests_per_thousand() {
		return total_tests_per_thousand;
	}

	public void setTotal_tests_per_thousand(float total_tests_per_thousand) {
		this.total_tests_per_thousand = total_tests_per_thousand;
	}

	public int getTotal_cases() {
		return total_cases;
	}

	public void setTotal_cases(int total_cases) {
		this.total_cases = total_cases;
	}

	public float getTotal_cases_per_million() {
		return total_cases_per_million;
	}

	public void setTotal_cases_per_million(float total_cases_per_million) {
		this.total_cases_per_million = total_cases_per_million;
	}

	public int getTotal_deaths() {
		return total_deaths;
	}

	public void setTotal_deaths(int total_deaths) {
		this.total_deaths = total_deaths;
	}

	public float getTotal_deaths_per_million() {
		return total_deaths_per_million;
	}

	public void setTotal_deaths_per_million(float total_deaths_per_million) {
		this.total_deaths_per_million = total_deaths_per_million;
	}
	
}
