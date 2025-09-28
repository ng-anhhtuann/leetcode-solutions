class Solution {
    public int[][] divideArray(int[] a, int k) {
        int n = a.length;
        Arrays.sort(a);
        int[][] d = new int[n / 3][3];
        int r = 0;

        for (int i = 0; i < n; i = i + 3) {
            if (a[i + 2] - a[i] > k)
                return new int[0][0];
            d[r][0] = a[i];
            d[r][1] = a[i + 1];
            d[r][2] = a[i + 2];
            r++;
        }
        return d;
    }
}