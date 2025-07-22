public class Solution {
    // public String largestGoodInteger(String s) {
    //     int n = s.length();
    //     int max = -1;
    //     for (int i = 2; i < n; i++) {
    //         if (s.charAt(i - 2) == s.charAt(i - 1)
    //                 && s.charAt(i - 1) == s.charAt(i)) {
    //             max = Math.max(max,
    //                     (s.charAt(i - 2) - '0') * 100 + (s.charAt(i - 1) - '0') * 10 + (s.charAt(i - 0) - '0'));
    //         }
    //     }
    //     return max == -1 ? "" : max == 0 ? "000" : String.valueOf(max);
    // }
    public String largestGoodInteger(String s) {
        String[] a = { "999", "888", "777", "666", "555", "444", "333", "222", "111", "000" };
        for (String i : a)
            if (s.contains(i))
                return i;
        return "";

    }
}{

}
