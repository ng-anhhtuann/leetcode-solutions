class Solution {
    public boolean canArrange(int[] a, int k) {
        int n = a.length;
        boolean[] d = new boolean[n];
        int i = 0;
        while (i < n - 1) {
            if (!d[i]) {
                int j = n - 1;
                while (j >= 0) {
                    if (i != j && !d[j] && (a[i] + a[j]) % k == 0) {
                        d[i] = true;
                        d[j] = true;
                        break;
                    } else {
                        j--;
                    }
                }
                if (j < 0) return false;
            } else {
                i++;
            }
        }
        return true;
    }
}
