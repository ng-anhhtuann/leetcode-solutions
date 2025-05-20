class Solution {
    public int totalMoney(int n) {
        int a = n / 7;
        int b = n % 7;
        int fixed = a * 28 + 7 * ((a - 1) * a / 2);
        int thisw = b * (b + 1) / 2 + a * b;
        return fixed + thisw;
    }
}