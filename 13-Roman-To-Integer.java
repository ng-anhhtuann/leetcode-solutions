class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int val1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int val2 = value(s.charAt(i + 1));
                if (val1 >= val2) {
                    result += val1;
                } else {
                    result += val2 - val1;
                    i++;
                }
            } else {
                result += val1;
            }
        }
        return result;
    }

    private int value(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}