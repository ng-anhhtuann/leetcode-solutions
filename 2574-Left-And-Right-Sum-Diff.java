class Solution {
    public int[] leftRigthDifference(int[] a) {
        int n = a.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] res = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            leftSum[i] = sum;
            sum += a[i];
        }
        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            rightSum[i] = sum;
            sum += a[i];
        }
        for (int i = 0; i < n; i++) {
            res[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return res;
    }
}