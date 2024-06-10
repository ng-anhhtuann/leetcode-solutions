class Solution {
    int cnt = 0;
    public int countPrimeSetBits(int l, int r) {
        for (int i = l; i <= r; i++){
            cnt = isPrime(hiBit(i)) ? cnt+1 : cnt;
        }
        return cnt;
    }

    public static int hiBit(int n) {
        if (n == 1) return n;
        int s = 0;
        while (n > 0){
            s += n & 1;
            n = n >> 1;
        }
        return s;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}