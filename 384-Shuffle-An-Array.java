import java.util.*;
class Solution {
    private int[] a;
    private Random rand;

    public Solution(int[] a) {
        this.a = a;
        this.rand = new Random();
    }
    public int[] reset() {
        return a;
    }
    public int[] shuffle() {
        int[] res = Arrays.copyOf(a, a.length);
        for (int i = 0; i < res.length; i++) {
            int j = rand.nextInt(res.length - i) + i;
            swap(res, i, j);
        }
        return res;
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
