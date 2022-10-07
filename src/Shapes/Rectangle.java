package Shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle() {
        System.out.println("Please enter a length and width as arguements.");
    }

    public Rectangle(int side) {
        System.out.println("Please enter a length and width as arguements.");
    }


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getPerimiter() {
        return (this.length * 2) + (this.width * 2);
    }

}
