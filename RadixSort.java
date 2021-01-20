package com.company;

import java.util.Scanner;

public class RadixSort {
    public static void main(String args[])
    {
        int a[] =  {10,21,2,5,23};
        int n,i;
        Scanner sc = new Scanner(System.in);

        n=a.length-1;


        radixSort(a,n);

        System.out.println("After sorting");
        for(i=0;i<n;i++)
            System.out.print(a[i]+"  ");
    }

    public static void radixSort(int a[],int n)
    {
        int big, count,digit,div;
        int bucket[][];
        int b[];
        int i,j,k,p;

        b = new int[10];

        bucket = new int[10][15];

        big = a[0];
        for(i=1;i<n;i++)
        {
            if(big<a[i])
                big = a[i];
        }

        count=0;
        while(big>0)
        {
            big=big/10;
            count++;
        }

        div = 1;
        for(p=1;p<=count;p++)
        {
            for(i=0;i<10;i++)
                b[i] = 0;

            for(i=0;i<n;i++)
            {
                digit = (a[i]/div)%10;
                bucket[digit][b[digit]] = a[i];
                b[digit]++;
            }

            i=0;
            for(k=0;k<10;k++)
            {
                for(j=0;j<b[k];j++)
                    a[i++] = bucket[k][j];
            }
            div = div * 10;
        }
    }
}
