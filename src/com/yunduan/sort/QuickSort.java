package com.yunduan.sort;

import java.util.Random;

public class QuickSort {

     public void quickSort(int[] arr,int n){
         __quickSort(arr,0,n-1);
     }

     //优化的快速排序
     public void quickSort1(int[] arr,int n){
         __quickSort1(arr,0,n-1);
     }

     private void __quickSort(int[] arr,int l,int r){
         if(l>=r) {
             return;
         }
         int p = __partition(arr,l,r);
         __quickSort(arr,l,p-1);
         __quickSort(arr,p+1,r);
     }

     //对arr[l,r]的部门进行partition操作
     //返回p,使得arr[l...p-1]<arr[p],arr[p]<arr[p+1,r]
     private int __partition(int[] arr,int l,int r){

         int v = arr[l];
         //arr[l+1...j]<arr[l] arr[j+1...i)>arr[l]
         int j = l;
         for(int i = l+1;i<=r;i++){
             if(arr[i]<v){
                 swap(arr,j+1,i);
                 j++;
             }
         }
         swap(arr,j,l);
         return j;
     }

     public void __quickSort1(int[] arr,int l,int r){

         int p = __partition2(arr,l,r);
         __quickSort1(arr,l,p-1);
         __quickSort1(arr,p+1,r);
     }

     //快速排序优化，几乎有序的数组会使得快速排序退化为O(n*n)
     private int __partition2(int[] arr,int l,int r){
         Random random = new Random();
         int a = random.nextInt((r-l)+1)+l;
         swap(arr,a,l);

         int v = arr[l];
         //arr[l+1...j]<arr[l] arr[j+1...i)>arr[l]
         int j = l;
         for(int i = l+1;i<=r;i++){
             if(arr[i]<v){
                 swap(arr,j+1,i);
                 j++;
             }
         }
         swap(arr,j,l);
         return j;
     }



    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
