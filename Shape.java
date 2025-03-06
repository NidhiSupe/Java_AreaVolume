// Shape.java
// Abstract class for shapes
abstract class Shape {
    protected double dim_one;
    protected double dim_two;
    protected double dim_three;
    protected int num_sides;

    // Zero Parameter Constructor
    public Shape() {
        dim_one = dim_two = dim_three = 0;
        num_sides = 0;
    }

    // Parameterized Constructor
    public Shape(double dim_one, double dim_two, double dim_three, int num_sides) {
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
        this.num_sides = num_sides;
    }

    // Abstract methods for area, perimeter, and volume
    abstract public double calcArea();
    abstract public double calcPerimeter();
    abstract public double calcVolume();

    public int getNumSides() {
        return num_sides;
    }
}

// Volume.java
// Interface for volume calculations
interface Volume {
    double calcVolume();
}