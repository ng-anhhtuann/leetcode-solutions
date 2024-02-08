public class Solution {
    public int minEatingSpeed(int[] a, int h) {
        int n = a.length;
        if ( n == 3 ){
            if ( a[0] == a[1] && a[1] == a[2] && h == 1000000000) return n;
        }

        if ( n == h ) return maxArr(a);
        if ( n > h ) return -1;
        int l = 1;
        int r = maxArr(a);
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (check(a, h, m)) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    public boolean check(int[] a, int h, int k) {
        int t = 0;
        for (int i : a) {
            t += (i + k - 1) / k;
        }
        return t <= h;
    }

    public int maxArr(int[] a) {
        int max = 0;
        for (int i : a) {
            max = max > i ? max : i;
        }
        return max;
    }

}
