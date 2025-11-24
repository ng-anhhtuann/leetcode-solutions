class Solution {
    public boolean isZeroArray(int[] a, int[][] q) {
        int[] d = new int[a.length + 1];
        for (int[] i : q) {
            d[i[0]] += 1;
            d[i[1] + 1] -= 1;
        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += d[i];
            d[i] = sum;
            if (d[i] < a[i])
                return false;
        }

        return true;
    }
}