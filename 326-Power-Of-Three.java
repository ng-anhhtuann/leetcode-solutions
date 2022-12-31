class Solution {
    public boolean isPowerOfThree(int n) {
        if ( n == 3 || n == 1) return true;
        if ( n > 1162261467 ) return false;
        int power = 1;
        for ( int i = 0 ; i < n/3; i++ ){
            if ( n == power ) return true;
            if ( n < power ) return false;
            power = power * 3;
        }
        return false;
    }
}