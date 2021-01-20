package com.company;
public class Selection_sort {
    public static void main(String[] args){
int[] a = {10,9,8,7,6,5,4};
int n= a.length;
int[] b= Ssort(a,n);
for(int i:b){
    System.out.println(i);
}
    }
    public static int[] Ssort(int[] arr ,int n){
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
}
    return arr;}}
