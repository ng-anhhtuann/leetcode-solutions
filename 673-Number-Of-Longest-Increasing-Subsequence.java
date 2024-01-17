class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length, max = 0;
        int[] len = new int[n];
        int[] cnt = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    if (len[j]+1 > len[i]) {
                        len[i] = len[j]+1;
                        cnt[i] = cnt[j];
                    }
                    else if (len[j]+1 == len[i]) {
                        cnt[i] += cnt[j];
                    }
                }
            }
            if (len[i] == 0) {
                len[i] = 1;
                cnt[i] = 1;
            }
            max = Math.max(max, len[i]);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (len[i] == max) {
                res += cnt[i];
            }
        }
        return res;
    }
}