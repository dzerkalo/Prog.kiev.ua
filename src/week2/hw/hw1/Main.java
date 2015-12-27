package week2.hw.hw1;

/**
 * Created by acer on 22.12.2015.
 */
public class Main {

    public static void main(String[] args) {


        Desk desk = new Desk();

        Circle circle = new Circle(5);
        SameSideTriangle sameSideTriangle = new SameSideTriangle(3);
        Square square = new Square(2, 4, 3, 5);

        desk.addShape(circle);
        desk.addShape(sameSideTriangle);
        desk.addShape(square);

        desk.toString();
        System.out.println(desk);
        desk.deleteShape(1);
        System.out.println(desk);

    }
}
