class Solution {
    public boolean backspaceCompare(String a, String b) {
        int m = a.length();
        int n = b.length();
        if (m == 0 && n == 0)
            return true;
        if ((m == 0 && n != 0) || (n == 0 && m != 0))
            return false;
        a = change(a, m);
        b = change(b, n);
        return a.equals(b);
    }

    public String change(String a, int m) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (a.charAt(i) != '#') {
                sb.append(a.charAt(i));
            } else {
                if (sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        return sb.toString();
    }
}
