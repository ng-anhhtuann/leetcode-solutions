class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = (n * (n + 1)) / 2;
        int a = n / m;
        return sum - a * (a + 1) * m;
    }
}