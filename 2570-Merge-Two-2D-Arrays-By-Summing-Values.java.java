class Solution {
    public int[][] mergeArrays(int[][] a, int[][] b) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int id = a[i][0];
            int val = a[i][1];
            map.put(id, map.getOrDefault(id, 0) + val);
        }
        for (int i = 0; i < b.length; i++) {
            int id = b[i][0];
            int val = b[i][1];
            map.put(id, map.getOrDefault(id, 0) + val);
        }
        int[][] tmp = new int[map.size()][2];
        int idx = 0;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            tmp[idx][0] = i.getKey();
            tmp[idx][1] = i.getval();
            idx++;
        }
        Arrays.sort(tmp, (a, b) -> a[0] - b[0]);
        return tmp;
    }
}
