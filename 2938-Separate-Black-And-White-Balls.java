class Solution {
    public long minimumSteps(String s) {
        int latestZero = -1;
        char[] c = s.toCharArray();
        long count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '0') {
                if (latestZero == i - 1)
                    latestZero = i;
                else {
                    char tmp = c[latestZero + 1];
                    c[latestZero + 1] = c[i];
                    c[i] = tmp;
                    count += i - latestZero - 1;
                    latestZero++;
                }
            }
        }
        return count;
    }
}

// 010101001
// 001101001
// 001011001
// 000111001
// 000110101
// 000101101
// 000011101
// 000011011
// 000010111
// 000001111