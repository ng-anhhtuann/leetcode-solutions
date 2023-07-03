class Solution {
    public int numberOfArithmeticSlices(int[] a) {
        int size = a.length;
        if (size == 1){
            return 0;
        }
        int res = 0;
        int m = 0;
        int n = 1;
        int tmp = a[1] - a[0];
        while (n < size) {
            if (a[n] - a[n-1] == tmp) {
                n++;
            } else {
                int len = n - m;
                if (len >= 3) {
                    res += (len-2) * (len-1) / 2;
                }
                m = n-1;
                n = m+1;
                tmp = a[n] - a[m];
            }
        }
        if (n - m >= 3) {
            int len = n - m;
            res += (len-2) * (len-1) / 2;
        }
        return res;
    }
}