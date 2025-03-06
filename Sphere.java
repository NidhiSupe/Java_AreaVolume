// Sphere.java
// Class for sphere calculations
class Sphere extends Shape implements Volume {
    public Sphere(double radius) {
        super(radius, 0, 0, 0);
    }

    public double calcArea() {
        double area = 4 * Math.PI * dim_one * dim_one;
        return Math.floor(area * 100) / 100;
    }

    public double calcPerimeter() {
        return 0;
    }

    public double calcVolume() {
        double volume = (4.0 / 3.0) * Math.PI * dim_one * dim_one * dim_one;
        return Math.floor(volume * 100) / 100;
    }
}