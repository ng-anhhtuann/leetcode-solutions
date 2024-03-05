class Solution {
    public int numberOfMatches(int n) {
        int res = 0;
        while (n > 0 && n != 1){
            res += n/2;
            n = n - (n/2);
        }
        return res;
    }
}