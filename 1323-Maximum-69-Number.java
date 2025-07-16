class Solution {
    public int maximum69Number(int n) {
        String s = String.valueOf(n);
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '6') {
                c[i] = '9';
                break;
            }
        }
        return Integer.valueOf(String.valueOf(c));
    }
}