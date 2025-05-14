package homework5.exercise1;

public class Profile {
    //Attributes
    private ShippingInfo shippingInfo;

    //Constructor
    public Profile(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    //Getters
    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    //Setters
    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }
}
