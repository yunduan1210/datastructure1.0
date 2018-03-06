package com.yunduan.sort;

public class SelectSort {

    public void selectSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j])
                    swap(arr, i, j);
            }

        }
    }


    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void display(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "  ");
    }
}
