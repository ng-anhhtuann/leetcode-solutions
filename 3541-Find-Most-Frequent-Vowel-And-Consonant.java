public class Solution {
    public int maxFreqSum(String s) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        int[] f = new int[26];
        for (char i : cs)
            f[i - 'a']++;

        int mxVowel = 0;
        int mxConso = 0;
        for (int i = 0; i < 26; i++) {
            if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20) {
                mxVowel = Math.max(mxVowel, f[i]);
            } else {
                mxConso = Math.max(mxConso, f[i]);
            }
        }
        return mxConso + mxVowel;
    }
}{

}
