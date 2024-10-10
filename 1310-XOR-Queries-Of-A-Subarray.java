class Solution {
    // public int[] xorQueries(int[] a, int[][] q) {
    //     int[] d = new int[q.length];
    //     for (int j = 0; j < q.length; j++) {
    //         int xorVal = a[q[j][0]];
    //         for (int k = q[j][0] + 1; k <= q[j][1]; k++)
    //             xorVal ^= a[k];
    //         d[j] = xorVal;
    //     }
    //     return d;
    // }

    public int[] xorQueries(int[] a, int[][] q) {
        int[] d = new int[a.length];
        d[0] = a[0];
        for (int i = 1; i < a.length; i++)
            d[i] = d[i - 1] ^ a[i];
        int[] res = new int[q.length];
        for (int i = 0; i < q.length; i++)
            res[i] = q[i][0] == 0 ? d[q[i][1]] : d[q[i][1]] ^ d[q[i][0] - 1];
        return res;
    }
}

// 1 3 4 8
// 1 2 6 14
//