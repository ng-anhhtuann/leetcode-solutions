class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        List<Boolean> ans = new ArrayList<>(c.length);
        int max = 0;
        for (int candy : c) {
            max = Math.max(candy, max);
        }
        for (int candy : c) {
            ans.add(candy + e >= max);
        }
        return ans;
    }
}