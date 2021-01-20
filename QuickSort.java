package com.company;
    public class QuickSort
    {
        public static void main(String args[])
        {

            int[] a={38,67,44,34,5,32};
            int n= a.length;
            quickSort(a,0,n-1);
            for(int i=0;i<n;i++)
                System.out.println(a[i]);
        }
        public static void quickSort(int a[], int left, int right)
        {
            int pivot, l,u,temp;

            l= left;
            u = right;
            pivot = left;

            while(left!=right)
            {
                while((a[right] >= a[pivot] ) && (left!=right))
                    right--;

                if(left!=right)
                {
                    temp = a[pivot];
                    a[pivot] = a[right];
                    a[right] = temp;

                    pivot = right;
                }

                while(( a[left]<=a[pivot] ) && (left!=right))
                    left++;

                if(left!=right)
                {
                    temp = a[pivot];
                    a[pivot] = a[left];
                    a[left] = temp;

                    pivot = left;
                }
            }

            if(l<pivot)
                quickSort(a,l,pivot-1);

            if(pivot<u)
                quickSort(a,pivot+1,u);
        }
    }
