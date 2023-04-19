class Solution {
    public int singleNumber(int[] a) {
        int n = a.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= a[i];
        }
        return res;
    }

    /**
     * Slow
     */
    public int singleNumber(int[] a) {
        int n = a.length;
        if (n == 1)
            return a[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            if (map.get(a[i]) == 2)
                map.remove(a[i]);
        }
        return map.keySet().iterator().next();
    }

    /**
     * Rapid slow
     */
    public int singleNumber(int[] a) {
        int n = a.length;
        if (n == 1)
            return a[0];
        List<Integer> key = new ArrayList<>();
        List<Integer> val = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (key.contains(a[i])) {
                int idx = key.indexOf(a[i]);
                val.set(idx, val.get(idx) + 1);
            } else {
                key.add(a[i]);
                val.add(1);
            }
        }
        int index = val.indexOf(1);
        return key.get(index);
    }
}