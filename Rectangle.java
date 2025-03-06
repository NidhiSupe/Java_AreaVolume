// Rectangle.java
// Class for rectangle calculations
class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width, 0, 4);
    }

    public double calcArea() {
        return dim_one * dim_two;
    }

    public double calcPerimeter() {
        return 2 * (dim_one + dim_two);
    }

    public double calcVolume() {
        return 0;
    }
}