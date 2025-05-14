package homework5.exercise1;

public class ShippingInfo {
    //Attributes
    private String city;
    private int zip;
    private String country;

    //Constructor
    public ShippingInfo(String city, int zip, String country) {
        this.city = city;
        this.zip = zip;
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
    public void setCity(String city) {
        this.city = city;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
