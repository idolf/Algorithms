package sorts;

// Time Complexity:
// Average: O(n log n)
// Bad: O(n^2)

// 时间复杂度
// 平均: O(n log n)
// 最坏: O(n^2)
public class QuickSort {
    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static int partition(int[] arr, int l, int r) {
        int m = (l + r) / 2;
        int i = l, j = r;
        int pivot = arr[m];

        while (i < j) {
            while (i < j && arr[j] >= pivot) j--;
            while (i < j && arr[i] <= pivot) i++;
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, i, m);
        return i;
    }
    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = partition(arr, l, r);
            quickSort(arr, l, m - 1);
            quickSort(arr, m + 1, r);
        }
    }
}
