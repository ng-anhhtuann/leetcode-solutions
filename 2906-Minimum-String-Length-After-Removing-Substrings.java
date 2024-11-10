class Solution {
    // public int minLength(String s) {
    // int n = s.length();
    // int ab = s.indexOf("AB");
    // int cd = s.indexOf("CD");
    // while (ab >= 0 || cd >= 0) {
    // if (ab >= 0) {
    // if (ab == 0)
    // s = s.substring(2);
    // else {
    // String tmp = s;
    // s = s.substring(0, ab);
    // if (ab + 2 < tmp.length())
    // s = s.concat(tmp.substring(ab + 2));

    // }
    // }
    // cd = s.indexOf("CD");
    // if (cd >= 0) {
    // if (cd == 0)
    // s = s.substring(2);
    // else {
    // String tmp = s;
    // s = s.substring(0, cd);
    // if (cd + 2 < tmp.length())
    // s = s.concat(tmp.substring(cd + 2));

    // }
    // }
    // ab = s.indexOf("AB");
    // cd = s.indexOf("CD");
    // }
    // return s.length();
    // }
    public int minLength(String s) {
        char[] a = new char[s.length() + 1];
        int tail = -1;
        for (char c : s.toCharArray()) {
            if (tail > -1 && (c == 'B' && a[tail] == 'A' ||
                    c == 'D' && a[tail] == 'C')) {
                tail--;
            } else {
                tail++;
                a[tail] = c;
            }
        }
        return tail + 1;
    }
}