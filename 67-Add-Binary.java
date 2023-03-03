import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger b1 = new BigInteger(a, 2);
        BigInteger b2 = new BigInteger(b, 2);
        BigInteger sum = b1.add(b2);
        return sum.toString(2);
    }

    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int m = a.length();
        int n = b.length();
        int i = m - 1;
        int j = n - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if (carry != 0) {
            res.append(carry);
        }
        return res.reverse().toString();
    }
}