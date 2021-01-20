package com.company;
public class Insertion_sort {
        public static void main(String[] args) {
            int[] a ={239,324,241,213,324,234};
            int len = a.length;
            int[] b= Isort(a,len);
           for(int j:b){
               System.out.println(j); } }
    public static int[] Isort(int[] arr, int n) {
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; }return (arr);}}