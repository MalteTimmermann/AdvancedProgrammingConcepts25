package homework2.exercise3;

public class Mail {
    //Attributes
    private String sender;
    private String subject;
    private String message;
    private String datetime;
    private boolean read;

    //Constructor
    public Mail(String sender, String subject, String message, String datetime) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
        this.read = false;
    }

    public Mail(String sender, String subject, String message, String datetime, boolean read) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
        this.read = read;
    }

    //Methods
    public void markAsRead() {
        this.read = true;
    }

    public String printMail() {
        return subject + " from " + sender + " on " + datetime + ": " + message;
    }

    public String printMailDetails() {
        return read + " | " + subject + " | " + sender + " | " + datetime;
    }

    //Setters and Getters
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getDatetime() {
        return datetime;
    }
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
    public boolean getRead() {
        return read;
    }
    public void setRead(boolean read) {
        this.read = read;
    }
}
