public class Solution {
    public int triangleNumber(int[] a) {
        int count = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < a.length - 1 && a[i] != 0; j++) {
                while (k < a.length && a[i] + a[j] > a[k])
                    k++;
                count += k - j - 1;
            }
        }
        return count;
    }
}