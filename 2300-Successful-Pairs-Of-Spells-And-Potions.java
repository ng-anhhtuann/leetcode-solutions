class Solution {
    public int[] successfulPairs(int[] s, int[] p, long success) {
        Arrays.sort(p);
        TreeMap<Long, Integer> map = new TreeMap<>();
        map.put(Long.MAX_VALUE, p.length);
        for (int i = p.length - 1; i >= 0; i--) {
            map.put((long) p[i], i);
        }
        for (int i = 0; i < s.length; i++) {
            long need = (success + s[i] - 1) / s[i];
            s[i] = p.length - map.ceilingEntry(need).getValue();
        }
        return s;
    }
}