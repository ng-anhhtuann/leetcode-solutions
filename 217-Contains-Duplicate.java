class Solution {
    public boolean containsDuplicate(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            if (set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
}