package com.company;

public class InsertionSort {

    public static <T extends Comparable<? super T>> void insertionSort(T[] a){
        int n = a.length;
        //Looper igjennom
        for (int j = 1; j < n; j++) {
            T key = a[j];
            int i = j-1;
            while ((i > -1) && (a[i].compareTo(key) > 0)) {
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;
        }
    }
}
