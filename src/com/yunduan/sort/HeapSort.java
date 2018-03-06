package com.yunduan.sort;

import com.yunduan.Heap.MaxHeap;

public class HeapSort {
    private void shiftDown(int[] arr,int n, int i){
        while(i*2+1<n){
            int j = i*2+1;
            if( j+1<n && arr[j] < arr[j+1]){
                j = i*2 + 2;
            }
            if(arr[i] > arr[j]){
                break;
            }
            MaxHeap.swap(arr,i,j);
            i = j;
        }
    }



    public void heapSort1(int[] arr,int n){
        MaxHeap mh = new MaxHeap(n);
        for(int i = 0;i < n;i++){
            mh.insert(arr[i]);
        }
        for(int i = n-1;i >= 0;i--){
            arr[i] = mh.extractMax();
        }
    }


    //改进后的堆排序，采用了从非叶子节点开始shiftDown操作，省去了一半的节点操作
    public void heapSort2(int[] arr, int n){
        MaxHeap mh = new MaxHeap(arr,n);
        for(int i = n - 1;i >= 0;i--){
            arr[i] = mh.extractMax();
        }
    }

    //改进后的堆排序，不需要额外的空间，直接在数组上进行交换操作，先排序成一个堆，每次把堆中最大的元素与最后一个元素交换，即把
    //最大的元素放到了外置上，然后count-1，重复之前的操作,注意这个时候索引是从0开始的?
    public void heapSort3(int[] arr, int n){
        //heapify的过程
        for(int i = (n-1)/2;i>=0;i--){
            shiftDown(arr,n,i);
        }

        for(int i = n-1;i>0;i--){
            MaxHeap.swap(arr,0,i);
            shiftDown(arr,i,0);

        }



    }
}
