package interface_handon;

abstract class Shape {

    String shapeName;

    Shape(String name) {
        this.shapeName = name;
    }

    public abstract double area();

    public String toString() {
        return shapeName;
    }
}

class Sphere extends Shape {

    double radius;

    Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public String toString() {
        return super.toString() + " with radius " + radius;
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public String toString() {
        return super.toString() + " with length " + length + " and width " + width;
    }
}

class Cylinder extends Shape {

    double radius;
    double height;

    Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return Math.PI * radius * radius * height;
    }

    public String toString() {
        return super.toString() + " with radius " + radius + " and height " + height;
    }
}

class Paint {

    double coverage;

    Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape s) {

        System.out.println("Computing amount for " + s);

        return s.area() / coverage;
    }
}


public class handson5 {

    public static void main(String[] args) {

        Paint paint = new Paint(350);

        Shape deck = new Rectangle(20, 35);
        Shape bigBall = new Sphere(15);
        Shape tank = new Cylinder(10, 30);

        double deckAmount;
        double ballAmount;
        double tankAmount;

        deckAmount = paint.amount(deck);
        ballAmount = paint.amount(bigBall);
        tankAmount = paint.amount(tank);

        System.out.println("Paint needed for deck: " + deckAmount);
        System.out.println("Paint needed for bigBall: " + ballAmount);
        System.out.println("Paint needed for tank: " + tankAmount);
    }
}