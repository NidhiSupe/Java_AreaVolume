// Cylinder.java
// Class for cylinder calculations
class Cylinder extends Shape implements Volume {
    public Cylinder(double radius, double height) {
        super(radius, height, 0, 0);
    }

    public double calcArea() {
        double area = 2 * Math.PI * dim_one * (dim_one + dim_two);
        return Math.floor(area * 100) / 100;
    }

    public double calcPerimeter() {
        return 0;
    }

    public double calcVolume() {
        double volume = Math.PI * dim_one * dim_one * dim_two;
        return Math.floor(volume * 100) / 100;
    }
}