package week2;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private double discount;
    private int quantity;
    Scanner scanner = new Scanner(System.in);

    private static int productCount = 0;
    private static double totalRevenue = 0;
    private static double totalDiscount = 0;

    public Product(String name, double price, double discount, int quantity) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        productCount++;
        totalDiscount += discount;
        totalRevenue += (price * quantity) - (price * discount/100.0 * quantity);
    }

    public Product(String name, double price) {
        this(name, price, 0, 0);
    }

    public static int getProductCount() {
        return productCount;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public static double getAverageDiscount() {
        return totalDiscount / productCount;
    }

    public static void displayStatistics() {
        System.out.println("=== Product Statistics ===");
        System.out.printf("Total Products Created: %d", getProductCount());
        System.out.printf("\nTotal Potential Revenue: $%.2f", getTotalRevenue());
        System.out.printf("\nAverage Discount: %.2f%%", getAverageDiscount());
    }

    private void updateQuantity(int newQuantity) {
        totalRevenue -= (this.price * this.quantity) - (this.price * this.discount/100.0 * this.quantity);
        this.quantity = newQuantity;
        totalRevenue += (this.price * this.quantity) - (this.price * this.discount/100.0 * this.quantity);
    }


    private double getImportTax() {
        return this.price * 0.10;
    }

    public void displayInfo() {
        System.out.printf("Product name: %s", this.name);
        System.out.printf("\nUnit price: $%.2f", this.price);
        System.out.printf("\nDiscount: %.0f%%", this.discount);
        System.out.printf("\nQuantity: %d", this.quantity);
        System.out.printf("\nImport Tax: $%.2f\n\n", getImportTax());
    }

    public void input() {
        System.out.print("Product name: ");
        this.name = scanner.next();
        System.out.print("Unit price: ");
        this.price = scanner.nextDouble();
        System.out.print("Discount: ");
        this.discount = scanner.nextDouble();
    }

    public static void main(String[] args) {
        // Exercise 2
//        Product laptop = new Product();
//        laptop.input();
//        laptop.displayInfo();

        // Exercise 3
//        Product laptop = new Product("Lenovo LOQ", 999, 5);
//        laptop.displayInfo();
//
//        Product iphone = new Product("IPhone 17 Pro Max", 1999);
//        iphone.displayInfo();

        // Exercise 4
        Product laptop = new Product("Lenovo LOQ", 1000, 10, 50);
        laptop.displayInfo();
        Product iphone = new Product("IPhone 17 Pro Max", 25, 5, 200);
        iphone.displayInfo();
        Product tablet = new Product("IPad Pro", 75, 0, 100);
        tablet.displayInfo();

        displayStatistics();
    }
}
