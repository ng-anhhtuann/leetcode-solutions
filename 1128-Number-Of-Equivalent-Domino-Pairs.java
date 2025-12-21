class Solution {
    public int numEquivDominoPairs(int[][] a) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int res = 0;
        for (int[] i : a) {
            int num = Math.min(i[0], i[1]) * 10 + Math.max(i[0], i[1]);
            int c = map.getOrDefault(num, 0);
            res += c;
            map.put(num, c + 1);
        }
        return res;
    }
}