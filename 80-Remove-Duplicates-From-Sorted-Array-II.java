class Solution {
    public int removeDuplicates(int[] a) {
        int n = a.length;
        if ( n <= 2 ) return n;
        int cnt = 0; int val = a[0]; int res = 0; int i = 0; int max = a[n-1];
        while (i < n) {
            if ( a[i] == max ) {
                if ( i+1 < n && a[i+1] == max ) {
                    res+=2;
                    return res;
                } else if ( i+1 == n ) {
                    return ++res;
                }
            }
            if ( a[i] < val ) return res;
            if (a[i] == val) {
                cnt++;
                if (cnt > 2) {
                    swap(a, i, n);
                } else {
                    i++; res++;
                }
            } else {
                res++; cnt = 1; val = a[i]; i++;
            }
        }
        return res;
    }

    private void swap(int[] a, int l, int n){
        for ( int i = l ; i < n-1 ; i ++){
            int tmp = a[i];
            a[i] = a[i+1];
            a[i+1] = tmp;
        }
    }
}