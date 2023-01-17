class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private static void backtrack(List<String> res, String s, int l, int r, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }
        if (l < n) {
            backtrack(res, s + "(", l + 1, r, n);
        }
        if (r < l) {
            backtrack(res, s + ")", l, r + 1, n);
        }
    }
}