class Solution {
    public int findPeakElement(int[] a) {
        int n = a.length;
        if (n == 1) return 0;
        if (n == 2) return Math.max(a[0],a[1]) == a[0] ? 0 : 1;
        for ( int i = 1; i < n-1; i++){
            if ( a[i] > a[i-1] && a[i] > a[i+1] ) return i;
        }
        return a[0] > a[1] ? 0 : a[n-1] > a[n-2] ? n-1 : 0;
    }
    
    public int findPeakElement(int[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] > a[m + 1]){
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}