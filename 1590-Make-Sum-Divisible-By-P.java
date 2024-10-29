class Solution {

    public int minSubarray(int[] a, int p) {
        int n = a.length;
        int sum = 0;

        for (int i : a) sum = (sum + i) % p;

        int rem = sum % p;
        if (rem == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int preSum = 0;
        int min = n;

        for (int i = 0; i < n; ++i) {
            preSum = (preSum + a[i]) % p;
            int tmp = (preSum - rem + p) % p;
            if (map.containsKey(tmp)) min = Math.min(min, i - map.get(tmp));
            map.put(preSum, i);
        }

        return min == n ? -1 : min;
    }
}