class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        long result = 0;
        int i = 0;
        // ignore white space
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        // get the positive point
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        // number builder
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = Character.getNumericValue(s.charAt(i));
            result = result * 10 + digit;
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) result * sign;
    }
}