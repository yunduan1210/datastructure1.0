import com.yunduan.helper.GenerateArray;
import com.yunduan.sort.HeapSort;
import com.yunduan.sort.InsertSort;
import com.yunduan.sort.MergeSort;
import com.yunduan.sort.SelectSort;
import com.yunduan.test.TestSort;

public class Main {

    public static void main(String[] args) {
        int n = 100000;
        GenerateArray generateArray = new GenerateArray();
        TestSort testSort = new TestSort();

        int[] testArrRandom = generateArray.generateRandomArray(n, 0, n);
        int[] testArrNearlyOrdered = generateArray.generateNearlyOrderedArray(n, 100);


        int[] testArrSelectSort = new int[n];

        int[] testArrInsertSort1 = new int[n];
        int[] testArrInsertSort2 = new int[n];
        int[] testArrInsertSort3 = new int[n];

        int[] testArrMergeSort = new int[n];
        int[] testArrMergeSort1 = new int[n];

        int[] testArrHeapSort1 = new int[n];
        int[] testArrHeapSort2 = new int[n];
        int[] testArrHeapSort3 = new int[n];



        testArrSelectSort = (int[]) testArrRandom.clone();

        testArrInsertSort1 = (int[]) testArrRandom.clone();
        testArrInsertSort2 = (int[]) testArrRandom.clone(); // 改进后的插入排序，主要对交换上面做简化，先比较，然后再插入值
        testArrInsertSort3 = (int[]) testArrRandom.clone(); // 改进比较次数，采用折半查找，折半插入排序

        testArrMergeSort = (int[]) testArrMergeSort.clone(); //归并排序
        testArrMergeSort1 = (int[]) testArrMergeSort1.clone(); //改进后的归并排序

        testArrHeapSort1 = (int[]) testArrRandom.clone();
        testArrHeapSort2 = (int[]) testArrRandom.clone();
        testArrHeapSort3 = (int[]) testArrRandom.clone();

        testSort.testSelectSort("SelectSort", n, testArrSelectSort, new SelectSort());
        System.out.println(testSort.isSort(n, testArrSelectSort));
        testSort.testInsertSort("InsertSort1", n, testArrInsertSort1, new InsertSort());
        System.out.println(testSort.isSort(n, testArrInsertSort1));
        testSort.testInsertSort2("InsertSort2", n, testArrInsertSort2, new InsertSort());
        System.out.println(testSort.isSort(n, testArrInsertSort2));
        testSort.testInsertSort3("InsertSort3", n, testArrInsertSort3, new InsertSort());
        System.out.println(testSort.isSort(n, testArrInsertSort3));
        testSort.testHeapSort1("HeapSort1", n, testArrHeapSort1, new HeapSort());
        System.out.println(testSort.isSort(n, testArrHeapSort1));
        testSort.testHeapSort2("HeapSort2", n, testArrHeapSort2, new HeapSort());
        System.out.println(testSort.isSort(n, testArrHeapSort2));
        testSort.testHeapSort3("HeapSort3", n, testArrHeapSort3, new HeapSort());
        System.out.println(testSort.isSort(n, testArrHeapSort3));

        testSort.testMergeSort("MergeSort",n,testArrMergeSort,new MergeSort());
        System.out.println(testSort.isSort(n,testArrMergeSort));
        testSort.testMergeSort1("MergeSort1",n,testArrMergeSort1,new MergeSort());
        System.out.println(testSort.isSort(n,testArrMergeSort1));

    }

}

