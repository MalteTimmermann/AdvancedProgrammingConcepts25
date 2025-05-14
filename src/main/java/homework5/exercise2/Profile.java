package homework5.exercise2;

public class Profile {
    //Attributes
    private ShippingInfo shippingInfo;

    //Constructor
    public Profile(ShippingInfo shippingInfo) throws MissingShippingInfoException {
        setShippingInfo(shippingInfo);
    }

    //Getters
    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    //Setters
    public void setShippingInfo(ShippingInfo shippingInfo) throws MissingShippingInfoException {
        if (shippingInfo == null) {
            throw new MissingShippingInfoException("Shipping info cannot be null");
        }
        this.shippingInfo = shippingInfo;
    }
}
