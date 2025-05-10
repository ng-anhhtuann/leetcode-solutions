class Solution {
    public int countOperations(int a, int b) {
        int count = 0;
        while (Math.min(a, b) > 0) {
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }
            count += a / b;
            a %= b;
        }
        return count;
    }
}