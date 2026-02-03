package week4;

import java.util.Arrays;

public class IntBubbleSort extends IntSort {

    public IntBubbleSort(int[] array) {
        super("Bubble Sort", array);
    }

    @Override
    public void sort() {
        int[] array = getArray();
        if (array == null) return;

        int[] tempArray = Arrays.copyOf(array, array.length);
        int n = tempArray.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tempArray[j] > tempArray[j + 1]) {
                    int temp = tempArray[j];
                    tempArray[j] = tempArray[j + 1];
                    tempArray[j + 1] = temp;
                }
            }
        }
        setSortedArray(tempArray);
    }
}