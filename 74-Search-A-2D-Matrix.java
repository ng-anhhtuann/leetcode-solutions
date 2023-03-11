class Solution {
    /**
     * O(m+n)
     */
    public boolean searchMatrix(int[][] a, int t) {
        int m = a[0].length;
        int n = a.length;
        int row = 0;
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            if (a[j][0] > t && a[i][0] < t) {
                row = i;
                break;
            }
            if (j == n - 1 && a[j][0] < t) {
                row = j;
                break;
            }
            if (a[j][0] == t || a[i][0] == t)
                return true;
        }
        for (int i = 0; i < m; i++) {
            if (a[row][i] == t)
                return true;
        }
        return false;
    }

    /**
     * O(log(mn)) but spend more space
     */
    public boolean searchMatrix(int[][] a, int t) {
        int m = a[0].length;
        int n = a.length;
        int l = 0, h = m * n - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (a[mid / m][mid % m] == t)
                return true;
            if (a[mid / m][mid % m] < t) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return false;
    }
}