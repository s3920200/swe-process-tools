package org.bubblesort;

public class BubbleSort {
    public static int[] sort(int[] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (A[j] > A[j+1]) {
                    int temp = A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }
            }
        }

        return A;
    }
}