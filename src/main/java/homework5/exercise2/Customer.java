package homework5.exercise2;

public class Customer {
    //Attributes
    private Profile profile;
    private int id;

    //Constructor
    public Customer(Profile profile, int id) throws InvalidCustomerException {
        setProfile(profile);
        setId(id);
    }

    //Getters
    public Profile getProfile() {
        return profile;
    }
    public int getId() {
        return id;
    }

    //Setters
    public void setProfile(Profile profile) throws InvalidCustomerException {
        if(profile == null) {
            throw new InvalidCustomerException("Profile cannot be null");
        }
        this.profile = profile;
    }
    public void setId(int id) throws InvalidCustomerException {
        if(id < 0) {
            throw new InvalidCustomerException("ID must be a positive integer");
        }
        this.id = id;
    }
}
