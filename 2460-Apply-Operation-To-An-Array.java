class Solution {

    // 1ms + 42mb memory beat 72% vs 75%
    public int[] applyOperations(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                a[i] = a[i] * 2;
                a[i + 1] = 0;
            }
        }
        moveZeroes(a);
        return a;
    }

    public void moveZeroes(int[] a) {
        int n = a.length;
        int count = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count++;
            } else {
                a[j] = a[i];
                j++;
            }
        }
        for (int i = 0; i < count; i++) {
            a[j] = 0;
            j++;
        }
    }

    // fastest way
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        while (j < n) {
            if (nums[j] != 0) {
                if (j > 0 && nums[j - 1] == nums[j]) {
                    nums[i - 1] *= 2;
                    nums[j] = 0;
                } else {
                    nums[i] = nums[j];
                    i++;
                }
            }
            j++;
        }
        while (i < n) {
            nums[i++] = 0;
        }
        return nums;
    }
}