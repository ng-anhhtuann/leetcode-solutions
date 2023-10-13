class Solution {
    public int maximumWealth(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int res = 0;
        for ( int[] i : a){
            int tmp = 0;
            for ( int j : i){
                tmp += j;
            }
            res = res > tmp ? res : tmp;
        }
        return res;
    }
}