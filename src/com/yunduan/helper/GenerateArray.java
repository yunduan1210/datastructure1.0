package com.yunduan.helper;

import com.yunduan.sort.SelectSort;

public class GenerateArray {
    public int[] generateRandomArray(int n, int rangeL, int rangeR) {
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] =(int) (Math.random()*(rangeR-rangeL)+1);
        }
        return arr;
    }

    //生成近乎有序的数组
    public int[] generateNearlyOrderedArray(int n ,int swapTimes){
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = i;
        }
        for(int i = 0;i<swapTimes;i++){
            int posx = (int)(Math.random()*n);
            int posy = (int)(Math.random()*n);
            SelectSort.swap(arr, posx, posy);
        }
        return arr;
    }
}
