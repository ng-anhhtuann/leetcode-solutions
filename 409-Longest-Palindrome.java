class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        if (n == 1)
            return n;
        int sum = 0;
        // int singleton = 0;
        int[] f = new int[58];
        boolean check = false;
        char[] c = s.toCharArray();
        for (char i : c)
            f[i - 'A']++;
        for (int i : f) {
            if (i != 0) {
                // singleton++;
                if (i % 2 == 1) {
                    if (!check) {
                        sum += i;
                        check = true;
                    } else {
                        sum += i - 1;
                    }
                } else {
                    sum += i;
                }
            }
        }
        return sum;
    }
}