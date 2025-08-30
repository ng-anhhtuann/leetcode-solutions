public class Solution {
    public int maximumLength(int[] a) {
        int n = a.length;
        int maxOdd = 1;
        int maxEven = 1;
        int pivOdd = 0;
        int pivEven = 0;
        int countEven = 0;
        int countOdd = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] % 2 == 0)
                countEven++;
            else
                countOdd++;
            if ((a[i] + a[pivEven]) % 2 == 0) {
                maxEven++;
                pivEven = i;
            }
            if ((a[i] + a[pivOdd]) % 2 == 1) {
                maxOdd++;
                pivOdd = i;
            }
        }
        return Math.max(Math.max(countEven, countOdd), Math.max(maxEven, maxOdd));
    }
}{

}
