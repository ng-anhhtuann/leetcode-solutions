class Solution {
    public int[][] imageSmoother(int[][] r) {
        int m = r.length;
        int n = r[0].length;
        int[][] a = new int[m][n];
        if ( m == 1 && n == 1){
            return r;
        } else if ( m == 2 && n == 1){
            int both = (int) Math.floor( (r[0][0] + r[1][0]) / 2);
            r[0][0] = both; r[1][0] = both;
            return r;
        } else if ( m == 1 && n == 2){
            int both = (int) Math.floor( (r[0][0] + r[0][1]) / 2);
            r[0][0] = both; r[0][1] = both;
            return r;
        } else if ( m == 1 && n >= 3){
            a[0][0] = (int) Math.floor( (r[0][0] + r[0][1]) / 2);
            a[0][n-1] = (int) Math.floor( (r[0][n-1] + r[0][n-2]) / 2);
            for (int i = 1; i < n-1; i++) {
                a[0][i] =  (int) Math.floor( (r[0][i] + r[0][i+1] + r[0][i-1]) / 3);
            }
            return a;
        } else if ( m >= 3 && n == 1){
            a[0][0] = (int) Math.floor( (r[0][0] + r[1][0]) / 2);
            a[m-1][0] = (int) Math.floor( (r[m-1][0] + r[m-2][0]) / 2);
            for (int i = 1; i < m-1; i++) {
                a[i][0] =  (int) Math.floor( (r[i][0] + r[i+1][0] + r[i-1][0]) / 3);
            }
            return a;
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if ( i == 0 && j == 0){
                        double sum = r[i][j] + r[i][j+1] + r[i+1][j] + r[i+1][j+1];
                        a[i][j] = (int) Math.floor(sum/4);
                    } else if (i == m-1 && j == n-1){
                        double sum = r[i][j] + r[i][j-1] + r[i-1][j] + r[i-1][j-1];
                        a[i][j] = (int) Math.floor(sum/4);
                    } else if (i == m-1 && j == 0){
                        double sum = r[i][j] + r[i][j+1] + r[i-1][j] + r[i-1][j+1];
                        a[i][j] = (int) Math.floor(sum/4);
                    } else if (i == 0 && j == n-1 ){
                        double sum = r[i][j] + r[i][j-1] + r[i+1][j] + r[i+1][j-1];
                        a[i][j] = (int) Math.floor(sum/4);
                    } else if (i == 0){
                        double sum = r[i][j] + r[i][j-1] + r[i][j+1] + r[i+1][j] + r[i+1][j+1] + r[i+1][j-1];
                        a[i][j] = (int) Math.floor(sum/6);
                    } else if (i == m-1){
                        double sum = r[i][j] + r[i][j-1] + r[i][j+1] + r[i-1][j] + r[i-1][j+1] + r[i-1][j-1];
                        a[i][j] = (int) Math.floor(sum/6);
                    } else if (j == 0){
                        double sum = r[i][j] + r[i-1][j] + r[i+1][j] + r[i][j+1] + r[i+1][j+1] + r[i-1][j+1];
                        a[i][j] = (int) Math.floor(sum/6);
                    } else if ( j == n-1){
                        double sum = r[i][j] + r[i-1][j] + r[i+1][j] + r[i][j-1] + r[i+1][j-1] + r[i-1][j-1];
                        a[i][j] = (int) Math.floor(sum/6);
                    } else {
                        double sum = r[i][j] + r[i][j-1] + r[i][j+1] + r[i-1][j-1] + r[i-1][j] + r[i-1][j+1] + r[i+1][j-1] + r[i+1][j] + r[i+1][j+1];
                        a[i][j] = (int) Math.floor(sum/9);
                    }
                }
            }
            return a;
        }
    }
}

// class Solution {
//     public int[][] imageSmoother(int[][] r) {
//         int m = r.length;
//         int n = r[0].length;
//         int[][] a = new int[m][n];

//         if (m == 1 && n == 1) {
//             return r;
//         } else if (m == 2 && n == 1) {
//             smoother1D(r, a, 0);
//         } else if (m == 1 && n == 2) {
//             smoother1D(r, a, 1);
//         } else if (m == 1 && n >= 3) {
//             smoother1D(r, a, 2);
//         } else if (m >= 3 && n == 1) {
//             smoother1D(r, a, 3);
//         } else {
//             smoother2D(r, a);
//         }

//         return a;
//     }

//     private void smoother1D(int[][] r, int[][] a, int type) {
//         int m = r.length;
//         int n = r[0].length;

//         if (type == 0 || type == 3) {
//             int both = (int) Math.floor((r[0][0] + r[m - 1][0]) / 2);
//             for (int i = 0; i < m; i++) {
//                 a[i][0] = both;
//             }
//         } else if (type == 1 || type == 2) {
//             int sum1 = (int) Math.floor((r[0][0] + r[0][n - 1]) / 2);
//             int sum3 = (int) Math.floor((r[0][n - 1] + r[0][0]) / 2);
//             int sum2 = (int) Math.floor((r[0][0] + r[0][n - 1]) / 2);
//             a[0][0] = sum1;
//             a[0][n - 1] = sum3;
//             for (int i = 1; i < n - 1; i++) {
//                 a[0][i] = sum2;
//             }
//         }
//     }

//     private void smoother2D(int[][] r, int[][] a) {
//         int m = r.length;
//         int n = r[0].length;

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 int count = 0;
//                 double sum = 0;
//                 for (int x = Math.max(0, i - 1); x <= Math.min(m - 1, i + 1); x++) {
//                     for (int y = Math.max(0, j - 1); y <= Math.min(n - 1, j + 1); y++) {
//                         sum += r[x][y];
//                         count++;
//                     }
//                 }
//                 a[i][j] = (int) Math.floor(sum / count);
//             }
//         }
//     }
// }