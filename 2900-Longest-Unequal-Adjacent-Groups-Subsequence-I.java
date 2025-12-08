class Solution {
    public List<String> getLongestSubsequence(String[] w, int[] g) {
        List<String> r = new ArrayList<>();
        int n = w.length;
        for (int i = 0; i < n; i++)
            if (i == 0 || g[i] != g[i - 1])
                r.add(w[i]);
        return r;
    }
}