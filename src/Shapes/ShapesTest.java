package Shapes;

public class ShapesTest {
    Measurable myShape;

    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getPerimiter());
        System.out.println(rectangle.getArea());
    }
}

