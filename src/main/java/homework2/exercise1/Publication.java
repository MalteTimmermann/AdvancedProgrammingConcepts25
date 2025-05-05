package homework2.exercise1;

public class Publication {
    //Attributes
    private String title;
    private String year;

    //Methods
    public String getInfo() {
        return title + ", published in " + year;
    }

    //Setters and Getters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
}
