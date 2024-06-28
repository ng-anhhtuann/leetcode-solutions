class Solution {
    public int minimumOperations(int[] a) {
        int cnt = 0;
        for ( int i : a){
            if (i % 3 != 0 ) cnt++;
        }
        return cnt;
    }
}