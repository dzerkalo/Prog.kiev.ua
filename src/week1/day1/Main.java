package week1.day1;

import week1.day1.Car;

/**
 * Created by acer on 16.12.2015.
 */
public class Main {
    public static void main(String[] args) {



        Car carOne = new Car();
        carOne.setColor("gren");
        carOne.setWeight(1500);
        carOne.setYear(1982);
        carOne.print();
        carOne.acceleration(30);
        carOne.print();
    }
}
