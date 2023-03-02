class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (digits[n - 1] != 9) {
            digits[n - 1] += 1;
            return digits;
        } else {
            int num = 0;
            int ten = 1;
            for (int i = n - 1; i >= 0; i--) {
                num += digits[i] * ten;
                ten *= 10;
            }
            num += 1;
            int[] newDigits = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                newDigits[i] = num % 10;
                num /= 10;
            }
            return newDigits;
        }
    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }
}
