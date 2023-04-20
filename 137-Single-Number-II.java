class Solution {
    public int singleNumber(int[] a) {
        int n = a.length;
        if (n == 1)
            return a[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            if (map.get(a[i]) == 3)
                map.remove(a[i]);
        }
        return map.keySet().iterator().next();
    }

    /**
     * Bit manipulating
     */
    public int singleNumber(int[] a) {
        int l = 0, r = 0;
        for (int i = 0; i < a.length; i++) {
            l = (l ^ a[i]) & ~r;
            r = (r ^ a[i]) & ~l;
        }
        return l;
    }
}