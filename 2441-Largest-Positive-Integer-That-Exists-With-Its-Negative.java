class Solution {
    public int findMaxK(int[] a) {
        int n = a.length;
        int max = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int pos = a[i] > 0 ? a[i] : a[i]*(-1);
            if (set.contains(a[i]*(-1))){
                max = max > pos ? max : pos;
            } else {
                set.add(a[i]);
            }
        }
        return max;
    }
}