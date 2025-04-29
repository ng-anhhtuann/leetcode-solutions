class Solution {
    public int maxSumDivThree(int[] a) {
        int[] d = new int[3];
        for (int i : a) {
            int[] t = d.clone();
            for (int j = 0; j < 3; j++) {
                int sum = t[j] + i;
                d[sum % 3] = Math.max(d[sum % 3], sum);
            }
        }
        return d[0];
    }
}