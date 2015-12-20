package week1.hw.task1;

/**
 Описать класс «Cat» (в качестве образца можно взять домашнего
 питомца). Наделить его свойствами и методами. Создать несколько
 экземпляров объектов этого класса. Использовать эти объекты.
 */
public class Cat {

    private String name;
    private int age;
    private String color;
    private String sex;
    private int weight;

    public Cat(String name, int age, String color, String sex, int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void voice(){
        System.out.println("Meow");
    }

    public void eat(){
        System.out.println("Thank you");
    }

    public void sleep(){
        System.out.println("I'm sleeping");
    }
}
