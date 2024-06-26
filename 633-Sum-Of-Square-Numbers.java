// // brute force
// class Solution {
//     public boolean judgeSquareSum(int c) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i * i <= c; i++) {
//             map.put(i * i, i);
//             if (map.containsKey(c - i * i))
//                 return true;
//         }
//         return false;
//     }
// }

// // map
// class Solution {
//     public boolean judgeSquareSum(int c) {
//         for (int i = 0; i * i <= c; i++) {
//             int rest = c - i * i;
//             for (int j = 0; j * j <= c; j++) {
//                 if (rest == j * j)
//                     return true;
//             }
//         }
//         return false;
//     }
// }

// // binary search
// class Solution {
//     public boolean judgeSquareSum(int c) {
//         for (long i = 0; i * i <= c; i++) {
//             int b = c - (int)(i * i);
//             if (binary_search(0, b, b))
//                 return true;
//         }
//         return false;
//     }
//     public static boolean binary_search(long l, long r, int n) {
//         if (l > r) return false;
//         long mid = l + (r - l) / 2;
//         if (mid * mid == n) return true;
//         if (mid * mid > n) return binary_search(l, mid - 1, n);
//         return binary_search(mid + 1, r, n);
//     }
// }

// modula
class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 2; i * i <= c; i++) {
            if (c % i == 0) {
                int count = 0;
                while (c % i == 0) {
                    count++;
                    c /= i;
                }
                if (i % 4 == 3 && count % 2 != 0)
                    return false;
            }
        }
        return c % 4 != 3;
    }
}