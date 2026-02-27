class Solution {
    public int minFlips(String s) {
        final int n = s.length();
        int[][] d = new int[2][2];

        for (int i = 0; i < n; ++i)
            ++d[s.charAt(i) - '0'][i % 2];

        int ans = Math.min(d[1][0] + d[0][1], d[0][0] + d[1][1]);

        for (int i = 0; i < n; ++i) {
            --d[s.charAt(i) - '0'][i % 2];
            ++d[s.charAt(i) - '0'][(n + i) % 2];
            ans = Math.min(ans, Math.min(d[1][0] + d[0][1], d[0][0] + d[1][1]));
        }

        return ans;

    }
}