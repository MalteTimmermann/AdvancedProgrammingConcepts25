package homework5.exercise2;

public class ShippingInfo {
    //Attributes
    private String city;
    private int zip;
    private String country;

    //Constructor
    public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException {
        setCity(city);
        setZip(zip);
        this.country = country;
    }

    //Getters
    public String getCity() {
        return city;
    }
    public int getZip() {
        return zip;
    }
    public String getCountry() {
        return country;
    }

    //Setters
    public void setCity(String city) throws InvalidShippingInfoException {
        if (city == null || city.isEmpty()) {
            throw new InvalidShippingInfoException("City cannot be null or empty");
        }
        this.city = city;
    }
    public void setZip(int zip) throws InvalidShippingInfoException {
        if(zip < 0) {
            throw new InvalidShippingInfoException("Zip code must be a positive integer");
        }
        this.zip = zip;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
