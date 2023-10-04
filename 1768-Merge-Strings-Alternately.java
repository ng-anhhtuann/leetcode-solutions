class Solution {
    public String mergeAlternately(String a, String b) {
        int m = a.length();
        int n = b.length();
        StringBuilder res = new StringBuilder();
        int i;
        for ( i = 0 ; i < m; i++ ){
            res.append(a.charAt(i));
            if (i < n){
                res.append(b.charAt(i));
            }
        }
        if ( n > m ){
            while ( i < n ){
                res.append(b.charAt(i));
                i++;
            }
        }
        return res.toString();
    }
}