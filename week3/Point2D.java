package week3;

import java.util.Locale;
import java.util.Scanner;

public class Point2D {

    private final double posX, posY;

    public Point2D(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return this.posX;
    }

    public double getPosY() {
        return this.posY;
    }

    public double distance(double posX, double posY) {
        return Math.sqrt(Math.pow(posX - getPosX(), 2) + Math.pow(posY - getPosY(), 2));
    }

    public double distance(Point2D point) {
        double posX = point.posX;
        double posY = point.posY;
        return Math.sqrt(Math.pow(posX - getPosX(), 2) + Math.pow(posY - getPosY(), 2));
    }

    public String toString() {
        return String.format("Point2D [x = %.1f, y = %.1f]", getPosX(), getPosY());
    }

    public static void main(String[] args) {
        double posX, posY;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Enter point1's х-, y-соordinates: ");
        posX = sc.nextDouble();
        posY = sc.nextDouble();
        Point2D p1 = new Point2D(posX, posY);

        System.out.print("Enter point2's х-, y-соordinates: ");
        posX = sc.nextDouble();
        posY = sc.nextDouble();
        Point2D p2 = new Point2D(posX, posY);

        System.out.printf("p1 is %s", p1);
        System.out.printf("\np2 is %s", p2);

        System.out.printf("\nThe distance between p1 and p2 is %.15f", p1.distance(p2));
    }
}
