class Solution {
    public int findLHS(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();

        int max = 0;

        for (int num : a)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int key : map.keySet())
            if (map.containsKey(key + 1))
                max = Math.max(max, map.get(key) + map.get(key + 1));

        return max;
    }
}
