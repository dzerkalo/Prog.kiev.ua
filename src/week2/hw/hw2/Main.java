package week2.hw.hw2;

/**
 * Created by acer on 27.12.2015.
 */
public class Main {

    public static void main(String[] args) throws MyException {


        Group group = new Group("Electrotechnic");
        Student student = new Student("Adrey", "Andreev", "male", 28, "NAU", 4, "electricity");
        Student student1 = new Student("Vasya", "Vasiliev", "male", 25, "KPI", 3, "journalist");
        Student student3 = new Student("Olya", "Chushkina", "female", 20, "KPI", 2, "journalist");

        group.addStudent(student);
        group.addStudent(student1);
        group.addStudent(student3);

        System.out.println(group);

        group.delStudent(1);

        System.out.println(group);

        System.out.println(group.searchStudent("Vasiliev"));

    }
}
