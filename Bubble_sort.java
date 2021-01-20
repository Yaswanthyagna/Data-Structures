package com.company;
public class Bubble_sort {
    public static void main(String[] args) {
        int[] a = {10,9,8,7,6,5,4,3,2,1};
        int n= a.length;
        int[] aa = Bsort(a,n);
        for(int i:aa){
            System.out.println(i);
        }
    }
    public static int[] Bsort(int[] arr,int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++)
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
        }
        return(arr); }
}
