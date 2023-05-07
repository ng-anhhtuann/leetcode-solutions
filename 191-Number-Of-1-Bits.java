public class Solution {

    /**
     * Bit manupolating
     */
    public int hammingWeight(int n) {
        int count = 0;
        int tmp = n;
        if (n < 0)
            n += Integer.MAX_VALUE + 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return tmp < 0 ? count + 1 : count;
    }

    /**
     * Use string method
     */
    public int hammingWeight(int n) {
        String a = Integer.toBinaryString(n);
        a = a.replaceAll("0", "");
        return a.length();
    }
}