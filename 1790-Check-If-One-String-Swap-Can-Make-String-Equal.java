class Solution {
    public boolean areAlmostEqual(String a, String b) {
        int m = a.length();
        int n = b.length();
        if (m != n) {
            return false;
        }
        int l = -1, r = -1;
        for (int i = 0; i < m; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (l == -1) {
                    l = i;
                } else if (r == -1) {
                    r = i;
                } else {
                    return false;
                }
            }
        }
        if (l == -1 && r == -1) {
            return true;
        }
        if (l != -1 && r != -1) {
            return a.charAt(l) == b.charAt(r) && a.charAt(r) == b.charAt(l);
        }
        return false;
    }
}
