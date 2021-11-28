package com.company;

import java.util.Comparator;

public class QuickSort {
    // quicksort – pivot er siste element. Sorter intervallet fom start, tmim end
    public static <T> void quickSort(T[] array, int start, int end, Comparator<? super T> comp){
        if (end-start <= 0) return; // Base case
        int i = start;
        int j = end-1; // Pivot-elementet – her berre siste element.
        // Øving: implementer median-av-tre!
        boolean movingI = true;
        while (i<j) {
            if (comp.compare(array[i], array[j]) >= 0) { // Bytt også når dei er like!
                //swap(array, i, j);  // Bytt innhald
                movingI = !movingI; // Bytt retning
            }
            if (movingI) i++; else j--;
        }
        // Ferdig med splitt, utfør rekursive kall
        quickSort(array, start, i, comp); // Sorter dei «små»
        quickSort(array, i+1, end, comp); // Sorter dei «store»
    }

    //Drivarrutine
    public static <T> void quickSort(T[] array, Comparator<? super T> comp){
        quickSort(array, 0, array.length, comp);
    }
}
