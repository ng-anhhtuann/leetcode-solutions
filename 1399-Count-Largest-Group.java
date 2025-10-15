class Solution {
    public int countLargestGroup(int n) {
        int[] d = new int[37];
        int maxLen = 0;
        int countMax = 0;
        for (int i = 1; i <= n; i++) {
            int sum = sumDigit(i);
            d[sum]++;
            if (d[sum] == maxLen)
                countMax++;
            if (d[sum] > maxLen) {
                countMax = 1;
                maxLen = d[sum];
            }
        }
        return countMax;
    }

    private int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}