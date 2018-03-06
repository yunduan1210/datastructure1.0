package com.yunduan.test;

import com.yunduan.sort.HeapSort;
import com.yunduan.sort.InsertSort;
import com.yunduan.sort.MergeSort;
import com.yunduan.sort.SelectSort;

public class TestSort {
    //测试选择排序时间
    public void testSelectSort(String sortName,int n,int[] arr,SelectSort sort){
        double start = System.currentTimeMillis();
        sort.selectSort(arr, n);
        double end = System.currentTimeMillis();

        System.out.println(sortName+":"+((end-start)/1000)+"s");
    }

    //测试插入排序时间
    public void testInsertSort(String sortName,int n,int[] arr,InsertSort sort){
        double start = System.currentTimeMillis();
        sort.insertSort(arr, n);
        double end = System.currentTimeMillis();

        System.out.println(sortName+":"+((end-start)/1000)+"s");
    }

    //测试改进后的插入排序
    public void testInsertSort2(String sortName,int n,int[] arr,InsertSort sort){
        double start = System.currentTimeMillis();
        sort.insertSort2(arr, n);
        double end = System.currentTimeMillis();
        System.out.println(sortName+":"+((end-start)/1000)+"s");
    }

    //测试改进后的折半插入排序
    public void testInsertSort3(String sortName,int n,int[] arr,InsertSort sort){
        double start = System.currentTimeMillis();
        sort.insertSort3(arr, n);
        double end = System.currentTimeMillis();
        System.out.println(sortName+":"+((end-start)/1000)+"s");
    }

    //测试堆排序
    public void testHeapSort1(String sortName,int n,int[] arr,HeapSort sort){
        double start = System.currentTimeMillis();
        sort.heapSort1(arr,n);
        double end = System.currentTimeMillis();
        System.out.println(sortName+":"+((end-start)/1000)+"s");
    }

    //测试改进后的堆排序，从第一个非叶子节点开始插入，相当于省去了一半的节点
    public void testHeapSort2(String sortName,int n,int[] arr,HeapSort sort){
        double start = System.currentTimeMillis();
        sort.heapSort2(arr,n);
        double end = System.currentTimeMillis();
        System.out.println(sortName+":"+((end-start)/1000)+"s");
    }

    //测试改进后的堆排序，在空间范围为O（1）上进行操作，省去了new新的内存的时间
    public void testHeapSort3(String sortName,int n,int[] arr,HeapSort sort){
        double start = System.currentTimeMillis();
        sort.heapSort3(arr,n);
        double end = System.currentTimeMillis();
        System.out.println(sortName+":"+((end-start)/1000)+"s");
    }

    //归并排序
    public void testMergeSort(String sortName, int n, int[] arr, MergeSort sort){
        double start = System.currentTimeMillis();
        sort.mergeSort(arr,n);
        double end = System.currentTimeMillis();
        System.out.println(sortName+":"+((end-start)/1000)+"s");
    }

    public void testMergeSort1(String sortName,int n,int[] arr,MergeSort sort){
        double start =System.currentTimeMillis();
        sort.mergeSort1(arr,n);
        double end = System.currentTimeMillis();
        System.out.println(sortName+":"+((end-start)/1000)+"s");
    }

    public boolean isSort(int n,int[] arr){
        for(int i = 1;i<n;i++){
            if(arr[i-1]>arr[i])
                return false;
        }
        return true;
    }

}
