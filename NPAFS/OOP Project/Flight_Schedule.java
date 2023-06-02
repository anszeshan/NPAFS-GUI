package nayya;

public class Flight_Schedule {
          
	private String cityName;             //declaration of private data members
	private String countryName;
	private String directionofCity;
	private String DirectionofCityLand;
	private String Arrivalcity;
        Flight_Schedule(String cityName, String countryName, String directionofCity, String DirectionofCityLand, String Arrivalcity){  //parametrized constructor
		   this.cityName = cityName;
		   this.countryName = countryName;
		   this.directionofCity = directionofCity;
		   this.DirectionofCityLand = DirectionofCityLand;
		   this.Arrivalcity = Arrivalcity;
	}

      //getters and setters
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getDirectionofCity() {
		return directionofCity;
	}
	public void setDirectionofCity(String directionofCity) {
		this.directionofCity = directionofCity;
	}
	public String getDirectionofCityLand() {
		return DirectionofCityLand;
	}
	public void setDirectionofCityLand(String directionofCityLand) {
		DirectionofCityLand = directionofCityLand;
	}
	public String getArrivalcity() {
		return Arrivalcity;
	}
	public void setArrivalcity(String arrivalcity) {
		Arrivalcity = arrivalcity;
	}
	Flight_Schedule(){                    //default constructor
		
	}
}
