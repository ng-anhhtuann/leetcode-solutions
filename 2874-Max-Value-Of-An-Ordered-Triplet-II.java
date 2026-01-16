class Solution {
    public long maximumTripletValue(int[] a) {
        int n = a.length;
        long mx = 0;
        int de = 0, re = 0;
        for (int i : a) {
            mx = Math.max(mx, (long) re * i);
            re = Math.max(re, de - i);
            de = Math.max(de, i);
        }
        return mx;
    }
}