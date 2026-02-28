class Solution {
    public int countSubarrays(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i - 1] + a[i + 1] == a[i] / 2)
                    count++;
            } else {
                continue;
            }
        }
        return count;
    }
}
