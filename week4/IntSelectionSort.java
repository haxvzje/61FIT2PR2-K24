package week4;

import java.util.Arrays;

public class IntSelectionSort extends IntSort {

    public IntSelectionSort(int[] array) {
        super("Selection Sort", array);
    }

    @Override
    public void sort() {
        int[] array = getArray();
        if (array == null) return;

        int[] tempArray = Arrays.copyOf(array, array.length);
        int n = tempArray.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (tempArray[j] < tempArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = tempArray[minIndex];
            tempArray[minIndex] = tempArray[i];
            tempArray[i] = temp;
        }
        setSortedArray(tempArray);
    }
}