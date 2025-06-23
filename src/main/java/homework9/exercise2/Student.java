package homework9.exercise2;

public class Student {
    private String name;
    private int year;
    private String major;

    public interface StudentFormatter {
        String format(Student s);
    }

    StudentFormatter simpleFormatter = s -> "Student: " + s.getName() + ", Year: " + s.getYear();
    StudentFormatter detailedFormatter = s -> s.getName() + " studies " + s.getMajor() + " in Year " + s.getYear();


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
