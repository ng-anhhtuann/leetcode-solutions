class Solution {
    /**
     Finding ascend amount of number and add to the sum
     1ms
     O(n^2)
     */
     public int maxProfit(int[] a) {
         int n = a.length;
         int max = 0;
         int i = 0;
         while ( i < n ){
             int j = i+1;
             if ( j == n ) return max;
             int continous = a[i];
             while (  j < n && continous < a[j] ){
                 continous = a[j];
                 j++;
             }
             j--;
             max += a[j] - a[i];
             i = j+1;
         }
         return max;
     }

    /**
     Continous plus
     O(n)
     */
    public int maxProfit(int[] a) {
        int max = 0;
        int l = a[0];
        int n = a.length;
        for ( int i = 1; i < n; i++){
            if ( l < a[i] ) max += a[i] - l;
            l = a[i];
        }
        return max;
    }
}