public class Solution {
    public int maximumUniqueSubarray(int[] a) {
        int n = a.length;
        Set<Integer> set = new HashSet<>();

        int max = 0;
        int start = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (set.contains(a[i])) {
                max = Math.max(sum, max);
                while (set.contains(a[i])) {
                    set.remove(a[start]);
                    sum -= a[start];
                    start++;
                }
            }
            set.add(a[i]);
            sum += a[i];
        }
        return Math.max(sum, max);
    }
}{

}
