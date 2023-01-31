class Solution {

    // O(nlogn)
    public int[] sortedSquares(int[] a) {
        int n = a.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = a[i] * a[i];
        }
        Arrays.sort(res);
        return res;
    }

    // O(n)
    // Compare abs of head vs tail, which greater then pass the square to the end
    // and decrease tracking spot k
    public int[] sortedSquares(int[] a) {
        int n = a.length;
        int[] res = new int[n];
        int i = 0, j = n - 1;
        int k = n - 1;
        while (i <= j) {
            if (Math.abs(a[i]) > Math.abs(a[j])) {
                res[k--] = a[i] * a[i];
                i++;
            } else {
                res[k--] = a[j] * a[j];
                j--;
            }
        }
        return res;
    }
}