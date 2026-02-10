class Solution {

    public int[] closestPrimes(int l, int r) {
        int[] res = new int[] { -1, -1 };
        List<Integer> a = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 2 == 0 && i > 2)
                continue;
            if (isPrime(i)) {
                if (!a.isEmpty() && i <= a.get(a.size() - 1) + 2)
                    return new int[] { a.get(a.size() - 1), i };
                a.add(i);
            }
        }

        if (a.size() < 2)
            return new int[] { -1, -1 };

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < a.size(); i++) {
            int dst = a.get(i) - a.get(i - 1);
            if (dst < min) {
                min = dst;
                res = new int[] { a.get(i - 1), a.get(i) };
            }
        }

        return res;
    }

    public static boolean isPrime(int n) {
        int count = 0;
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                count++;
        if (count == 0)
            return true;
        return false;
    }
}