package week2.hw;

/**
 * Создайте классы которые описывают как минимум 3
 геометрические фигуры (они должны быть подклассами
 Shape), при этом они в качестве свойств должны содержать
 классы Point.
 */
public class Square extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;


    public Square(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    @Override
    double perimetr() {
        return sideA + sideB + sideC + sideD;
    }

    @Override
    double area() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", sideD=" + sideD +
                '}';
    }
}
