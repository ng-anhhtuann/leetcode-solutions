class Solution {

    public int maximumGain(String s, int x, int y) {
        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
            s = new StringBuilder(s).reverse().toString();
        }

        int a = 0, b = 0, res = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a') {
                a++;
            } else if (c == 'b') {
                if (a > 0) {
                    a--;
                    res += x;
                } else {
                    b++;
                }
            } else {
                res += Math.min(b, a) * y;
                a = b = 0;
            }
        }

        res += Math.min(b, a) * y;

        return res;
    }
}