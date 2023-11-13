package EstoreApplication;

public class HomeAddress {
    private String cityName;
    private String countryName;
    private String houseNumber;
    private String street;
    private String state;

    public HomeAddress(String cityName, String countryName, String houseNumber, String street, String state ){
        this.cityName = cityName;
        this.countryName = countryName;
        this.houseNumber = houseNumber;
        this.street = street;
        this.state = state;

    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCountryName(String countryName){
        this.countryName = countryName;
    }
    public String getCountryName(){
        return countryName;
    }
    public void setHouseNumber(String houseNumber){
        this.houseNumber = houseNumber;
    }
    public String getHouseNumber(){
        return houseNumber;
    }
    public void setStreet(String street){

    }

}
