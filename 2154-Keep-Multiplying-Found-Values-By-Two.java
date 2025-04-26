class Solution {
    public int findFinalValue(int[] a, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i : a)
            set.add(i);
        while (set.contains(k))
            k *= 2;
        return k;
    }
}