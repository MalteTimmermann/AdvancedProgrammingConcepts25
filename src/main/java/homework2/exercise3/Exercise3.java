package homework2.exercise3;

public class Exercise3 {
    public static void main(String[] args){
        Mail mail1 = new Mail("Alice", "Meeting", "Let's meet at 10 AM", "2023-10-01 09:00");
        Mail mail2 = new Mail("Bob", "Project Update", "The project is on track", "2023-10-01 10:00", true);
        Mail mail3 = new Mail("Charlie", "Lunch", "Do you want to grab lunch?", "2023-10-01 11:00");
        Mail mail4 = new Mail("David", "Dinner", "Let's have dinner at 7 PM", "2023-10-01 12:00");

        Inbox inbox = new Inbox();
        inbox.addEmail(mail1);
        inbox.addEmail(mail2);
        inbox.addEmail(mail3);
        inbox.addEmail(mail4);

        System.out.println("Total unread emails: " + inbox.countUnread());
        System.out.println("");
        inbox.printInbox();
        System.out.println("");
        inbox.open(2);
        inbox.open(1);
        System.out.println("");
        System.out.println("Total unread emails: " + inbox.countUnread());
    }
}
