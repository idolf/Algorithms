package sorts;

// Time Complexity:
// all: O(n*logn)

// 时间复杂度
// 所有情况: O(n*logn)
public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    private static void merge(int []arr, int l, int m, int r) {
        int []result = new int[r - l + 1];
        int i = l, j = m + 1;
        int idx = 0;
        while (i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                result[idx++] = arr[i++];
            } else {
                result[idx++] = arr[j++];
            }
        }
        while (i <= m) {
            result[idx++] = arr[i++];
        }
        while (j <= r) {
            result[idx++] = arr[j++];
        }
        System.arraycopy(result, 0, arr, l, r - l + 1);
    }
}
