package week3;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this(1.0f, 1.0f);
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return getWidth() * getLength();
    }

    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    public String toString() {
        return String.format("Rectangle[length=%.1f,width=%.1f]", getLength(), getWidth());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1); // test toString()
        Rectangle r2 = new Rectangle(); // test default constructor
        System.out.println(r2);
        // Test setters and getters
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println("Length is: " + r1.getLength());
        System.out.println("Width is: " + r1.getWidth());
        // Test getArea() and getPerimeter()
        System.out.printf("Area is: %.2f%n", r1.getArea());
        System.out.printf("Perimeter is: %.2f%n", r1.getPerimeter());
    }
}
