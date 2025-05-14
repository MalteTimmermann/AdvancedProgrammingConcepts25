package homework5.exercise1;

public class Customer {
    //Attributes
    private Profile profile;
    private int id;

    //Constructor
    public Customer(Profile profile, int id) {
        this.profile = profile;
        this.id = id;
    }

    //Getters
    public Profile getProfile() {
        return profile;
    }
    public int getId() {
        return id;
    }

    //Setters
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    public void setId(int id) {
        this.id = id;
    }
}
