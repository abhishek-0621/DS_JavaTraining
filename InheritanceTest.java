
public class InheritanceTest {

	public static void main(String[] args) {
		City c1 = new City(500,"Pune");
		Country country1=new Country(500,"Pune",10000,"India",200000);
		Continent continent1=new Continent(500,"Pune",10000,"India",2000000,10000000,"Asia",4000000);
		System.out.println(c1);
		System.out.println(country1);
		System.out.println(continent1);

	}

}

class City
{
	int cityArea;
	String cityName;
	City(){};
	public City(int cityArea, String cityName) {
		super();
		this.cityArea = cityArea;
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "City [cityArea=" + cityArea + ", cityName=" + cityName + "]";
	}
	
	void print() {
		System.out.println());
	}
	
	
}

class Country extends City
{
	int countryArea;
	String countryName;
	int countryPopulation;
	Country(){};
	public Country(int cityArea, String cityName, int countryArea, String countryName, int countryPopulation) {
		super(cityArea, cityName);
		this.countryArea = countryArea;
		this.countryName = countryName;
		this.countryPopulation = countryPopulation;
	}
	@Override
	public String toString() {
		return "Country [cityArea=" + cityArea + ", cityName=" + cityName + ", toString()=" + super.toString()
				+ ", countryArea=" + countryArea + ", countryName=" + countryName + ", countryPopulation="
				+ countryPopulation + "]";
	}
	void printCountry()
	{
		System.out.println();
	}
	
	
}

class Continent extends Country
{
	int continentArea;
	String continentName;
	int continentPopulation;
	Continent(){};
	public Continent(int cityArea, String cityName, int countryArea, String countryName, int countryPopulation,
			int continentArea, String continentName, int continentPopulation) {
		super(cityArea, cityName, countryArea, countryName, countryPopulation);
		this.continentArea = continentArea;
		this.continentName = continentName;
		this.continentPopulation = continentPopulation;
	}
	@Override
	public String toString() {
		return "Continent [countryArea=" + countryArea + ", countryName=" + countryName + ", countryPopulation="
				+ countryPopulation + ", cityArea=" + cityArea + ", cityName=" + cityName + ", toString()="
			 + ", continentArea=" + continentArea + ", continentName=" + continentName
				+ ", continentPopulation=" + continentPopulation + "]";
	}
	
	
	
}
