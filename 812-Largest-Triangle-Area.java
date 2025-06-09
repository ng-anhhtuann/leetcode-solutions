class Solution {
    public double largestTriangleArea(int[][] a) {
        int n = a.length;
        double res = 0;
        for (int i = 0; i < n; ++i)
            for (int j = i + 1; j < n; ++j)
                for (int k = j + 1; k < n; ++k)
                    res = Math.max(res, area(a[i], a[j], a[k]));
        return res;
    }

    public double area(int[] a, int[] b, int[] c) {
        return 0.5 * Math.abs(a[0] * b[1] + b[0] * c[1] + c[0] * a[1]
                - a[1] * b[0] - b[1] * c[0] - c[1] * a[0]);
    }
}