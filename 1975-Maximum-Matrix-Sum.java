class Solution {
    public long maxMatrixSum(int[][] a) {
        long sum = 0;
        int countPos = 0;
        int minAbs = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum += Math.abs(a[i][j]);
                if (a[i][j] < 0)
                    countPos++;
                minAbs = Math.min(minAbs, Math.abs(a[i][j]));
            }
        }
        return countPos % 2 != 0 ? sum - minAbs * 2 : sum;
    }
}