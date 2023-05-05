class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int pos = n - k;
        int posParent = pos - 1;
        for (int i = 0; i < k; i++) {
            int temp = nums[i];
            nums[i] = nums[pos];
            nums[pos] = temp;
            pos++;
        }
        for (int i = posParent; i < n - 1; i++) {
            int j = i + 1;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}