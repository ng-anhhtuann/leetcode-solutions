class Solution {
    public int[] sortByBits(int[] a) {
        for (int i = 0; i < a.length; i++)
            a[i] += Integer.bitCount(a[i]) * 10001;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++)
            a[i] = a[i] % 10001;
        return a;
    }
}