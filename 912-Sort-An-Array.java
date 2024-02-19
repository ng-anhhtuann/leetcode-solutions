class Solution {
    public int[] sortArray(int[] a) {
        quicksort(a, 0, a.length - 1);
        return a;
    }

    private void quicksort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int left = low, right = high;
        int pivot = a[(left + right) / 2];
        while (left <= right) {
            while (a[left] < pivot) {
                left++;
            }
            while (a[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(a, left, right);
                left++;
                right--;
            }
        }
        quicksort(a, low, right);
        quicksort(a, left, high);
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
