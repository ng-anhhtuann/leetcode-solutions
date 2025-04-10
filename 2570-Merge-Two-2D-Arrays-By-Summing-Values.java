import java.util.SortedMap;
import java.util.TreeMap;

class Solution {
    public int[][] mergeArrays(int[][] a, int[][] b) {
        SortedMap<Integer, Integer> map = new TreeMap<>();
        for (int[] d : a)
            map.put(d[0], map.getOrDefault(d[0], 0) + d[1]);
        for (int[] d : b)
            map.put(d[0], map.getOrDefault(d[0], 0) + d[1]);

        int[][] r = new int[map.size()][2];
        int idx = 0;
        for (int key : map.keySet()) {
            r[idx][0] = key;
            r[idx++][1] = map.get(key);
        }
        return r;
    }
}