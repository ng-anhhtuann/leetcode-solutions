class Solution {
    private static final String g = "Gold Medal";
    private static final String s = "Silver Medal";
    private static final String b = "Bronze Medal";

    public String[] findRelativeRanks(int[] a) {
        int n = a.length;
        String[] res = new String[n];
        for ( int i = 0 ; i < n ; i++ ){
            int rank = 1;
            for (int j = 0 ; j < n; j++){
                if (a[i] > a[j] && i != j) rank++;
            }
            int title = n - rank + 1;
            if (title == 1){
                res[i] = g;
            } else if (title == 2){
                res[i] = s;
            } else if (title == 3){
                res[i] = b;
            } else {
                res[i] = String.valueOf(title);
            }
        }
        return res;
    }
}