class Solution {
    /** 1107 / 1109 test case */
    // public boolean isPowerOfTwo(int n) {
    //     double logRes = Math.log(n) / Math.log(2);
    //     return Math.ceil(logRes) == Math.floor(logRes);
    // }

    /**AC */
    public boolean isPowerOfTwo(int n){
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

}