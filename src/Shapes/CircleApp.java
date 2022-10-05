package Shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Please enter a radius");
        double userRadius = Input.getDouble();
        Circle circle = new Circle(userRadius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("Your circle hads a circumference of %s and an area of %s", circumference, area);
    }
}
