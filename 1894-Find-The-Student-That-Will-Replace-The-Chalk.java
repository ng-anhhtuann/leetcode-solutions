class Solution {
    public int chalkReplacer(int[] a, int k) {
        int n = a.length;
        long sum = 0;
        for (int i : a)
            sum += i;
        k %= sum;
        int idx = 0;
        while (k > 0) {
            if (k >= a[idx])
                k -= a[idx++];
            else
                break;
        }
        return idx;
    }
}