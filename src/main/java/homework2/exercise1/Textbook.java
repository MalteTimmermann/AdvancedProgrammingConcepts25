package homework2.exercise1;

public class Textbook extends Book{
    //Attributes
    private String subject;

    //Methods
    @Override
    public String getInfo() {
        return super.getInfo() + " Subject: " + subject;
    }

    //Setters and Getters
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
