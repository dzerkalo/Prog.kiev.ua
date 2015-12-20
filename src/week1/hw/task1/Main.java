package week1.hw.task1;

/**
 * Created by acer on 20.12.2015.
 */
public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Vasya", 5, "black", "male", 12);
        cat.eat();
        cat.sleep();
        cat.voice();

        Cat cat1 = new Cat("Murka", 4, "white", "female", 10);
        cat1.voice();
        cat1.sleep();
        cat1.eat();
    }
}
