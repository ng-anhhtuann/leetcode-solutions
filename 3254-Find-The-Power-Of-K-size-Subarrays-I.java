class Solution {

    public int[] resultsArray(int[] a, int k) {
        int n = a.length;
        int[] res = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            boolean isSorted = true;

            for (int j = i; j < i + k - 1; j++) {
                if (a[j + 1] != a[j] + 1) {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted)
                res[i] = a[i + k - 1];
            else
                res[i] = -1;
        }

        return res;
    }
}