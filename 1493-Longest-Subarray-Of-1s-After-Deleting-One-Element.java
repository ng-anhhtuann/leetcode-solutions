class Solution {
    public int longestSubarray(int[] a) {
        int n = a.length;
        int max = 0;
        int count = 0;
        int maxSub = 0;
        int idx = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count++;
                prev = idx;
                idx = i;
            } else {
                maxSub++;
            }
            if (count > 1) {
                max = Math.max(max, maxSub);
                maxSub = idx - prev - 1;
                count = 1;
            }
        }
        return count == 0 ? Math.max(max, maxSub) - 1 : Math.max(max, maxSub);
    }
}