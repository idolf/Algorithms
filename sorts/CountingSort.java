package sorts;

// Time Complexity:
// all: O(n+k)

// 时间复杂度
// 所有情况: O(n+k)
public class CountingSort {
    public static void countingSort(int []arr) {
        int max = arr[getMax(arr)], min = arr[getMin(arr)], sorted = 0;
        int []count = new int[max - min + 1];
        int []res = new int[arr.length];
        for (int i : arr) {
            count[i - min]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                continue;
            }
            while (count[i] != 0) {
                res[sorted++] = i + min;
                count[i]--;
            }
        }
        System.arraycopy(res, 0, arr, 0, arr.length);
    }
    private static int getMin(int []arr) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[idx] > arr[i]) idx = i;
        }
        return idx;
    }
    private static int getMax(int []arr) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[idx] < arr[i]) idx = i;
        }
        return idx;
    }
}
