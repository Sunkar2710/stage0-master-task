package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[] {"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] arr = new int[length];
        for (int i = 1; i <= length; i++) {
            arr[i - 1] = i;
        }
        return arr;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i] == number) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[arr.length - 1 - i] = arr[i];
        }
        return result;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] result = new int[0];
        for (int j : arr) {
            if (j > 0) {
                result = resize(result, j);
            }
        }
        return result;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            int[] key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].length > key.length) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        for (int[] ints : arr) {
            quickSort(ints, 0, ints.length - 1);
        }

        return arr;
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left <= right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        int x = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= x) {
                i = i + 1;
                swap(arr[i], arr[j]);
            }
        }
        swap(arr[i + 1], arr[right]);
        return i + 1;
    }

    private void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    private int[] resize(int[] arr, int element) {
        int[] temp = new int[arr.length + 1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[temp.length - 1] = element;
        return temp;
    }
}
