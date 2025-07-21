// class Solution {
//     public boolean isPowerOfThree(int n) {
//         int a = 1162261467;
//         return n > 0 && a % n == 0;
//     }
// }
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        while (n % 3 == 0)
            n /= 3;
        if (n == 1)
            return true;
        return false;
    }
}