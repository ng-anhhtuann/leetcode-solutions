class Solution {

    public long countInterestingSubarrays(List<Integer> a, int mod, int k) {
        int n = a.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        long res = 0;
        int sum = 0;
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += a.get(i) % mod == k ? 1 : 0;
            res += map.getOrDefault((sum - k + mod) % mod, 0);
            map.put(sum % mod, map.getOrDefault(sum % mod, 0) + 1);
        }
        return res;
    }
}