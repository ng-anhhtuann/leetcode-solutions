public class Solution {
    public int maxDifference(String s) {
        char[] c = s.toCharArray();
        int[] d = new int[27];
        for (char i : c) {
            d[i - 'a']++;
        }
        int ll = 1, cc = s.length();
        for (int a = 0; a < 27; a++) {
            if (d[a] != 0) {
                int i = d[a];
                if (i % 2 == 1)
                    ll = Math.max(ll, i);
                else
                    cc = Math.min(cc, i);
            }
        }
        return ll - cc;
    }
}{

}
