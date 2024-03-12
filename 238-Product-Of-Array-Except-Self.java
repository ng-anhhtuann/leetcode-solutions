class Solution {
    // public int[] productExceptSelf(int[] a) {
    //     int n = a.length;
    //     int[] b = new int[n];
    //     for (int i = 0 ; i < n ; i++ ){
    //         int s = 1;
    //         for ( int j = 0 ; j < n ; j++ ){
    //             if ( i == j ) continue;
    //             s *= a[j];
    //         }
    //         b[i] = s;
    //     }
    //     return b;
    // }

    public int[] productExceptSelf(int[] a) {
        int n = a.length;
        int s = 1;
        int cnt = 0;
        for (int i : a ){
            if (i == 0) {
                cnt++;
            } else {
                s *= i;
            }
        }
        for (int i = 0 ; i < n ; i++ ) {
            a[i] = (a[i] == 0 && cnt == 1)
                ? s : (( a[i] == 0 && cnt > 1 ) || ( a[i] != 0 && cnt > 0))
                ? 0 : s / a[i];
        }
        return a;
    }
}