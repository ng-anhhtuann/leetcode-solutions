class Solution {
    public int maxCount(int[] a, int n, int mx) {
        int count = 0;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : a)
            set.add(num);
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i) && sum + i <= mx) {
                sum += i;
                count++;
            }
            if (sum + i > mx)
                return count;
        }
        return count;
    }
}