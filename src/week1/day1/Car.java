package week1.day1;

/**
 * Created by acer on 16.12.2015.
 */
public class Car {
    private String color;
    private double weight;
    private int year;
    private double velosity = 0;

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getYear() {
        return year;
    }

    public double getVelosity() {
        return velosity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVelosity(double velosity) {
        this.velosity = velosity;
    }

    void beep() {
        System.out.println("BEEP-BEEP!!!");
    }

    void acceleration(
            double a) {
        velosity = velosity + a;
    }

    void deceleration(double b) {
        if (velosity - b >= 0) velosity = velosity - b;
    }

    void print() {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Year car: " + year);
        System.out.println("Velosity: " + velosity);
    }
}


