package com.company;

import java.util.Comparator;

public class MergeSort {

    //merge – flettedelen av mergesort. Merk at resultatet ligg i targetArray.
    private static <T> void merge(T[] array, int start, int mid, int end,
                                  T[] targetArray, Comparator<? super T> comp) {
        int i = start; // fyrste element i array
        int j = mid; // fyrste element i høgre del av array
        int k = start; // indeks i targetArray
        while (k < end) {
            if (i == mid) { // fyrste tabell er tømt
                targetArray[k++] = array[j++]; // Kopier frå andre tabell
            } else if (j == end) { // andre tabell er tømt
                targetArray[k++] = array[i++]; // Kopier frå fyrste tabell
            } else if (comp.compare(array[i], array[j]) > 0) { // samanlikne
                targetArray[k++] = array[j++]; // Kopier frå andre tabell
            } else {
                targetArray[k++] = array[i++]; // Kopier frå fyrste tabell
            }
        }
    }

    //mergeSort. Bruker tempArray undervegs, men svaret ligg i sourceArray
    public static <T> void mergeSort(T[] sourceArray, int start, int end,
                                     T[] tempArray, Comparator<? super T> comp){
        if (start >= end-1) {
            return; // Base case
        }
        int mid = (start+end)/2;    // Finn midtpunktet
        mergeSort(sourceArray, start, mid, tempArray, comp);    // sorter venstre del
        mergeSort(sourceArray, mid, end, tempArray, comp);      // sorter høgre del
        merge(sourceArray, start, mid, end, tempArray, comp);   // Flett saman
        // Resultatet ligg no i tempArray – kopier tilbake:
        System.arraycopy(tempArray, start, sourceArray, start, end-start);
    }

    //Drivarrutine
    public static <T> void mergeSort(T[] sourceArray, Comparator<T> comp){
        T[] tempArray = (T[]) new Object[sourceArray.length];
        mergeSort(sourceArray, 0, sourceArray.length, tempArray, comp);
    }
}
