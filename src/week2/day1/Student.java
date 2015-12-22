package week2.day1;

/**
 * Created by acer on 21.12.2015.
 */
public class Student extends Human {

    private String university;
    private int course;
    private String cpech;

    public Student(String name, String lastName, int age, boolean sex, String university, int course, String cpech) {
        super(name, lastName, age, sex);
        this.university = university;
        this.course = course;
        this.cpech = cpech;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getCpech() {
        return cpech;
    }

    public void setCpech(String cpech) {
        this.cpech = cpech;
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", course=" + course +
                ", cpech='" + cpech + '\'' +
                '}' + super.toString();
    }
}
