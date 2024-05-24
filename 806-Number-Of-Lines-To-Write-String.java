class Solution {
    private static final int max = 100;
    int num = 1;
    int total = 0;
    public int[] numberOfLines(int[] a, String s) {
        int n = s.length();
        for ( int i = 0 ; i < n ; i++ ){
            int idx = s.charAt(i) - 'a';
            if (total + a[idx] > max) {
                num++;
                total = a[idx];
            } else {
                total += a[idx];
            }
        }
        return new int[]{num, total};
    }
}