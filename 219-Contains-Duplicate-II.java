class Solution{
    public boolean containsNearbyDuplicate(int[] a, int k) {
        int n = a.length;
        if (n == 1) return false;
        if (k >= n) {
            for (int j = 1; j < n; j++) {
                if (a[0] == a[j]) {
                    return true;
                }
            }
        } else {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (set.contains(a[i])) {
                    return true;
                }
                set.add(a[i]);
                if (set.size() > k) {
                    set.remove(a[i - k]);
                }
            }
        }
        return false;
    }
}

/**
 Slower approach
 */

// class Solution {
//     public boolean containsNearbyDuplicate(int[] a, int k) {
//         int n = a.length;
//         if ( n == 1 ) return false;
//         if ( k >= n ){
//             for ( int j = 1; j < n; j++){
//                 if ( a[0] == a[j] ) return true;
//             }
//         } else {
//             for ( int i = 0 ; i < n - 1 ; i++ ){
//                 int tmp = i+k >= n ? n-1 : i+k;
//                 for ( int j = i+1; j <= tmp; j++){
//                     if ( a[i] == a[j] ) return true;
//                 }
//             }
//         }
//         return false;
//     }
// }