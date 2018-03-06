package com.yunduan.sort;

public class MergeSort {
    public void mergeSort(int[] arr, int n) {
        __mergeSort(arr, 0, n - 1);
    }

    public void mergeSort1(int[] arr,int n){
        __mergeSort1(arr,0,n-1);
    }


    private void __mergeSort(int[] arr, int l, int r) {
        if (l >= r)
            return;

        int mid = (l + r) / 2;
        __mergeSort(arr, l, mid);
        __mergeSort(arr, mid + 1, r);
        __merge(arr, l, mid, r);
    }

    //优化的归并排序
    private void __mergeSort1(int[] arr, int l, int r) {
        //优化1：当数据量小于一定的量时候，采用插入排序的性能比归并排序好
        if (r - l < 15) {
            InsertSort.insertSortUtil(arr, l, r);
            return;
        }
        int mid = (l + r) / 2;
        __mergeSort(arr, l, mid);
        __mergeSort(arr, mid + 1, r);
        //优化2：当arr[mid]<=arr[mid+1]时，说明两边的数组已经有序，不需要再进行归并
        if (arr[mid] > arr[mid + 1])
            __merge(arr, l, mid, r);
    }

    //自低向上的归并排序
    public void mergeSortBU(int[] arr,int n){
        for(int sz = 1; sz<=n ; sz += sz){
            for(int i=0; i+sz<n;i+=sz+sz){
                __merge(arr,i,i+sz-1,Math.min(i+sz+sz-1,n-1));
            }
        }
    }

    private void __merge(int[] arr, int l, int mid, int r) {
        int[] aux = new int[r - l + 1];
        for (int i = l; i <= r; i++) {
            aux[i - l] = arr[l];
        }

        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) {
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l] <= aux[j - l]) {
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l] > aux[j - l]) {
                arr[k] = aux[j - l];
                j++;
            }
        }
    }
}
