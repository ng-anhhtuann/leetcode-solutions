class Solution {
    public int countPairs(List<Integer> a, int t) {
        int n = a.size();
        int count = 0;
        for ( int i = 0; i < n-1; i++) {
            for ( int j = i+1 ; j < n; j++){
                if ( i < j && a.get(i) + a.get(j) < t ){
                    count++;
                }
            }
        }
        return count;
    }
}