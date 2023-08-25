class Solution {
    public int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for ( int i = 0 ; i < nums.length/2; i++){
            res += Math.min(nums[i*2], nums[i*2+1]);
        }
        return res;
    }
}