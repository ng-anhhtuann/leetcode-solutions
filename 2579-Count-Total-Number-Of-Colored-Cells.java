class Solution {
    // public long coloredCells(int n) {
    // long res = n * 2 - 1;
    // int tmp = n * 2 - 3;
    // while (tmp > 0) {
    // res += tmp * 2;
    // tmp -= 2;
    // }
    // return res;
    // }

    public long coloredCells(int n) {
        return 1 + (long) 2 * n * (n - 1);
    }
}