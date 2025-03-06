// EquilateralPyramid.java (Square Base)
// Class for equilateral pyramid calculations
class EquilateralPyramid extends Shape implements Volume {
    public EquilateralPyramid(double baseSide, double height) {
        super(baseSide, height, 0, 0);
    }

    public double calcArea() {
        double slantHeight = Math.sqrt(Math.pow(dim_two, 2) + Math.pow(dim_one / 2, 2));
        double area = (dim_one * dim_one) + (2 * dim_one * slantHeight);
        return Math.floor(area * 100) / 100;
    }

    public double calcPerimeter() {
        return 0;
    }

    public double calcVolume() {
        double volume = (1.0 / 3.0) * dim_one * dim_one * dim_two;
        return Math.floor(volume * 100) / 100;
    }
}