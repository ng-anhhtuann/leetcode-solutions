class Solution {
    public int pivotInteger(int n) {
        if ( n == 1 ) return n;
        int l = 1, r = n-1;
        int lSum = 0, rSum = n;
        while ( l <= r ){
// System.out.println("lSum = "+ lSum);
// System.out.println("rSum = "+ rSum);
// System.out.println("l = "+ l);
// System.out.println("r = "+ r);
            if (lSum == rSum && l == r) return l;
            if ( lSum <= rSum ){
                lSum += l;
                l++;
            }
            if ( lSum > rSum ){
                rSum += r;
                r--;
            }
// System.out.println("--------------------");
        }
        return -1;
    }
}