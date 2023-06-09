class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int sz = s.length();
        if (sz == 0)
            return true;
        int n = sz / 2;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(sz - i - 1))
                return false;
        }
        return true;
    }
}