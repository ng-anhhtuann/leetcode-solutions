class Solution {
    private static final char W = 'W';

    public int minimumRecolors(String b, int k) {
        int n = b.length();
        int countW = 0;
        int count = 0;
        int min = n;
        int pre = 0;
        char[] c = b.toCharArray();
        for (int i = 0; i < n; i++) {
            count++;
            if (c[i] == W)
                countW++;
            if (count == k) {
                min = Math.min(min, countW);
                if (c[pre] == W)
                    countW--;
                pre++;
                count--;
            }
        }
        return min;
    }
}