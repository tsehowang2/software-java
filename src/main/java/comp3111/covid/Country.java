package comp3111.covid;

public class Country {
	private String iso_code;
	private String continent;
	private String location;
	private float reproduction_rate;
	private float tests_units;
	private float population_density;
	private int median_age;
	private int aged_65_older;
	private int aged_70_older;
	private int gdp_per_capita;
	private int extreme_poverty;
	private float cardiovasc_death_rate;
	private int diabetes_prevalence;
	private int female_smokers;
	private int male_smokers;
	private float life_expectancy;
	private int handwashing_facilities;
	private int human_development_index;
	private int excess_mortality;
	private int population;
	private int stringency_index;
	private float positive_rate;
	private int people_fully_vaccinated;
	private int people_fully_vaccinated_per_hundred;
	private int people_vaccinated;
	private int people_vaccinated_per_hundred;
	private int total_vaccinations;
	private int total_vaccinations_per_hundred;
	private int total_tests;
	private int total_tests_per_thousand;
	private int total_cases;
	private int total_cases_per_million;
	private int total_deaths;
	private int total_deaths_per_million;
	
	public Country(String iso_code,String continent,String location,float reproduction_rate,float tests_units,float population_density,int median_age,int aged_65_older,int aged_70_older,int gdp_per_capita,
	int extreme_poverty,float cardiovasc_death_rate,int diabetes_prevalence,int female_smokers,int male_smokers,float life_expectancy,int handwashing_facilities,int human_development_index,int excess_mortality,
	int population,int stringency_index,float positive_rate,int people_fully_vaccinated,int people_fully_vaccinated_per_hundred,int people_vaccinated,int people_vaccinated_per_hundred,int total_vaccinations,
	int total_vaccinations_per_hundred,int total_tests,int total_tests_per_thousand,int total_cases,int total_cases_per_million,int total_deaths,int total_deaths_per_million)
	{
		this.setIso_code(iso_code);
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

	public float getTests_units() {
		return tests_units;
	}

	public void setTests_units(float tests_units) {
		this.tests_units = tests_units;
	}

	public float getPopulation_density() {
		return population_density;
	}

	public void setPopulation_density(float population_density) {
		this.population_density = population_density;
	}

	public int getMedian_age() {
		return median_age;
	}

	public void setMedian_age(int median_age) {
		this.median_age = median_age;
	}

	public int getAged_65_older() {
		return aged_65_older;
	}

	public void setAged_65_older(int aged_65_older) {
		this.aged_65_older = aged_65_older;
	}

	public int getAged_70_older() {
		return aged_70_older;
	}

	public void setAged_70_older(int aged_70_older) {
		this.aged_70_older = aged_70_older;
	}

	public int getGdp_per_capita() {
		return gdp_per_capita;
	}

	public void setGdp_per_capita(int gdp_per_capita) {
		this.gdp_per_capita = gdp_per_capita;
	}

	public int getExtreme_poverty() {
		return extreme_poverty;
	}

	public void setExtreme_poverty(int extreme_poverty) {
		this.extreme_poverty = extreme_poverty;
	}

	public float getCardiovasc_death_rate() {
		return cardiovasc_death_rate;
	}

	public void setCardiovasc_death_rate(float cardiovasc_death_rate) {
		this.cardiovasc_death_rate = cardiovasc_death_rate;
	}

	public int getDiabetes_prevalence() {
		return diabetes_prevalence;
	}

	public void setDiabetes_prevalence(int diabetes_prevalence) {
		this.diabetes_prevalence = diabetes_prevalence;
	}

	public int getFemale_smokers() {
		return female_smokers;
	}

	public void setFemale_smokers(int female_smokers) {
		this.female_smokers = female_smokers;
	}

	public int getMale_smokers() {
		return male_smokers;
	}

	public void setMale_smokers(int male_smokers) {
		this.male_smokers = male_smokers;
	}

	public float getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(float life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public int getHandwashing_facilities() {
		return handwashing_facilities;
	}

	public void setHandwashing_facilities(int handwashing_facilities) {
		this.handwashing_facilities = handwashing_facilities;
	}

	public int getHuman_development_index() {
		return human_development_index;
	}

	public void setHuman_development_index(int human_development_index) {
		this.human_development_index = human_development_index;
	}

	public int getExcess_mortality() {
		return excess_mortality;
	}

	public void setExcess_mortality(int excess_mortality) {
		this.excess_mortality = excess_mortality;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getStringency_index() {
		return stringency_index;
	}

	public void setStringency_index(int stringency_index) {
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

	public int getPeople_fully_vaccinated_per_hundred() {
		return people_fully_vaccinated_per_hundred;
	}

	public void setPeople_fully_vaccinated_per_hundred(int people_fully_vaccinated_per_hundred) {
		this.people_fully_vaccinated_per_hundred = people_fully_vaccinated_per_hundred;
	}

	public int getPeople_vaccinated() {
		return people_vaccinated;
	}

	public void setPeople_vaccinated(int people_vaccinated) {
		this.people_vaccinated = people_vaccinated;
	}

	public int getPeople_vaccinated_per_hundred() {
		return people_vaccinated_per_hundred;
	}

	public void setPeople_vaccinated_per_hundred(int people_vaccinated_per_hundred) {
		this.people_vaccinated_per_hundred = people_vaccinated_per_hundred;
	}

	public int getTotal_vaccinations() {
		return total_vaccinations;
	}

	public void setTotal_vaccinations(int total_vaccinations) {
		this.total_vaccinations = total_vaccinations;
	}

	public int getTotal_vaccinations_per_hundred() {
		return total_vaccinations_per_hundred;
	}

	public void setTotal_vaccinations_per_hundred(int total_vaccinations_per_hundred) {
		this.total_vaccinations_per_hundred = total_vaccinations_per_hundred;
	}

	public int getTotal_tests() {
		return total_tests;
	}

	public void setTotal_tests(int total_tests) {
		this.total_tests = total_tests;
	}

	public int getTotal_tests_per_thousand() {
		return total_tests_per_thousand;
	}

	public void setTotal_tests_per_thousand(int total_tests_per_thousand) {
		this.total_tests_per_thousand = total_tests_per_thousand;
	}

	public int getTotal_cases() {
		return total_cases;
	}

	public void setTotal_cases(int total_cases) {
		this.total_cases = total_cases;
	}

	public int getTotal_cases_per_million() {
		return total_cases_per_million;
	}

	public void setTotal_cases_per_million(int total_cases_per_million) {
		this.total_cases_per_million = total_cases_per_million;
	}

	public int getTotal_deaths() {
		return total_deaths;
	}

	public void setTotal_deaths(int total_deaths) {
		this.total_deaths = total_deaths;
	}

	public int getTotal_deaths_per_million() {
		return total_deaths_per_million;
	}

	public void setTotal_deaths_per_million(int total_deaths_per_million) {
		this.total_deaths_per_million = total_deaths_per_million;
	}
	
}
