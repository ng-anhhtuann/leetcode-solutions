class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        int l = 0, r = n;

        while (!isPalinDrome(s.substring(l, r))) {
            r--;
        }

        StringBuilder sb = new StringBuilder(s.substring(r));

        return sb.reverse().append(s).toString();
    }

    private boolean isPalinDrome(String s) {

        int l = 0, r = s.length() - 1;

        while (l < r)
            if (s.charAt(l++) != s.charAt(r--)) return false;

        return true;
    }
}