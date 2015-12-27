package week2.hw.hw1;

/**
 * Создайте классы которые описывают как минимум 3
 * геометрические фигуры (они должны быть подклассами
 * Shape), при этом они в качестве свойств должны содержать
 * классы Point.
 */
public class SameSideTriangle extends Shape {

    private double sideA;

    public SameSideTriangle(double sideA) {
        this.sideA = sideA;
    }

    @Override
    double perimetr() {
        return sideA * 3;
    }

    @Override
    double area() {
        return (Math.sqrt(3)/36) * perimetr();
    }

    @Override
    public String toString() {
        return "SameSideTriangle{" +
                "sideA=" + sideA +
                '}';
    }
}
