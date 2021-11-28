package com.company;

public class BinarySearch {

    //Drivarmetode
    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recBinarySearch(list, key, low, high);
    }

    //Algoritme
    public static int recBinarySearch(int[] list, int key, int low, int high) {
        if (low > high) return -low - 1;
        int mid = (low + high) / 2;
        if (key < list[mid])
            return recBinarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
            return mid;
        else
            return recBinarySearch(list, key, mid + 1, high);
    }
}
