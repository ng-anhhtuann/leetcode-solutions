class Solution {
    public int largestPerimeter(int[] a) {
        Arrays.sort(a);
        for (int i = a.length - 1; i > 1; --i)
            if (a[i] < a[i - 1] + a[i - 2])
                return a[i] + a[i - 1] + a[i - 2];
        return 0;
    }
}