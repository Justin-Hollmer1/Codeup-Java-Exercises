package Shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        this.length = side;
    }
    @Override
    protected void setLength(int newLength) {
        this.length = newLength;
    }

    @Override
    protected void setWidth(int newWidth) {
        this.width = newWidth;
    }

    @Override
    public double getPerimiter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }
}
