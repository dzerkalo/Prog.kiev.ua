package week2.day1;

/**
 * Created by acer on 21.12.2015.
 */
public class Main {

    public static void main(String[] args) {

        Bus bus = new Bus(34);
        Human human = new Human("Vasya", "Vasil'ev", 24, true);
        Human human1 = new Human("Andrew", "Andreev", 28, true);
        Student student = new Student("Andrew", "Andreev", 28, true, "NAU", 2, "Electricity");

        bus.addPas(human);
        bus.addPas(human1);
        bus.addPas(student);

        System.out.println(bus);
        bus.deletePas(2);
        System.out.println(bus);

    }
}
