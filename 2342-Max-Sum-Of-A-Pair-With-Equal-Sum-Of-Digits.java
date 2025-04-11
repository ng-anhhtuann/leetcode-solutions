class Solution {
    public int maximumSum(int[] a) {
        int n = a.length;
        int res = -1;
        Arrays.sort(a);
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            int tmp = a[i];
            int sum = 0;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
            if (freq.get(sum) == 1)
                map.put(sum, a[i]);
            if (freq.get(sum) == 2) {
                map.put(sum, map.get(sum) + a[i]);
                res = Math.max(res, map.get(sum));
            }
        }
        return res;
    }
}