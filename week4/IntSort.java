package week4;

import java.util.Arrays;

public class IntSort {
    private String name;
    private int[] array;
    private int[] sortedArray;

    public IntSort(String name, int[] array) {
        this.name = name;
        this.array = array;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    public void sort() {
        if (array != null) {
            sortedArray = Arrays.copyOf(array, array.length);
            Arrays.sort(sortedArray);
        }
    }

    public boolean isSorted() {
        if (sortedArray == null || sortedArray.length <= 1) {
            return true;
        }
        for (int i = 0; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] > sortedArray[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, Arrays.toString(sortedArray));
    }
}
