class Solution {

    public boolean primeSubOperation(int[] a) {
        int n = a.length;
        int max = findMax(a);

        int[] d = new int[max + 1];
        for (int i = 2; i < max + 1; i++) {
            if (isPrime(i))
                d[i] = i;
            else
                d[i] = d[i - 1];
        }

        for (int i = 0; i < n; i++) {
            int bound;
            if (i == 0)
                bound = a[0];
            else
                bound = a[i] - a[i - 1];

            if (bound <= 0)
                return false;

            int prev = d[bound - 1];

            a[i] -= prev;
        }
        return true;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    private int findMax(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i : a)
            max = Math.max(max, i);
        return max;
    }

}