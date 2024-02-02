class Solution {
    public int numSubarrayProductLessThanK(int[] a, int k) {
        if (k <= 1) return 0;
        int n = a.length;
        int l = 0;
        int res = 0;
        int tmp = 1;
        // System.out.println("k = " + k);
        // System.out.println("______________________________");
        for (int i = 0; i < n; i++) {
            tmp *= a[i];
            while (tmp >= k) tmp = tmp / a[l++];
            res += i - l + 1;
            // System.out.println("tmp = " + tmp);
            // System.out.println("l = " + l);
            // System.out.println("res = " + res);
            // System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        }
        return res;
    }
}
