class Solution {

    public void sortColors(int[] a) {
        int n = a.length;
        int l = 0;
        int r = n - 1;
        int i = 0;

        while (i <= r) {
            if (a[i] == 0) {
                swap(a, i, l);
                l++;
                i++;
            } else if (a[i] == 2) {
                swap(a, i, r);
                r--;
            } else {
                i++;
            }
        }
    }

    public void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}