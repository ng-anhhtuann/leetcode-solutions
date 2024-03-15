class Solution {
    public int minStartValue(int[] a) {
        int n = a.length;
        int sum = 0;
        int check = Integer.MAX_VALUE;
        for ( int i = 0 ; i < n ;i++){
            sum += a[i];
            check = check > sum ? sum : check;
        }
        if ( check > 1 ) return 1;
        return check < 0  ? check * (-1) + 1 : check;
    }
}