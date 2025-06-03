class Solution {

    public int maxIncreasingSubarrays(List<Integer> a) {
        int n = a.size();
        int curr = 1;
        int prev = 0;
        int d = 0;

        for (int i = 1; i < n; ++i) {
            if (a.get(i) > a.get(i - 1)) {
                ++curr;
            } else {
                prev = curr;
                curr = 1;
            }
            d = Math.max(d, Math.min(prev, curr));
            d = Math.max(d, curr / 2);
        }

        return d;
    }
}