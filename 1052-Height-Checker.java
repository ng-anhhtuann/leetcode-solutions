class Solution {
    public int heightChecker(int[] a) {
        int n = a.length;
        int[] s = new int[n];
        for ( int i = 0; i < n; i++){
            s[i] = a[i];
        }
        Arrays.sort(a);
        int count = 0;
        for ( int i = 0; i < n; i++){
            count = a[i] != s[i] ? count+1 : count;
        }
        return count;
    }
}