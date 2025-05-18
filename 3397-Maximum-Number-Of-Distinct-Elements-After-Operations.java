class Solution {

    public int maxDistinctElements(int[] a, int k) {
        Arrays.sort(a);
        int d = 0;
        int prev = Integer.MIN_VALUE;
        for (int num : a) {
            int curr = Math.min(Math.max(num - k, prev + 1), num + k);
            if (curr > prev) {
                d++;
                prev = curr;
            }
        }
        return d;
    }
}