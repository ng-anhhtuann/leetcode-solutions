class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while ( n / 10 > 0 || n > 0){
            int tmp = n % 10;
            prod *= tmp;
            sum += tmp;
            n = n/10;
        }
        return prod - sum;
    }
}