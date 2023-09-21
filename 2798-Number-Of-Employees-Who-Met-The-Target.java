class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] a, int t) {
        int n = a.length;
        int count = 0;
        for ( int i : a ){
            if ( i >= t ) count++;
        }
        return count;
    }
}