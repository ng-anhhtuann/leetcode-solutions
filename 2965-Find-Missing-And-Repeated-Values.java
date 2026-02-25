class Solution {
    public int[] findMissingAndRepeatedValues(int[][] a) {
        int n = a.length;
        int sum = 0;
        int[] t = new int[n * n + 1];
        int[] r = new int[2];
        for (int[] i : a) {
            for (int j : i) {
                sum += j;
                t[j]++;
                if (t[j] == 2)
                    r[0] = j;
            }
        }
        r[1] = (n * n * (n * n + 1) / 2) + r[0] - sum;
        return r;
    }
}