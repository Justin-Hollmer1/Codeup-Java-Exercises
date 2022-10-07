package Shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getPerimiter());
        System.out.println(box1.getArea());

        System.out.println("---------");

        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimiter());
        System.out.println(box2.getArea());
    }
}
