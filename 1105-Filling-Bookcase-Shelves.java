// class Solution {

//     public int minHeightShelves(int[][] a, int w) {
//         int[] g = new int[a.length + 1];

//         g[0] = 0;
//         g[1] = a[0][1];

//         for (int i = 2; i <= a.length; i++) {
//             int rm = w - a[i - 1][0];
//             int mxH = a[i - 1][1];
//             g[i] = a[i - 1][1] + g[i - 1];

//             int j = i - 1;
//             while (j > 0 && rm - a[j - 1][0] >= 0) {
//                 mxH = Math.max(mxH, a[j - 1][1]);
//                 rm -= a[j - 1][0];
//                 g[i] = Math.min(g[i], mxH + g[j - 1]);
//                 j--;
//             }
//         }

//         return g[a.length];
//     }
// }

class Solution {
    public int minHeightShelves(int[][] b, int w) {
        int[] d = new int[b.length + 1];
        d[b.length] = 0;
        for (int i = b.length - 1; i >= 0; i--) {
            int height = b[i][1];
            int width = b[i][0];
            d[i] = height + d[i + 1];
            for (int j = i + 1; j < b.length && (width+b[j][0] <= w); j++) {
                height = Math.max(height, b[j][1]);
                width += b[j][0];
                d[i] = Math.min(d[i], height + d[j+1]);
            }
        }
        return d[0];
    }
}