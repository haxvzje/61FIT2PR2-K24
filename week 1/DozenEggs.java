package week1;

import java.util.Scanner;

public class DozenEggs {
    public static void main(String[] args) {
        final int GROSS = 144;
        final int DOZEN = 12;

        Scanner sc = new Scanner(System.in);
        int eggAmount = sc.nextInt();
        int eggGross = eggAmount / GROSS;
        int eggLeft = (eggAmount % GROSS);
        int eggDozen = eggLeft / DOZEN;
        eggLeft = eggLeft % DOZEN;
        System.out.printf("Your number of eggs is %d gross, %d dozen, and %d.", eggGross, eggDozen, eggLeft);
    }
}