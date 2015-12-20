package week1.hw.task2;

/**
 * Описать класс «Triangle». В качестве свойств возьмите длинны
 * сторон треугольника. Реализуйте метод который будет возвращать
 * площадь этого треугольника. Создайте несколько объектов этого
 * класса и протестируйте их.
 */
public class Triangle {

    double sideA;
    double sideB;
    double sideC;
    double semiper;
    double square;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void square(){
        semiper = (sideA + sideB + sideC) / 2;
        square = Math.sqrt(semiper *(semiper - sideA)*(semiper - sideB)*(semiper - sideC));
        System.out.println("Square = " + square);
    }
}
