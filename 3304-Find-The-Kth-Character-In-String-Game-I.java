public class Solution {
    public char kthCharacter(int k) {
        String w = "a";
        while (w.length() < k) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < w.length(); i++) {
                char c = w.charAt(i);
                char d = (char) (((c - 'a' + 1) % 26) + 'a');
                res.append(d);
            }
            w += res;
        }
        return w.charAt(k - 1);
    }
}{

}
