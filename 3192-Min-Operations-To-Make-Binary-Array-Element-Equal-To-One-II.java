class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;
        boolean flip = false;

        for (int i = 0; i < nums.length; i++) {
            int currentBit = flip ? 1 - nums[i] : nums[i];

            if (currentBit == 0) {
                operations++;
                flip = !flip;
            }
        }

        return operations;
    }
}