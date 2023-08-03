class Solution {
    public int titleToNumber(String a) {
        int res = 0;
        int n = a.length();
        int mul = 26;
        for ( int i = n-1; i >= 0; i--){
            int tmp = a.charAt(i)-'A' + 1;
            if ( res == 0 ) {
                res += tmp;
            } else {
                res += tmp*mul;
                mul*=26;
            }
        }
        return res;
    }
}