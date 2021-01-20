package com.company;
public class BinarySearch {
    public static void main(String args[])
    {
        int arr[] = { 10,21,54,45 };
        int n = arr.length;
        int x = 19;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found  " );
}
        public static int binarySearch(int arr[], int l, int r, int x)
        {
        if (r >= l) {
        int mid = l + (r - l) / 2;
        if (arr[mid] == x)
        return mid;
        if (arr[mid] > x)
        return binarySearch(arr, l, mid - 1, x);
        return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
        } }
