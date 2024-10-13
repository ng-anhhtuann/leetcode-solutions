class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for ( int val : nums ) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for ( int val : nums )
            if (map.getOrDefault(val, 0) == 2) {
                res[i] = val;
                i++;
                map.put(val, 0);
            }
        return res;
    }
}