package com.company;
public class MergeSort
{
    public static void main(String args[])
    {
        int a[]={98,45,32,5,7};

        int n= a.length-1;
        merge(a,0,n);
        for(int j:a){
            System.out.println(j);
        }
    }

    public static void merge(int a[], int lb,int ub)
    {
        int mid;
        if(lb!=ub)// if(a.length!=1)
        {
            mid = (lb+ub)/2;
            merge(a,lb,mid);
            merge(a,mid+1,ub);
            mergeSort(a,lb,mid,ub);
        }
    }

    public static void mergeSort(int a[], int lb,int mid,int ub)
    {
        int i,j,k;
        int temp[];
        temp = new int[20];

        i = lb;
        j = mid+1;
        k = lb;
        while((i<=mid) && (j<=ub))
        {
            if(a[i] <= a[j])
            {
                temp[k] = a[i];
                k++; i++;
            }
            else
            {
                temp[k] = a[j];
                k++; j++;
            }
        }

        while(i<=mid)
        {
            temp[k] = a[i];
            k++; i++;
        }
        while(j<=ub)
        {
            temp[k] = a[j];
            k++; j++;
        }
        for(i=lb;i<=ub;i++)
            a[i] = temp[i];
    }


}
