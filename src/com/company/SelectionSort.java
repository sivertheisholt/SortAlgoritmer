package com.company;

public class SelectionSort {

    //Iterative
    public static void selectionSort(int[] tab){
        for (int i=0; i<tab.length; i++){
            int minpos = i;
            for (int j=i+1; j<tab.length; j++)
                if (tab[j] < tab[minpos]) minpos = j;
            //swap(tab, i, minpos);
        }
    }

    //Iterative - Delsorter
    public static void delSorterSelectionSort(int[] tab, int low, int high){
        int n = Math.min(high, tab.length-1);
        for (int i=0; i<=n; i++){
            int minpos = i;
            for (int j=i+1; j<tab.length; j++)
                if (tab[j] < tab[minpos]) minpos = j;
            //swap(tab, i, minpos);
        }
    }

    //Recursion
    public static void selectionSort(int[] tab, int startpos){
        if (startpos >= tab.length-1) return; // Base case
        // Finn minste frå startpos, legg i startpos
        int minpos = startpos;
        for (int i=startpos+1; i<tab.length; i++)
            if (tab[i] < tab[minpos]) minpos = i;
        //swap(tab, startpos, minpos);
        // Deretter rekursivt kall:
        selectionSort(tab, startpos+1);
    }
}
