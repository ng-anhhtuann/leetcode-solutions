class Solution {
    /**
     * Swap fast solution
     */
    public int firstMissingPositive(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            while (a[i] > 0 && a[i] <= n && a[a[i] - 1] != a[i]) {
                int temp = a[a[i] - 1];
                a[a[i] - 1] = a[i];
                a[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    /**
     * Slow solution
     */
    public int firstMissingPositive(int[] a) {
        int n = a.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                set.add(a[i]);
            }
        }

        for (int i = 1; i <= n + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return n + 1;
    }
}