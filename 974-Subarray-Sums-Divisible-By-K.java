class Solution {
    public int subarraysDivByK(int[] a, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;

        for (int num : a) {
            sum += num;
            int tmp = sum % k;
            if (tmp < 0)
                tmp += k;
            if (map.containsKey(tmp))
                count += map.get(tmp);
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }

        return count;
    }
}