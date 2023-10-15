// class Solution {
//     public int findKthPositive(int[] a, int k) {
//         int n = a.length;
//         int res = 0;
//         int cnt = 0;
//         int cc = 0;
//         for ( int i = 0 ; i < k+n; i++){
//             if (cnt == k) return res;
//             if (cc == n){
//                 while (cnt != k){
//                     cnt++;
//                     res++;
//                 }
//                 return res;
//             }
//             int tmp = i+1;
//             if (a[cc] != tmp){
//                 res = tmp;
//                 cnt++;
//             } else {
//                 res = tmp;
//                 cc++;
//             }
//         }
//         return res;
//     }
// }

class Solution {
    public int findKthPositive(int[] a, int k) {
        int n = a.length;
        int l = 0, r = n;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] - m - 1 < k) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l + k;
    }
}
