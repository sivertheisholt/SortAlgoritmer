package com.company;

public class BubbleSort {

    //Iterative
    public static <T extends Comparable<? super T>> void bubbleSort(T[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if (a[j].compareTo(a[j+1]) > 0) {
                    //swap(a, j, j+1);
                }
            }
        }
    }

    //Iterative - Delsorter
    public static <T extends Comparable<? super T>> void delSorterBubbleSort(T[] a, int low, int high) {
        int n = a.length-low;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                if (a[j].compareTo(a[j+1]) > 0) {
                    //swap(a, j, j+1);
                }
            }
        }
    }
}
