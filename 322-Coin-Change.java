class Solution {
    public int coinChange(int[] a, int t) {
        int[] tmp = new int[t + 1];
        Arrays.fill(tmp, Integer.MAX_VALUE);
        tmp[0] = 0;
        for (int i = 1; i <= t; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] <= i && tmp[i-a[j]] != Integer.MAX_VALUE) {
                    tmp[i] = Math.min(tmp[i], tmp[i-a[j]] + 1);
                }
            }
        }
        return tmp[t] == Integer.MAX_VALUE ? -1 : tmp[t];
    }

}