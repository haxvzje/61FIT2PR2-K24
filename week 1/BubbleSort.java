package week1;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        // Declaration
        Scanner sc = new Scanner(System.in);
        BubbleSort bs = new BubbleSort();
        int n;
        int[] arr;
        n = sc.nextInt();
        arr = new int[n];

        // Processing
        // Array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Call the sort function
        bs.bubbleSort(arr, n);
        // Print the sorted array
        bs.printArray(arr);
    }

    void printArray(int[] arr) {
        for (int i : arr) System.out.printf("%d ", i);
        System.out.println();
    }

    void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // EOP
}
