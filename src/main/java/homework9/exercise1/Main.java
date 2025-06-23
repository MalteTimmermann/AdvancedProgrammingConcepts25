package homework9.exercise1;

public class Main {
    public static void main(String[] args) {
        CoursePhase phase = CoursePhase.ONGOING;
        System.out.println("Current course phase: " + phase);
        System.out.println("Message: " + phase.getMessage());

        phase = CoursePhase.FINISHED;
        System.out.println("Updated course phase: " + phase);
        System.out.println("Message: " + phase.getMessage());
    }
}
