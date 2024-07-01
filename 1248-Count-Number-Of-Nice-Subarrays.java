class Solution {
    public int numberOfSubarrays(int[] a, int k) {
        int n = a.length;
        int count = 0;
        int countSubArray = 0;
        int l = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1) {
                count++;
            }
            while (count > k) {
                if (a[l] % 2 == 1) {
                    count--;
                }
                l++;
            }
            int temp = l;
            int currentCount = count;
            while (currentCount == k) {
                countSubArray++;
                if (a[temp] % 2 == 1) {
                    currentCount--;
                }
                temp++;
            }
        }

        return countSubArray;
    }
}
