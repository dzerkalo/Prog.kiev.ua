package week2.hw.hw2;

import java.util.Arrays;

/**
 * Created by acer on 27.12.2015.
 */
public class Group {

    private String groupName;
    private Student[] group = new Student[10];

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student student) throws MyException {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = student;
                return;
            }
        }
        throw new MyException();
    }

    public void delStudent(int number) {

        group[number] = null;
    }

    public Student searchStudent(String lastName) {

        for (Student student : group) {
            if (student != null && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Student student : group) {
            if (student != null) {
                sb.append(i + "): " + student + "\n");
            }
            i++;
        }
        return sb.toString();
    }
}
