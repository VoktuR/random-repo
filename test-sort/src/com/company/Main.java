package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 7, 9, 2, 4, 6, 8, 10, 3};
//        System.out.println(Arrays.toString(doBubbleSort(arr)));
//        System.out.println(Arrays.toString(doSelectionSort(arr)));
//        System.out.println(Arrays.toString(doInsertionSort(arr)));
        System.out.println(Arrays.toString(doEnhancedBubbleSort(arr)));
    }

    public static int[] doBubbleSort(int[] unsortedArray) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    isSorted = false;
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = temp;
                }
            }
        }
        return unsortedArray;
    }

    public static int[] doSelectionSort(int[] unsortedArray) {
        int min, temp;

        for (int i = 0; i < unsortedArray.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[min]) {
                    min = j;
                }
            }
            temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[min];
            unsortedArray[min] = temp;
        }
        return unsortedArray;
    }

    public static int[] doInsertionSort(int[] unsortedArray) {
        int point, j;

        for (int i = 1; i < unsortedArray.length; i++) {
            j = i;
            point = unsortedArray[i];
            while (j > 0 && point < unsortedArray[j - 1]) {
                unsortedArray[j] = unsortedArray[j - 1];
                j--;
            }
            unsortedArray[j] = point;
        }
        return unsortedArray;
    }

    public static int[] doEnhancedBubbleSort(int[] unsortedArray) {
        boolean isSorted;
        int temp;

        for (int i = unsortedArray.length - 1; i > 0; i--) {
            isSorted = true;
            for (int j = 0; j < i; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        return unsortedArray;
    }

}

