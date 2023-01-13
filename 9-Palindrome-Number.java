class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x >= 0 && x < 10) {
            return true;
        }
        int reverseNum = reverse(x);
        if (reverseNum == x) {
            return true;
        } else {
            return false;
        }
    }

    public int reverse(int x) {
        int max = 2147483647;
        int min = -2147483648;
        if (x < min || x > max) {
            return 0;
        }
        int isBad = x < 0 ? -1 : 1;
        x = Math.abs(x);
        int res = 0;
        while (x != 0) {
            int last = x % 10;
            x /= 10;
            if (res > max / 10 || (res == max / 10 && last > 7))
                return 0;
            if (res < min / 10 || (res == min / 10 && last < -8))
                return 0;
            res = res * 10 + last;
        }
        res = res * isBad;
        if (res < min || res > max) {
            return 0;
        }
        return res;
    }
}