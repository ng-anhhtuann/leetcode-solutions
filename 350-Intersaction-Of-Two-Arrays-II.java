class Solution {
    public int[] intersect(int[] a, int[] b) {
        int m = a.length, n = b.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> lst = new ArrayList<>();

        for (int num : a)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int num : b) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                lst.add(num);
                map.put(num, count - 1);
            }
        }

        return lst.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
