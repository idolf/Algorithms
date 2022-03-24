package sorts;

// Time Complexity:
// best: O(n) The array itself is ordered
// worst: O(n^2)
// average: O(n^2)

// 时间复杂度
// 最好: O(n) 数组本身有序时
// 最差: O(n^2)
// 平均: O(n^2)
public class BubbleSort {
    public static void bubbleSort(int []arr) {
        int []result = new int[arr.length];
        int t;
        System.arraycopy(arr, 0, result, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
    }
}
