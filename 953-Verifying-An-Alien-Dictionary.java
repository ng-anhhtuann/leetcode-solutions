class Solution {
    public boolean isAlienSorted(String[] w, String o) {
        int[] a = new int[26];
        for (int i = 0; i < o.length(); i++) {
            a[o.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < w.length; i++) {
            String s1 = w[i - 1];
            String s2 = w[i];
            int j = 0;
            while (j < s1.length() && j < s2.length()) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    if (a[s1.charAt(j) - 'a'] > a[s2.charAt(j) - 'a']) {
                        return false;
                    }
                    break;
                }
                j++;
            }
            if (j == s2.length() && s1.length() > s2.length()) {
                return false;
            }
        }
        return true;
    }
}