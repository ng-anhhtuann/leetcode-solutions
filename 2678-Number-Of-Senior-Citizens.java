class Solution {
    public int countSeniors(String[] a) {
        int n = a.length;
        int count = 0;
        for ( int i = 0 ; i < n ; i++ ){
            String curr = a[i];
            int tmp = Integer.valueOf(curr.substring(11,13));
            if ( tmp > 60 ) count++;
        }
        return count;
    }
}