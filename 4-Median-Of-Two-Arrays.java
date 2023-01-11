class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sizeM = nums1.length;
        int sizeN = nums2.length;
        int[] merged = mergeArrays(nums1, nums2);
        int len = merged.length;
        if (len % 2 == 1) {
            return (double) merged[len / 2];
        } else {
            return (double) (merged[len / 2] + merged[len / 2 - 1]) / 2;
        }
    }

    public static int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }
        return merged;
    }
}