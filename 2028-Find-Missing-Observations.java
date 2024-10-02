class Solution {
    public int[] missingRolls(int[] a, int mean, int n) {
        int[] res = new int[n];

        int numberOfRoll = a.length;

        int originSum = 0;
        for (int i : a) originSum += i;

        int rem = (numberOfRoll + n) * mean - originSum;

        if (rem > 6 * n || rem < n)
            return new int[]{};

        int down = n;
        int setSum = 0;
        for (int i = 0; i < n; i++) {
            res[i] = rem / down--;
            rem -= res[i];
        }
        return res;
    }
}