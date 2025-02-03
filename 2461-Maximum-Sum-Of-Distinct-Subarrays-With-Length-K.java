class Solution {

    public long maximumSubarraySum(int[] a, int k) {
        long ans = 0, sum = 0;
        int l = 0, r = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while (r < a.length) {
            int tmp = a[r];
            int val = map.getOrDefault(tmp, -1);
            while (l <= val || r - l + 1 > k) {
                sum -= a[l];
                l++;
            }
            map.put(tmp, r);
            sum += a[r];
            if (r - l + 1 == k)
                ans = Math.max(ans, sum);
            r++;
        }
        return ans;
    }
}