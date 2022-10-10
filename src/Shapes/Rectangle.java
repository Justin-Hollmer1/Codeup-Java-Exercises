package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public void setLength(int newLength) {
        this.length = newLength;
    }
    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    @Override
    public double getPerimiter() {
        return (this.length * 2) + (this.width * 2);
    }
    public double getArea() {
        return this.length * this.width;
    }
}
