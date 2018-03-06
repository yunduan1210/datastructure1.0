package com.yunduan.Heap;

import com.yunduan.sort.SelectSort;

public class MaxHeap {
    private int[] data;
    int count;
    int capacity;

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private void shiftUp(int k) {
        while (k > 1 && data[k] > data[k / 2]) {
            swap(data, k, k / 2);
            k = k / 2;
        }
    }

    private void shiftDown(int k) {
        while (2 * k <= count) {
            int j = 2 * k;
            if (j + 1 <= count && data[j + 1] > data[j]) {
                j = 2 * k + 1;
            }
            if (data[k] > data[j]) {
                break;
            }

            swap(data, k, j);
            k = j;
        }
    }

    private void shiftDown(int[] arr, int n) {
        int k = 0;
        while (count * 2 + 1 <= n) {
            int j = count * 2 + 1;
            if (arr[j] < arr[j + 1] && j + 1 <= count) {
                j = count * 2 + 2;
            }
            if (arr[j] < arr[k]) {
                break;
            }
            swap(arr, j, 0);
            k = j;
        }
    }

    public MaxHeap(int capacity) {
        data = new int[capacity + 1];
        count = 0;
        this.capacity = capacity;
    }

    public MaxHeap(int[] arr, int n) {
        data = new int[n + 1];
        for (int i = 0; i < n; i++) {
            data[i + 1] = arr[i];
        }
        count = n;

        for (int i = count / 2; i > 0; i--) {
            shiftDown(i);
        }
    }


    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void insert(int item) {
        if (count <= capacity) {
            data[count + 1] = item;
            count++;
            shiftUp(count);
        }
    }

    public int extractMax() {
        int ret = data[1];
        swap(data, 1, count);
        count--;
        shiftDown(1);
        return ret;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
