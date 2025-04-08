class Solution {
    public long pickGifts(int[] a, int k) {
        int n = a.length;
        for (int i = 0; i < k; i++) {
            int[] res = findMax(a);
            int idx = res[1];
            int sqrt = (int) Math.sqrt(res[0]);
            a[idx] = sqrt;
        }
        return sum(a);
    }

    private int[] findMax(int[] a) {
        int max = 0;
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                idx = i;
            }
        }
        return new int[] { max, idx };
    }

    private long sum(int[] a) {
        long sum = 0;
        for (int i : a)
            sum += i;
        return sum;
    }
}

// 25 64 9 4 100
// - 25 64 9 4 10
// - 25 8 9 4 10
// - 5 8 9 4 10
// - 5 8 9 4 3