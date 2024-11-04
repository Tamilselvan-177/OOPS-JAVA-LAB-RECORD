import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    public abstract double calculateArea();
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area of Circle: π * r^2
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth; // Area of Rectangle: length * breadth
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height; // Area of Triangle: 0.5 * base * height
    }
}

// Main class
public class Week82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Circle input
        double circleRadius = scanner.nextDouble();
        Shape circle = new Circle(circleRadius);
        System.out.printf("Area of a circle: %.2f%n", circle.calculateArea());

        // Rectangle input
        double rectangleLength = scanner.nextDouble();
        double rectangleBreadth = scanner.nextDouble();
        Shape rectangle = new Rectangle(rectangleLength, rectangleBreadth);
        System.out.printf("Area of a Rectangle: %.2f%n", rectangle.calculateArea());

        // Triangle input
        double triangleBase = scanner.nextDouble();
        double triangleHeight = scanner.nextDouble();
        Shape triangle = new Triangle(triangleBase, triangleHeight);
        System.out.printf("Area of a Triangle: %.2f%n", triangle.calculateArea());

        scanner.close();
    }
}
