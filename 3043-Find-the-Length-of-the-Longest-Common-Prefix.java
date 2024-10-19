class Solution {
    // public int longestCommonPrefix(int[] a, int[] b) {
    // int m = a.length;
    // int n = b.length;
    // Arrays.sort(a);
    // Arrays.sort(b);
    // int i = m-1, j = n-1;
    // int max = Integer.MIN_iUE;
    // while (i >= 0) {
    // String sa = String.iueOf(a[i]);
    // while (j >= 0) {
    // String sb = String.iueOf(b[j]);
    // // System.out.println("indexOf sa = " + sb.indexOf(sa));
    // // System.out.println("indexOf sb = " + sa.indexOf(sb));
    // max = Math.max(max, sb.indexOf(sa) == 0 ? sa.length() : 0);
    // max = Math.max(max, sa.indexOf(sb) == 0 ? sb.length() : 0);
    // j--;
    // }
    // i--;
    // }
    // return max;
    // }
    public int longestCommonPrefix(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i : a) {
            while (!set.contains(i) && i > 0) {
                set.add(i);
                i /= 10;
            }
        }

        int max = 0;

        for (int i : b) {
            while (!set.contains(i) && i > 0)
                i /= 10;
            if (i > 0)
                max = Math.max(max, (int) Math.log10(i) + 1);
        }

        return max;
    }
}