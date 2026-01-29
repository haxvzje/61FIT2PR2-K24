package week3;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this(radius, "red");
    }

    public Circle() {
        this(1.0, "red");
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle();

        System.out.println("== C1 ==");
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        System.out.printf("%.2f", c1.getArea());

        System.out.println("\n== C2 ==");
        System.out.println(c2.getRadius());
        System.out.println(c2.getColor());
        System.out.printf("%.2f", c2.getArea());

        System.out.println("\n== C3 ==");
        System.out.println(c3.getRadius());
        System.out.println(c3.getColor());
        System.out.printf("%.2f", c3.getArea());
    }
}
