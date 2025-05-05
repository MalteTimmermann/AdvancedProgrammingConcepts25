package homework2.exercise3;

//Import
import java.util.ArrayList;
import java.util.List;

public class Inbox {
    //Attributes
    List<Mail> emails;

    //Constructor
    public Inbox() {
        this.emails = new ArrayList<>();
    }

    //Methods
    public void printInbox() {
        for (Mail email : emails) {
            System.out.println(email.printMailDetails());
        }
    }

    public void open(int index) {
        if (index >= 0 && index < emails.size()) {
            System.out.println(emails.get(index).printMail());
            emails.get(index).markAsRead();
        } else {
            System.out.println("Invalid email index.");
        }
    }

    public int countUnread() {
        int count = 0;
        for (Mail email : emails) {
            if (!email.getRead()) {
                count++;
            }
        }
        return count;
    }

    public void addEmail(Mail email) {
        this.emails.add(email);
    }
}
