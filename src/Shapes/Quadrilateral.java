package Shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;
    protected int width;


    public Quadrilateral() {
    }

    public Quadrilateral(int side) {
        this.length = side;
    }

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }


    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }

    protected abstract void setLength(int newLength);
    protected abstract void setWidth(int newWidth);

}
