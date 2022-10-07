package Shapes;

public class Square extends Rectangle {

    public int side;

    public Square() {
        System.out.println("Please enter a side measurement as an arguement.");
    }

    public Square(int side) {
        this.width = side;
        this.length = side;
        this.side = side;
    }

    public int getArea() {
        return this.side * this.side;
    }

    public int getPerimiter() {
        return this.side * 4;
    }

}
