class Solution {
    public int numDecodings(String s) {
        int a = 1, b = 0, n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            int dp = s.charAt(i) == '0' ? 0 : a;
            if (i < n - 1 && (s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i + 1) < '7'))
                dp += b;
            b = a;
            a = dp;
        }
        return a;
    }
}