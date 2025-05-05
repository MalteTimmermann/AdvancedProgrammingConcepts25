package homework2.exercise1;

public class Book extends Publication{
    //Attributes
    private String author;

    //Methods
    @Override
    public String getInfo() {
        return super.getInfo() + ", by " + author;
    }

    //Setters and Getters
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
