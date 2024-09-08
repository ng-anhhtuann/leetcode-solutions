class Solution {
    public int minSteps(int n) {
        int res = 0;
        // count 2
        while (n % 2 == 0) {
            res += 2;
            n /= 2;
        }
        // count rest prime
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                res += i;
                n /= i;
            }
        }
        if (n > 2)
            res += n;

        return res;
    }
}