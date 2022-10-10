package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("The area of the rectangle is: " + box1.getArea());
        System.out.println("The perimiter of the rectangle is: " + box1.getPerimiter());

        Rectangle box2 = new Square(5);
        System.out.println("The area of the square is: " + box2.getArea());
        System.out.println("The perimiter of the square is: " + box2.getPerimiter());
    }
}
