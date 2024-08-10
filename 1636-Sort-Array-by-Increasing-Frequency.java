class Solution {

    public int[] frequencySort(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] t = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            t[i] = a[i];
        }

        Arrays.sort(t, (m, n) -> {
            if (map.get(m).equals(map.get(n))) {
                return Integer.compare(n, m);
            }
            return Integer.compare(map.get(m), map.get(n));
        });

        for (int i = 0; i < a.length; i++) {
            a[i] = t[i];
        }

        return a;
    }
}