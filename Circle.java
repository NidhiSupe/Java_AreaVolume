// Circle.java
// Class for circle calculations
class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0, 0, 0);
    }

    public double calcArea() {
        double area = Math.PI * dim_one * dim_one;
        return Math.floor(area * 100) / 100;
    }

    public double calcPerimeter() {
        double perimeter = 2 * Math.PI * dim_one;
        return Math.floor(perimeter * 100) / 100;
    }

    public double calcVolume() {
        return 0;
    }
}