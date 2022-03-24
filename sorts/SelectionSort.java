package sorts;

// Time Complexity:
// best: O(n) The array itself is ordered
// worst: O(n^2)
// average: O(n^2)

// 时间复杂度
// 最好: O(n) 数组本身有序时
// 最差: O(n^2)
// 平均: O(n^2)
public class SelectionSort {
    public static void selectionSort(int []arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int t = arr[min];
                arr[min] = arr[i];
                arr[i] = t;
            }
        }
    }
}
