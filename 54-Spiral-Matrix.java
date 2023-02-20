class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> res = new ArrayList<>();
        if (a == null || a.length == 0) {
            return res;
        }
        int m = a.length;
        int n = a[0].length;
        int top = 0, bottom = m - 1, l = 0, r = n - 1;
        while (top <= bottom && l <= r) {
            for (int j = l; j <= r; j++) {
                res.add(a[top][j]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(a[i][r]);
            }
            r--;
            if (top <= bottom) {
                for (int j = r; j >= l; j--) {
                    res.add(a[bottom][j]);
                }
                bottom--;
            }
            if (l <= r) {
                for (int i = bottom; i >= top; i--) {
                    res.add(a[i][l]);
                }
                l++;
            }
        }
        return res;
    }
}
