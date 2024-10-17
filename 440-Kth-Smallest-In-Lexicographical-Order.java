//class Solution {
//    public int findKthNumber(int n, int k) {
//        long num = 1;
//
//        for (int i = 1; i < k; i++) {
//            if (num * 10 <= n) {
//                num *= 10;
//            } else {
//                while (num % 10 == 9 || num >= n)
//                    num /= 10;
//                num++;
//            }
//        }
//        return (int) num;
//    }
//}

class Solution {

    public int findKthNumber(int n, int k) {
        return dq(n, 1, k);
    }

    private int dq(int n, long curr, int k) {
        if (k == 1)
            return (int) curr;

        int s = count(n, curr, curr + 1);

        return s < k ? dq(n, curr + 1, k - s) : dq(n, curr * 10, k - 1);
    }

    private int count(int n, long a, long b) {
        int s = 0;
        while (a <= n) {
            s += Math.min(n + 1, b) - a;
            a *= 10;
            b *= 10;
        }
        return s;
    }
}