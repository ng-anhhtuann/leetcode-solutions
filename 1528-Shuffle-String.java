class Solution {
    public String restoreString(String s, int[] a) {
        int n = a.length;
        char[] c = new char[n];
        for ( int i = 0; i < n; i++ )
            c[a[i]] = s.charAt(i);
        return String.valueOf(c);
    }
}