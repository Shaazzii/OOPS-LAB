import java.util.Scanner;

interface Figure {
    double area();
}

class Rectangle implements Figure {
    private double length, breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {
        return length * breadth;
    }
}

class Triangle implements Figure {
    private double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double area() {
        return 0.5 * base * height;
    }
}

class Square implements Figure {
    private double side;
    Square(double side) {
        this.side = side;
    }
    public double area() {
        return side * side;
    }
}

class Circle implements Figure {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class SCRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of Rectangle: ");
        Figure rect = new Rectangle(sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter base and height of Triangle: ");
        Figure tri = new Triangle(sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter side of Square: ");
        Figure sq = new Square(sc.nextDouble());

        System.out.print("Enter radius of Circle: ");
        Figure cir = new Circle(sc.nextDouble());

        System.out.println();
        System.out.printf("Area of Rectangle: %.2f%n", rect.area());
        System.out.printf("Area of Triangle:  %.2f%n", tri.area());
        System.out.printf("Area of Square:    %.2f%n", sq.area());
        System.out.printf("Area of Circle:    %.2f%n", cir.area());

        sc.close();
    }
}
