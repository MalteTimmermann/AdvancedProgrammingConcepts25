package homework2.exercise1;

public class exercise1 {
    public static void main(String[] args) {
        Textbook textbook = new Textbook();

        textbook.setTitle("Introduction to Java");
        textbook.setYear("2023");
        textbook.setAuthor("John Doe");
        textbook.setSubject("Computer Science");

        System.out.println(textbook.getInfo());
    }

}
