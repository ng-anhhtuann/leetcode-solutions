class Solution {

    public long minSum(int[] a, int[] b) {
        long sumA = 0, sumB = 0;
        long zA = 0, zB = 0;

        for (int i : a) {
            sumA += i;
            if (i == 0) {
                sumA++;
                zA++;
            }
        }

        for (int i : b) {
            sumB += i;
            if (i == 0) {
                sumB++;
                zB++;
            }
        }

        if ((zA == 0 && sumB > sumA) || (zB == 0 && sumA > sumB))
            return -1;

        return Math.max(sumA, sumB);
    }
}