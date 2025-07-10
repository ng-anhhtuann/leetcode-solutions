class Solution {

    public int areaOfMaxDiagonal(int[][] a) {
        int maxD = 0;
        int maxA = 0;
        for (int[] i : a) {
            int l = i[0];
            int w = i[1];
            int ds = l * l + w * w;
            int ar = l * w;
            if (ds > maxD) {
                maxD = ds;
                maxA = ar;
            } else if (ds == maxD) {
                maxA = Math.max(maxA, ar);
            }
        }
        return maxA;
    }
}