package org.bubblesort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arrA = {70,61,72,83,38};
        int[] arrB = {7,2,76,4,99};
        int[] arrC = {28,9,13,78,19};
        int[] arrD = {68,84,41,62,18};
        int[] arrE = {37,57,40,13,50};

        sortAndPrint(arrA);
        sortAndPrint(arrB);
        sortAndPrint(arrC);
        sortAndPrint(arrD);
        sortAndPrint(arrE);
    }

    private static void sortAndPrint(int[] arr) {
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        int[] sortedArr = BubbleSort.sort(arr);
        System.out.println("Array after sorting : " + Arrays.toString(sortedArr) + "\n");
    }
}
