package week2.hw.hw2;

/**
 * Created by acer on 27.12.2015.
 */
public class Student extends Human {

    private String college;
    private int course;
    private String specialization;

    public Student(String name, String lastName, String sex, int age, String college, int course, String specialization) {
        super(name, lastName, sex, age);
        this.college = college;
        this.course = course;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" +
                "college='" + college + '\'' +
                ", course=" + course +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
