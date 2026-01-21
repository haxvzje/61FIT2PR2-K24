package week1;

import java.util.Scanner;

public class NameConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next().toUpperCase();
        System.out.printf(" “Hello, %s, nice to meet you!", name);
    }
}
