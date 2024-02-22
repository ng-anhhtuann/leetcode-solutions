class Solution {
    /** Approach
     First sum last minus
     */
    public int missingNumber(int[] a) {
        int n = a.length;
        int sum = n % 2 == 0 ? (n+1)*(n/2) : n*(n/2+1);
        for ( int i : a){
            sum -= i;
        }
        return sum;
    }

    /** Approach
     Minus and add inside
     */
     public int missingNumber(int[] a) {
         int n = a.length;
         int sum = n;
         for ( int i = 0 ; i < n ; i++){
             sum += i;
             sum -= a[i];
         }
         return sum;
     }
}