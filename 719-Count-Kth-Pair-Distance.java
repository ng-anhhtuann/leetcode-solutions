class Solution {
    public int smallestDistancePair(int[] a, int k) {
        Arrays.sort(a);
        int l = 0;
        int r = a[a.length - 1] - a[0];
        while (l < r) {
            int mid = l + (r - l) / 2;
            int count = countPairsWithSumMid(a, mid);
            if (count >= k) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    int countPairsWithSumMid(int[] a, int sum) {
        int count = 0;
        int left = 0;

        for (int right = 1; right < a.length; right++) {
            while (a[right] - a[left] > sum) {
                left++;
            }
            count += right - left;
        }
        return count;

    }
}