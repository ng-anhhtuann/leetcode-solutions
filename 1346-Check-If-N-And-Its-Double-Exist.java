class Solution {
    // public boolean checkIfExist(int[] arr) {
    // Map<Integer, Integer> map = new HashMap<>();
    // for (int i : arr)
    // map.put(i, map.getOrDefault(i, 0) + 1);
    // for (int i : arr) {
    // if (i != 0 && map.containsKey(2 * i))
    // return true;
    // if (i == 0 && map.get(i) > 1)
    // return true;
    // }
    // return false;
    // }

    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (final int a : arr) {
            if (set.contains(a * 2) || a % 2 == 0 && set.contains(a / 2))
                return true;
            set.add(a);
        }

        return false;
    }
}