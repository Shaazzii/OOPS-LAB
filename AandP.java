import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    public void area() {
        System.out.println("Area: " + (3.14 * r * r));
    }
    public void perimeter() {
        System.out.println("Perimeter: " + (2 * 3.14 * r));
    }
}

class Rectangle implements Shape {
    double l, w;
    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
    public void area() {
        System.out.println("Area: " + (l * w));
    }
    public void perimeter() {
        System.out.println("Perimeter: " + (2 * (l + w)));
    }
}

public class AandP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Circle\n2. Rectangle\n3. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Radius: ");
                double r = sc.nextDouble();
                Shape c = new Circle(r);
                c.area();
                c.perimeter();
            } else if (ch == 2) {
                System.out.print("Length: ");
                double l = sc.nextDouble();
                System.out.print("Width: ");
                double w = sc.nextDouble();
                Shape r = new Rectangle(l, w);
                r.area();
                r.perimeter();
            } else if (ch == 3) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
