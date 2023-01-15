class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return sum;
                }
                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}

// int n = num.length;
// int res = Integer.MAX_VALUE;
// for ( int i = 0; i < n - 2; i++ ){
// for ( int j = i+1; j < n - 1; j++ ){
// for ( int k = j+1; k < n; k++ ){
// int sum = num[i] + num[j] + num[k];
// int dist = Math.abs(sum-target);
// res = dist < Math.abs(res-target) ? sum : res;
// }
// }
// }
// return res;