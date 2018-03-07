package com.yunduan.tree;

public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    //递归的二分查找法
    public int binarySearch1(int[] arr, int target, int l, int r) {
        if (l > r) {
            return -1;
        }
        int mid = (r + l) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch1(arr, target, mid + 1, r);
        } else {
            return binarySearch1(arr, target, l, mid - 1);
        }
    }


}
