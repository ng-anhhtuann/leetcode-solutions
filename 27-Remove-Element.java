class Solution {
    // O(n)
    // public int removeElement(int[] a, int val) {
    // int count = 0;
    // for (int i = 0; i < a.length; i++) {
    // if (a[i] != val) {
    // a[count] = a[i];
    // count++;
    // }
    // }
    // return count;
    // }
    // O(1)
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    // public int removeElement(int[] nums, int val) {
    // int i = 0;
    // for (int j = 0; j < nums.length; j++) {
    // if (nums[j] != val) {
    // int temp = nums[i];
    // nums[i] = nums[j];
    // nums[j] = temp;
    // i++;
    // }
    // }
    // return i;
    // }

}