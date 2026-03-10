class Solution {
    // public int minimumArea(int[][] a) {
    // int m = a.length;
    // int n = a[0].length;

    // int mxR = 0;
    // int mxC = 0;
    // int mxRR = m;
    // int mxCC = n;

    // for (int i = 0; i < m; i++) {
    // for (int j = 0; j < n; j++) {
    // if (a[i][j] == 1) {
    // mxR = Math.max(mxR, i);
    // mxRR = Math.min(mxRR, i);
    // mxC = Math.max(mxC, j);
    // mxCC = Math.min(mxCC, j);
    // }
    // }
    // }
    // return (mxR - mxRR + 1) * (mxC - mxCC + 1);
    // }

    public int minimumArea(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int ri = 0, rl = 0, ci = 0, cl = 0;
        int flag = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    ri = i;
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                break;
        }
        flag = 0;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    rl = i;
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                break;
        }
        flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[j][i] == 1) {
                    ci = i;
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                break;
        }
        flag = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (a[j][i] == 1) {
                    cl = i;
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                break;
        }
        return (cl - ci + 1) * (rl - ri + 1);
    }
}