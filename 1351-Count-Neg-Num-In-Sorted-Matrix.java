class Solution {
    public int countNegatives(int[][] a) {
        int m = 0;
        for (int[] t : a) {
            for (int c : t) {
                if (c < 0)
                    m++;
            }
        }
        return m;
    }
}