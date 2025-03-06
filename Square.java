// Square.java
// Class for square calculations
class Square extends Shape {
    public Square(double side) {
        super(side, 0, 0, 4);
    }

    public double calcArea() {
        return dim_one * dim_one;
    }

    public double calcPerimeter() {
        return 4 * dim_one;
    }

    public double calcVolume() {
        return 0;
    }
}