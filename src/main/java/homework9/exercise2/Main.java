package homework9.exercise2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setYear(2);
        student.setMajor("Computer Science");

        // Using simple formatter
        System.out.println(student.simpleFormatter.format(student));

        // Using detailed formatter
        System.out.println(student.detailedFormatter.format(student));
    }
}
