class Solution {
    public int minimumOperations(int[] a) {
        int n = a.length;
        if (n == 1)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int i = n - 1;
        while (i >= 0) {
            if (map.getOrDefault(a[i], 0) != 0)
                return i / 3 + 1;
            else
                map.put(a[i], 1);
            i--;
        }
        return 0;
    }
}