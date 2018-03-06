package com.yunduan.sort;

import java.util.Random;

public class QuickSort3Ways {

    public void quickSort3Ways(int[] arr, int n) {
         __quickSort3Ways(arr,0,n-1);
    }

    private void __quickSort3Ways(int[] arr, int l, int r) {
        if (l >= r) {
            InsertSort.insertSortUtil(arr, l, r);
            return;
        }

        Random random = new Random();
        int index = random.nextInt((r - l) + 1) + l;
        swap(arr, index, l);
        int v = arr[l];


        int lt = l;    //   arr[l...lt]<arr[v]
        int gt = r + 1;  //   arr[v]<arr[gt...r]
        int i = l + 1;   //   arr[lt+1,i)=arr[v]

        while (i < gt) {
            if (arr[i] < v) {
                swap(arr, lt + 1, i);
                lt++;
                i++;
            }else if(arr[i] > v){
                swap(arr,gt-1,i);
                gt--;
            }else if(arr[i] == v){
                i++;
            }
        }
        swap(arr,l,lt);

        __quickSort3Ways(arr,l,lt);
        __quickSort3Ways(arr,gt,r);
    }


    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
