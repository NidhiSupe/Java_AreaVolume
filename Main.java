import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Name: Nidhi Supe, PRN: 2300126080, Batch: Aiml-B1
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nShape Calculator Menu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid (Square Base)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    calculateCircle(scanner);
                    break;
                case 2:
                    calculateRectangle(scanner);
                    break;
                case 3:
                    calculateSquare(scanner);
                    break;
                case 4:
                    calculateSphere(scanner);
                    break;
                case 5:
                    calculateCylinder(scanner);
                    break;
                case 6:
                    calculatePyramid(scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Functions to calculate shapes
    public static void calculateCircle(Scanner scanner) {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println("Area: " + circle.calcArea());
        System.out.println("Perimeter: " + circle.calcPerimeter());
    }

    public static void calculateRectangle(Scanner scanner) {
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, width);
        System.out.println("Area: " + rectangle.calcArea());
        System.out.println("Perimeter: " + rectangle.calcPerimeter());
    }

    public static void calculateSquare(Scanner scanner) {
        System.out.print("Enter side: ");
        double side = scanner.nextDouble();
        Shape square = new Square(side);
        System.out.println("Area: " + square.calcArea());
        System.out.println("Perimeter: " + square.calcPerimeter());
    }

    public static void calculateSphere(Scanner scanner) {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        Sphere sphere = new Sphere(radius);
        System.out.println("Area: " + sphere.calcArea());
        System.out.println("Volume: " + sphere.calcVolume());
    }

    public static void calculateCylinder(Scanner scanner) {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Area: " + cylinder.calcArea());
        System.out.println("Volume: " + cylinder.calcVolume());
    }

    public static void calculatePyramid(Scanner scanner) {
        System.out.print("Enter base side: ");
        double baseSide = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        EquilateralPyramid pyramid = new EquilateralPyramid(baseSide, height);
        System.out.println("Area: " + pyramid.calcArea());
        System.out.println("Volume: " + pyramid.calcVolume());
    }
}