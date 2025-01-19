class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        long res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] >= lower && nums[i] + nums[j] <= upper) {
                    res++;
                }
            }
        }
        return res;
    }
}