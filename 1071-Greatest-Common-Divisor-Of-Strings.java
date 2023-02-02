class Solution {
    /**
     * Iterating through all possible substrings length from len to 1
     */
    public static String gcdOfStrings(String s, String t) {
        int m = s.length();
        int n = t.length();
        int len = Math.min(m, n);
        for (int i = len; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                String divisor = s.substring(0, i);
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                while (sb1.length() < m) {
                    sb1.append(divisor);
                }
                while (sb2.length() < n) {
                    sb2.append(divisor);
                }
                if (sb1.toString().equals(s) && sb2.toString().equals(t)) {
                    return divisor;
                }
            }
        }
        return "";
    }

    /**
     * Use gcd of length vs principle a+b = b+a (if they are multiple of substring)
     */
    public static String gcdOfStrings(String s, String t) {
        return ((s + t + "").equals(t + s + "")) ? s.substring(0, Math.gcd(s.length(), t.length())) : "";
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
